 package com.example.demo.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author xiang
 * @date 2018/12/05
 */
@Component
public class FieldValueTestBean {
    @Value("#{systemProperties['user.language']}")
    private String defaultLocale;

    /**
     * @return the defaultLocale
     */
    public String getDefaultLocale() {
        return defaultLocale;
    }

    /**
     * @param defaultLocale the defaultLocale to set
     */
    public void setDefaultLocale(String defaultLocale) {
        this.defaultLocale = defaultLocale;
    }
    
}
