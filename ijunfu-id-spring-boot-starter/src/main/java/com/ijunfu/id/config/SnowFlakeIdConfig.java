package com.ijunfu.id.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 *
 * title  : 雪花算法配置类
 * author : ijunfu <ijunfu@163.com>
 * date   : 2024/6/9 18:06
 * version: 1.0
 * motto  : 简洁的代码是智慧的结晶 卓越的编码是对复杂性的优雅征服
 *
 */
@Configuration
@ConfigurationProperties(prefix = "snowflake")
public class SnowFlakeIdConfig {

    /**
     * 是否启用
     */
    private Boolean enable;

    /**
     * 数据中心ID
     */
    private long datacenterId;

    /**
     * 机器ID
     */
    private long machineId;

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public long getDatacenterId() {
        return datacenterId;
    }

    public void setDatacenterId(long datacenterId) {
        this.datacenterId = datacenterId;
    }

    public long getMachineId() {
        return machineId;
    }

    public void setMachineId(long machineId) {
        this.machineId = machineId;
    }
}
