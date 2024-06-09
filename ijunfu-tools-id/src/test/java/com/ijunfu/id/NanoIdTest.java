package com.ijunfu.id;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * title  : NanoId 测试类
 * author : ijunfu <ijunfu@163.com>
 * date   : 2024/6/9 16:19
 * version: 1.0
 * motto  : 简洁的代码是智慧的结晶 卓越的编码是对复杂性的优雅征服
 *
 */
class NanoIdTest {

    /**
     * @title  : 按照默认参数生成ID
     * @Param	:
     * @return : void
     * @author : ijunfu <ijunfu@163.com>
     * @date   : 2024/6/9 16:23
     * @version: 1.0
     * @motto  : 简洁的代码是智慧的结晶 卓越的编码是对复杂性的优雅征服
     */
    @Test
    void generate() {
        String id = NanoId.generate();
        System.out.println("NanoId=" + id);
        assertEquals(21, id.length());
    }

    /**
     * @title  : 指定生成的Id长度
     * @Param	:
     * @return : void
     * @author : ijunfu <ijunfu@163.com>
     * @date   : 2024/6/9 16:23
     * @version: 1.0
     * @motto  : 简洁的代码是智慧的结晶 卓越的编码是对复杂性的优雅征服
     */
    @Test
    void generateSize() {
        String id = NanoId.generate(10);
        System.out.println("NanoId=" + id);
        assertEquals(10, id.length());
    }

    /**
     * @title  : 指定生成ID的元素和长度
     * @Param	:
     * @return : void
     * @author : ijunfu <ijunfu@163.com>
     * @date   : 2024/6/9 16:23
     * @version: 1.0
     * @motto  : 简洁的代码是智慧的结晶 卓越的编码是对复杂性的优雅征服
     */
    @Test
    void generateAlphabet() {
        String id = NanoId.generate("abcdefghijklmnopqrstuvwxyz".toCharArray(), 10);
        System.out.println("NanoId=" + id);
        assertEquals(10, id.length());
    }
}