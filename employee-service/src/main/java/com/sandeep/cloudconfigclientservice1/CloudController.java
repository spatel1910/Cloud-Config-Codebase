package com.sandeep.cloudconfigclientservice1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope

public class CloudController {
    @Autowired
    private ServiceConfiguration properties;


    @Value("${year}")
    private int year;
    @GetMapping("/environment")
    public String getPropertyVal(){

        return "Host "+properties.getHost()+" Port "+properties.getPort()+" Username "+
                properties.getUsername()+"  Password"+properties.getPassword()+"  year"+ year;
    }
}
