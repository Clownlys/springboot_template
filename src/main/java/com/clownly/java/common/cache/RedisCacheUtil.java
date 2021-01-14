package com.clownly.java.common.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author clownly
 * @create 2021-01-14 17:53
 */
@Component
public class RedisCacheUtil {

    /**
     * 直接注入静态变量会报NullPointerException异常
     * 解决方法：定义一个对应的非静态变量属性与之对应，使用init()方法来初始化两个静态变量
     * 使用@Postconstruct注解init()方法
     */
    private static StringRedisTemplate stringRedisTemplate;
    @Resource
    private StringRedisTemplate notStaticStringRedisTemplate;

    public static final long EXPIRE = 5;

    /**
     * @PostConstruct可以理解为在Spring实例化该Bean之后马上执行此方法，我们就用它来给静态变量注入
     */
    @PostConstruct
    public void init(){
        stringRedisTemplate = notStaticStringRedisTemplate;
    }

    /**
     * 永久缓存
     */
    public static void setRedisCache(String key, String value){
        stringRedisTemplate.opsForValue().set(key, value);
    }
    /**
     * 缓存一个带默认时间的redis
     */
    public static void setCacheWithDefaultTime(String key, String value){
        stringRedisTemplate.opsForValue().set(key, value, EXPIRE, TimeUnit.MINUTES);
    }
    /**
     * 自定义时间
     */
    public static void setCacheWithCustomerTime(String key, String value, long minutes){
        stringRedisTemplate.opsForValue().set(key, value, minutes, TimeUnit.MINUTES);
    }

    /**
     * 删除key
     */
    public static void delCache(String key) {
        stringRedisTemplate.delete(key);
    }
    /**
     * 获得Redis中的值
     */
    public static String getCache(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }



}
