package com.Shelf.demo.Controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.SessionDAO;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Auther:ezRiel
 * Time:2020/8/home
 * for:用户管理
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private SessionDAO sessionDAO;

    @ExceptionHandler(AuthorizationException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public String handleException(AuthorizationException e, Model model) {
        // you could return a 404 here instead (this is how github handles 403, so the user does NOT know there is a
        // resource at that location)
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("status", HttpStatus.FORBIDDEN.value());
        map.put("message", e);
        model.addAttribute("msg", map);
        return "login";
    }
    @RequestMapping("/home")
    public String getHome(String username, String password, Model model) {
        String message = "";
        Subject currentUser = SecurityUtils.getSubject();
//        if(username==null||username.equals("")){
//            return "login";
//        }
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        token.setRememberMe(true);
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
                System.out.println(e);
                model.addAttribute("msg", message);
                return "login";
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
                    System.out.println(collection.contains(currentUser.getPrincipal()));
                    if(collection.contains(currentUser.getPrincipal())){
                        i=1;
                    }
                }
                    if(i==0){
                        currentUser.getSession().setAttribute(currentUser.getPrincipal(),"true");
                    }
                    else {
                        message = "此用户已登录";
                        model.addAttribute("msg", message);
                        return "login";
                    }
                    return "home";
            }
            else {
                  model.addAttribute("msg","此用户无权限");
            }
        //用户名
        Object name=currentUser.getPrincipal();
        return "home";
    }
    @RequestMapping(value = "/login")
    public String getLogin(){
        Subject subject=SecurityUtils.getSubject();
        subject.logout();;
        return "login";
    }
    @RequestMapping(value = "/information")
    @RequiresRoles("ROLE_1")
    public String getInformations(){
        return "timeLine";
    }

}
