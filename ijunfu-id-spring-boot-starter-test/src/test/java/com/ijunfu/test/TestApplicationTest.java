package com.ijunfu.test;

import com.ijunfu.id.SnowFlakeId;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * title  : 
 * author : ijunfu <ijunfu@163.com>
 * date   : 2024/6/9 19:28
 * version: 1.0
 * motto  : 简洁的代码是智慧的结晶 卓越的编码是对复杂性的优雅征服
 *
 */
@SpringBootTest
class TestApplicationTest {

    @Resource
    private ApplicationContext applicationContext;

    /**
     * @title  : 雪花算法ID自动配置测试 - 未配置或未启用
     * @Param	:
     * @return : void
     * @author : ijunfu <ijunfu@163.com>
     * @date   : 2024/6/9 19:36
     * @version: 1.0
     * @motto  : 简洁的代码是智慧的结晶 卓越的编码是对复杂性的优雅征服
     */
    @Test
    void notEnable() {
        boolean existSnowFlakeId = applicationContext.containsBean("snowFlakeId");

        assertEquals(false, existSnowFlakeId);
    }

    /**
     * @title  : 雪花算法ID自动配置测试 - 已配置并启用
     * @Param	:
     * @return : void
     * @author : ijunfu <ijunfu@163.com>
     * @date   : 2024/6/9 19:43
     * @version: 1.0
     * @motto  : 简洁的代码是智慧的结晶 卓越的编码是对复杂性的优雅征服
     */
    @Test
    void enable() {
        boolean existSnowFlakeId = applicationContext.containsBean("snowFlakeId");

        assertEquals(true, existSnowFlakeId);
    }

    /**
     * @title  : 生成id
     * @Param	: snowFlakeId
     * @return : void
     * @author : ijunfu <ijunfu@163.com>
     * @date   : 2024/6/9 19:43
     * @version: 1.0
     * @motto  : 简洁的代码是智慧的结晶 卓越的编码是对复杂性的优雅征服
     */
    @Test
    void id(@Autowired SnowFlakeId snowFlakeId) {
        System.out.println(snowFlakeId.nextId());
    }
}