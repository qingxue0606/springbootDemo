 package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.config.AmazonProperties;

/*@RunWith(SpringRunner.class)
@SpringBootTest*/


 public class ServiceTest extends SpringbootDemoApplicationTests {
    
     @Autowired
    private AmazonProperties amazonProperties;



    @Test
    public void testA() {
        System.out.println(amazonProperties.getAssociateId());
        
    }

}
