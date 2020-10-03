package com.Shelf.demo.Controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Auther:ezRiel
 * Time:2020/8/home
 * for:用户管理
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/home")
    public String getHome(String username, String password, Model model) {
        String message = "";
        Subject currentUser = SecurityUtils.getSubject();
        try{

//            currentUser.isAuthenticated();
            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            //退出
            if(username==null||username.equals("")){
                return "login";
            }
            currentUser.login(token);
        }catch (UnknownAccountException e) {
            message = "该账号不存在";
            model.addAttribute("msg", message);
            return "login";
        } catch (IncorrectCredentialsException e) {
            message = ("密码错误，请重试");
            model.addAttribute("msg", message);
            return "login";
        } catch (LockedAccountException e) {
            message = ("该账户已被锁定,请联系管理员");
            model.addAttribute("msg", message);
            return "login";
        } catch (Exception e) {
            message = ("登录失败");
            System.out.println(e);
            model.addAttribute("msg", "");
            return "login";
        }
             System.out.println(currentUser.hasRole("admin"));
            if(currentUser.isPermitted("user:select")){
//           if(currentUser.hasRole("admin")||currentUser.hasRole("general")){
                    return "home";
            }
            else {
                  model.addAttribute("msg","此用户无权限");
            }

        return "login";
    }
    @RequestMapping(value = "/login")
    public String getLogin(){
        return "login";
    }
    @RequestMapping(value = "/information")
    public String getInformations(){
        return "timeLine";
    }

}
