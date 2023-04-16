package com.example.actuator;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component
public class MyInfo implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        Map<String,Boolean> userDetails=new HashMap<>();
        userDetails.put("active",true);

    }

}
