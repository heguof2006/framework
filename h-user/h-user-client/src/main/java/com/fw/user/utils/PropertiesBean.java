package com.fw.user.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 读取配置文件, 在控制层类中加入
 * @EnableConfigurationProperties({PropertiesBean.class})
 * @Autowaired PropertiesBean propertiesBean使用
 */
//@Configuration
//@PropertySource(value = "classpath:properties/application-test.properties")
//@ConfigurationProperties(prefix = "my")
public class PropertiesBean {
    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
