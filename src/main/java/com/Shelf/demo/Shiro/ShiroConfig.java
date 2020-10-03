package com.Shelf.demo.Shiro;
import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import org.apache.shiro.realm.text.IniRealm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.*;
import org.apache.shiro.mgt.SecurityManager;
import java.util.LinkedHashMap;

/**
 * Auther:ezRiel
 * Time:2020/8/home
 * for:shiro配置类
 *
 */
@Configuration
public class ShiroConfig {
    //将自己的验证方式加入容器
//    @Bean
//    public  MyShiroRealm myShiroRealm() {
//        MyShiroRealm customRealm = new MyShiroRealm();
//        return customRealm;
//    }
//    @Autowired
//    private MyShiroRealm myShiroRealm;

    //权限管理，配置主要是Realm的管理认证
    @Bean
    public  SecurityManager securityManager() {
        //加载自定义realm
//        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
//        securityManager.setRealm(myShiroRealm());
        DefaultWebSecurityManager securityManager=new DefaultWebSecurityManager();
        IniRealm iniRealm=new IniRealm("classpath:shiro.ini");
        securityManager.setRealm(iniRealm);
        return securityManager;
    }

    @Bean
    public  ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        LinkedHashMap<String, String> filterChainDefinitionMap = new LinkedHashMap<>();
//        filterChainDefinitionMap.put("/user/home", "perms");
//        filterChainDefinitionMap.put("/user/information", "perms");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        shiroFilterFactoryBean.setLoginUrl("/user/login");
        return shiroFilterFactoryBean;
    }
    /**
     * 启用shiro的thymeleaf标签
     * @return
     */
    @Bean(name = "shiroDialect")
    public  ShiroDialect shiroDialect(){
        return new ShiroDialect();
    }

//   /**
//    * auther:ezRiel
//    * date:2020/8/21
//    * param:
//    * return:
//    * 生命周期
//    */
//   @Bean
//   public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
//       return new LifecycleBeanPostProcessor();
//   }
//    @Bean
//    @DependsOn({"lifecycleBeanPostProcessor"})
//    public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator() {
//        // 设置代理类
//        DefaultAdvisorAutoProxyCreator creator = new DefaultAdvisorAutoProxyCreator();
//        creator.setProxyTargetClass(true);
//
//        return creator;
//    }
}
