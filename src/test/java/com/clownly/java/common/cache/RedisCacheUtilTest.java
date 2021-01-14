package com.clownly.java.common.cache;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author clownly
 * @create 2021-01-14 20:32
 */
@SpringBootTest
class RedisCacheUtilTest {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 使用StringRedisTemplate实例
     */
    @Test
    public void test(){
        //操作键值对
        stringRedisTemplate.boundValueOps("啦啦啦").set("50");
        stringRedisTemplate.opsForValue().set("lalala","20");
        //操作hash类型
//        stringRedisTemplate.boundHashOps();
//        stringRedisTemplate.opsForHash().put();
        //操作数组
//        stringRedisTemplate.boundListOps();
//        stringRedisTemplate.opsForList().leftPop();
        //操作集合
//        stringRedisTemplate.boundSetOps();
//        stringRedisTemplate.opsForSet().add();

        //操作有序集合
//        stringRedisTemplate.boundZSetOps();
//        stringRedisTemplate.opsForZSet().add();

    }

    /**
     * 使用RedisCacheUtil工具类封装好的set方法
     */
    @Test
    public void demo2(){
        RedisCacheUtil.setRedisCache("测试RedisCacheUtil","444");

    }

}