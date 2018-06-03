package com.vip.selftest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.model.InitializationError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = { "classpath:META-INF/spring/spring-redis.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class RedisTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    RedisTemplate redisTemplate;
    @Test
    public void testString(){
        Boolean haha = redisTemplate.hasKey("haha");
        System.out.println(haha);
    }
}
