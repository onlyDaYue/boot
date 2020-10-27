package com.Shelf.demo.Controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.SessionDAO;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

/**
 * Auther:ezRiel
 * Time:2020/10/26
 * for:
 */
@Controller
public class LoginController {
    @Autowired
    private SessionDAO sessionDAO;
    @RequestMapping(value = "/")
    public String getLogin(){
        Subject subject= SecurityUtils.getSubject();
        subject.logout();;
        return "login";
    }
//    @RequestMapping("/user/login")
    public void Cheack(String username, String password, Model model) {
        String message = "";
        Subject currentUser = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        if (!currentUser.isAuthenticated()) {
            try {
                currentUser.login(token);
            } catch (UnknownAccountException e) {
                message = "该账号不存在";
                model.addAttribute("msg", message);
            }
            catch (IncorrectCredentialsException e) {
                message = ("密码错误，请重试");
                model.addAttribute("msg", message);
            } catch (LockedAccountException e) {
                message = ("该账户已被锁定,请联系管理员");
                model.addAttribute("msg", message);
            }
            catch (Exception e) {
                message = ("登录失败");
                System.out.println(e);
                model.addAttribute("msg", message);
            }
        }
        int i=0;
        if(currentUser.isPermitted("user:select")){
            //多设备登录
            Collection<Session> sessions =  sessionDAO.getActiveSessions();
            System.out.println("循环出所有sesstion的key");
            for(Session session:sessions){
                Collection<Object> collection=session.getAttributeKeys();
                for(Object o:collection){
                    System.out.println(o);
                }
                System.out.println("是否包含这个username");
                System.out.println(collection.contains(username));
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
            }
        }
        else {
            model.addAttribute("msg","此用户无权限");
        }
    }
}
