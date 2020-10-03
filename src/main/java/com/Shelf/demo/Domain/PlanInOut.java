package com.Shelf.demo.Domain;

import org.apache.ibatis.type.Alias;

/**
 * Auther:lvyue
 * Time:2020/2/7
 * for:返回电厂
 */
@Alias("planinout")
public class PlanInOut extends BasicBean<PlanInOut>{
    private String id,name,caseid,ctype;
    private Integer dtype;
    private Long sumBy;
    //96点和
    public Long getSumBy() {
        Double temp=0.0;
        if(getVectorH96().size()!=0){
            for(Double ele:getVectorH96()){
                temp=temp+ele;
            }
        }
        sumBy=Math.round(temp);
        return sumBy;
    }

    public void setSumBy(Long sumBy) {
        this.sumBy = sumBy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCaseid() {
        return caseid;
    }

    public void setCaseid(String caseid) {
        this.caseid = caseid;
    }

    public String getCtype() {
        return ctype;
    }

    public void setCtype(String ctype) {
        this.ctype = ctype;
    }

    public Integer getDtype() {
        return dtype;
    }

    public void setDtype(Integer dtype) {
        this.dtype = dtype;
    }

}
