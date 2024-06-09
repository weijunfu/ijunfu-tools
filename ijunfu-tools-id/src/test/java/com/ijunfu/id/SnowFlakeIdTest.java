package com.ijunfu.id;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * title  : 雪花算法测试类
 * author : ijunfu <ijunfu@163.com>
 * date   : 2024/6/9 16:24
 * version: 1.0
 * motto  : 简洁的代码是智慧的结晶 卓越的编码是对复杂性的优雅征服
 *
 */
class SnowFlakeIdTest {

    @Test
    void generate() {

        SnowFlakeId snowFlakeId = new SnowFlakeId(1, 1);

        long id = snowFlakeId.nextId();
        System.out.println(id);

        assertEquals(18, String.valueOf(id).length());
    }
}