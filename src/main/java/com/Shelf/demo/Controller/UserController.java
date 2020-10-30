package com.Shelf.demo.Controller;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.SessionDAO;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;

/**
 * Auther:ezRiel
 * Time:2020/8/home
 * for:用户管理
 */

@Controller
@RequestMapping("/user")
public class UserController {

    private static Logger log = LoggerFactory.getLogger(UserController.class);


    @Autowired
    private SessionDAO sessionDAO;

    @RequestMapping("/home")
    public String getHome(String username, String password, Model model) {
        String message = "";
        Subject currentUser = SecurityUtils.getSubject();
//        if(username==null||username.equals("")){
//            return "login";
//        }
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        if (!currentUser.isAuthenticated()) {
            try {
                currentUser.login(token);
            } catch (UnknownAccountException e) {
                message = "该账号不存在";
                model.addAttribute("msg", message);
                return "login";
            }
            catch (IncorrectCredentialsException e) {
                message = ("密码错误，请重试");
                model.addAttribute("msg", message);
                return "login";
            } catch (LockedAccountException e) {
                message = ("该账户已被锁定,请联系管理员");
                model.addAttribute("msg", message);
                return "login";
            }
            catch (Exception e) {
                message = ("登录失败");
                model.addAttribute("msg", message);
                return "login";
            }
        }
        //已授权
        else {
            return "home";
        }
        int i=0;
        if(currentUser.isPermitted("user:select")){
                //多设备登录
                Collection<Session> sessions =  sessionDAO.getActiveSessions();
                for(Session session:sessions){
                    Collection<Object> collection=session.getAttributeKeys();
                    for(Object o:collection){
                    }
                    if(collection.contains(username)){
                        i=1;
                    }
                }
                    if(i==0){
                        currentUser.getSession().setAttribute(username,"true");
                    }
                    else {
                        message = "此用户已登录";
                        model.addAttribute("msg", message);
                        return "login";
                    }
            //用户名
            Object name=currentUser.getPrincipal();
                    return "home";
            }
            else {
                  model.addAttribute("msg","此用户无权限");
            }

        return "home";
    }
    @RequestMapping(value = "/login")
    public String getLogin(){
        Subject subject=SecurityUtils.getSubject();
        subject.logout();;
        log.debug("退出sesstion log");
        return "login";
    }
    @RequestMapping(value = "/information")
//    @RequiresRoles("ROLE_1")
    public String getInformations(){
        return "timeLine";
    }


}
