package com.limits.limitsservice;

import com.limits.limitsservice.bean.LimitisConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitisConfigurationController {

    @Autowired
    private Configuration configuration;
    @GetMapping("/limits")
    public LimitisConfiguration retriveLimitsFromConfiguration(){

        return new LimitisConfiguration(configuration.getMaximun(),configuration.getMinimun());
    }

}
