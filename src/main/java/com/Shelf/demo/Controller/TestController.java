package com.Shelf.demo.Controller;

import com.Shelf.demo.Dao.UserHomeDao;
import com.Shelf.demo.Domain.PlanInOut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
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
@Scope("prototype")
public class TestController {
    private static Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserHomeDao userHomeDao;

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
        List<PlanInOut> planOuts=userHomeDao.getPlanOut();
        for(PlanInOut planOut:planOuts){
            Map map=new HashMap();
            map.put("id",planOut.getId());
            map.put("name",planOut.getName());
            listNode.add(map);
        }
        return listNode;
    }

    @RequestMapping("/getTreeData")
    public List<Double> getData(String id){
       PlanInOut planInOut=userHomeDao.getPlanOutData(id);
       return planInOut.getVectorH96();
    }
    @RequestMapping("/getAllData")
    public Map getAllData(){
        Map map=new HashMap();
        map.put("data",userHomeDao.getPlanOut());
        map.put("code","0");
        map.put("count",userHomeDao.getPlanOut().size());
        return map;
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

    @RequestMapping(value = "/de")
    public void testDelete(){
//     userHomeDao.deletePlanOutData("20191011003");
        log.info("测试aop....................");
     log.info("上行代码删除操作");
    }


}
