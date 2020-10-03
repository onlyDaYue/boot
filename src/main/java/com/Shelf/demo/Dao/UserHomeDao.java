package com.Shelf.demo.Dao;

import com.Shelf.demo.Domain.PlanInOut;
import com.Shelf.demo.Domain.UserRole;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository//如果不加则注入会红线但不影响运行
public interface UserHomeDao {
    public List<PlanInOut> getPlanOut();
    public PlanInOut getPlanOutData(String id);
    public List<UserRole> getUsers(String name);
}
