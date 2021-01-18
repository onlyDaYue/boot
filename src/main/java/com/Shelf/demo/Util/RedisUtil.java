package com.Shelf.demo.Util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * Auther:ezRiel
 * Time:2020/11/4
 * for:
 */
@Component
public class RedisUtil {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    /**
     * 普通缓存放入
     * @param key 键
     * @param value 值
     * @return true成功 false失败
     */
    public boolean set(String key,Object value) {
        try {
            redisTemplate.opsForValue().set(key, value);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    /**
     * 普通缓存获取
     * @param key 键
     * @return 值
     */
    public Object get(String key){
        return key==null?null:redisTemplate.opsForValue().get(key);
    }

    /**
     * auther:ezRiel
     * date:2020/11/4
     * param:key
     * 判断是否存在
     */
    public Boolean has(String key){
        return redisTemplate.hasKey(key);
    }

    /**
     * auther:ezRiel
     * date:2020/11/5
     * param: map
     * 存放键值对
     */
    public void putMap(String key,Object hk,Object hv){
        redisTemplate.opsForHash().put(key,hk,hv);
    }

    /**
     * auther:ezRiel
     * date:2020/11/5
     * param: 唯一参数
     *
     */
    public Boolean delKey(String key){
        return redisTemplate.delete(key);
    }



}
