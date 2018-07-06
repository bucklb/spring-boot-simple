package com.mkyong.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloMessageService {

    // Seems to work on basis that if value for nemo is found in app.properties use that
    // otherwise the second part (default) as the fallback
    @Value("${nemo:default}")
    private String defaultName;

    public String getMessage() {
        return getMessage(defaultName);
    }

    public String getMessage(String name) {
        return "Hello " + name;
    }
}
