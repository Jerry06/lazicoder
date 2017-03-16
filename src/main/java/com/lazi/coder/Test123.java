package com.lazi.coder;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//@ConfigurationProperties(value = "viet", locations = {"classpath:application1.yaml"})
@Configuration
public class Test123 {

    private int child1;

    public int getChild1() {
        return child1;
    }

    public void setChild1(int child1) {
        this.child1 = child1;
    }


}