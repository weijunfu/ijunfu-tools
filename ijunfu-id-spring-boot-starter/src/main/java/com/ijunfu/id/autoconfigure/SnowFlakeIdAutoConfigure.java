package com.ijunfu.id.autoconfigure;

import com.ijunfu.id.SnowFlakeId;
import com.ijunfu.id.config.SnowFlakeIdConfig;
import jakarta.annotation.Resource;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * title  : 雪花算法自动配置类
 * author : ijunfu <ijunfu@163.com>
 * date   : 2024/6/9 18:10
 * version: 1.0
 * motto  : 简洁的代码是智慧的结晶 卓越的编码是对复杂性的优雅征服
 *
 */
@Configuration
@ConditionalOnProperty(prefix = "snowflake", name = "enable", havingValue = "true")
@ComponentScan(basePackages = "com.ijunfu.id.config")
public class SnowFlakeIdAutoConfigure {

    @Resource
    private SnowFlakeIdConfig snowFlakeIdConfig;

    @Bean
    public SnowFlakeId snowFlakeId() {
        return new SnowFlakeId(snowFlakeIdConfig.getDatacenterId(), snowFlakeIdConfig.getMachineId());
    }
}
