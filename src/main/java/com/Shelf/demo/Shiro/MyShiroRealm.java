package com.Shelf.demo.Shiro;

import com.Shelf.demo.Dao.UserHomeDao;
import com.Shelf.demo.Domain.UserRole;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.realm.text.IniRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Auther:ezRiel
 * Time:2020/8/home
 * for:
 */
@Repository
public class MyShiroRealm extends AuthorizingRealm {

     @Autowired
     public UserHomeDao userHomeDao;

     private static UserHomeDao staticUserHomeDao;

    @PostConstruct
    public  void initDao(){
        staticUserHomeDao=userHomeDao;
    }
//    @Autowired
//    public void setUserHomeDao(UserHomeDao userHomeDao){
//        staticUserHomeDao=userHomeDao;
//    }

    public AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("授权***************");
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
//        simpleAuthorizationInfo.addRole("role1");
//        simpleAuthorizationInfo.addStringPermission("user:select");

        //获取当前用户
        UserRole name=(UserRole) principals.getPrimaryPrincipal();
        //获取当前用户数据信息
//        List<UserRole> list=userHomeDao.getUsers(name);
//        for(UserRole userRole:list){
//            simpleAuthorizationInfo.addRole(userRole.getRole());
//        }
          simpleAuthorizationInfo.addRole(name.getRole());
        //获取角色与权限信息 并写入SimpleAuthorizationInfo
//        String userName  = (String) principals.getPrimaryPrincipal();
//        if (userName == null) {
//            System.out.println("授权失败，用户信息为空！！！");
//            return null;
//        }
//        try {
//            //获取用户角色集  从数据库获取
//            Set<String> listRole= new HashSet();
//            listRole.add("管理员");
//            simpleAuthorizationInfo.addRoles(listRole);
//            //通过角色获取权限集
////            for (String role : listRole) {
//////                Set<String> permission= permissionService.findPermissionByRole(role);
////                //某个权限
////                simpleAuthorizationInfo.addStringPermissions(null);
////            }
//            Set<String> qx=new HashSet<>();
//            qx.add("home");
//            simpleAuthorizationInfo.addStringPermission("home");
//            return simpleAuthorizationInfo;
//        } catch (Exception e) {
//            System.out.println("授权失败，请检查系统内部错误!!!");
//        }
        return simpleAuthorizationInfo;
    }

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token){
        System.out.println("验证*****************");
        String user=(String) token.getPrincipal();
        //1.“abc”从数据库查询 对比
//        List<UserRole> list=userHomeDao.getUsers(user);
        List<UserRole> list=staticUserHomeDao.getUsers(user);

        if(list.size()==0){
            return null;
        }
        //获取此用户
        UserRole userRole=list.get(0);
        //2.如果findbyname("abc")为null 则return null
//        if(!user.equals("abc")){
//            return null;
//        }
        //并根据返回实体类获取密码
//        String password="123";
//        SimpleAuthenticationInfo simpleAuthenticationInfo=new SimpleAuthenticationInfo(user,password,this.getName());
        SimpleAuthenticationInfo simpleAuthenticationInfo=new SimpleAuthenticationInfo(userRole,userRole.getPassword(),this.getName());
        return simpleAuthenticationInfo;
    }



}
