package com.Shelf.demo.Controller;

import com.Shelf.demo.Dao.UserHomeDao;
import com.Shelf.demo.Domain.PlanInOut;
import com.Shelf.demo.Domain.UserRole;
import com.Shelf.demo.Util.RedisUtil;
import com.Shelf.demo.Util.ShelfLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Auther:ezRiel
 * Time:2020/6/5
 * for:主界面测试数据来源
 */
@RestController
@RequestMapping("/test")
//@CrossOrigin(origins = "*", maxAge = 3600)//暴露接口 解决跨域无法访问问题
//@Scope("prototype")
public class TestController {
    private static Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserHomeDao userHomeDao;

    @Autowired
    private RedisUtil redisUtil;

    private  int i=0;

    @RequestMapping(value = "/add")
    public void setValue(){
        System.out.println(++i);
    }
    @RequestMapping(value = "set")
    public void setValue1(){
        System.out.println(++i);
    }



    @RequestMapping("/getTreeNode")
    public List<Map> reTreeList(){
        List<Map> listNode=new ArrayList<>();
        Object object=redisUtil.has("tree");
        //先从redis查
        if(redisUtil.get("tree")!=null){
          listNode=(List<Map>) redisUtil.get("tree");
        }
        else {
            //如果缓存没有则查数据库
            List<PlanInOut> planOuts=userHomeDao.getPlanOut();
            for(PlanInOut planOut:planOuts){
                Map map=new HashMap();
                map.put("id",planOut.getId());
                map.put("name",planOut.getName());
                listNode.add(map);
            }
            //存入redis
            redisUtil.set("tree",listNode);
        }
        return listNode;
    }

    @RequestMapping("/getTreeData")
    public List<Double> getData(String id){
        if(redisUtil.has(id)){
            return (List<Double>) redisUtil.get(id);
        }
        else{
            PlanInOut planInOut=userHomeDao.getPlanOutData(id);
            redisUtil.set(id,planInOut.getVectorH96());
            return planInOut.getVectorH96();
        }
    }
    @RequestMapping("/getAllData")
    public Map getAllData(){
        Map map=new HashMap();
        map.put("data",userHomeDao.getPlanOut());
        map.put("code","0");
        map.put("count",userHomeDao.getPlanOut().size());
        return map;
    }

    /**
     * auther:ezRiel
     * date:2020/12/31
     * param:[args]
     * return:提供给vue界面的测试数据
     */
    @RequestMapping("/getVueData")
    public List<UserRole> getData(){
        return userHomeDao.getUsers("");
    }


    public static void main(String args[]){
        String a="";
        for(int i=0;i<24;i++){
            int p=00;
            for(int j=0;j<4;j++){
                if(i<10){
                    a= p==0 ? "0"+i+":"+"00":"0"+i+":"+p;
                    System.out.println(a);
                }
                else {
                    a= p==0 ? i+":"+"00":+i+":"+p;

                    System.out.println(a);
                }
                p=p+15;
          }
        }
    }

    /**
     * auther:ezRiel
     * date:2020/10/29
     * param:[]
     * return:void
     * 测试接口
     */
    @RequestMapping(value = "/de")
    public void testDelete(){
         userHomeDao.deletePlanOutData("20191011003");
//        log.info("测试aop....................");
//        log.info("上行代码删除操作");
//        redisUtil.putMap("20201105","a","add");
//        redisUtil.delKey("20201105");
    }


}
