package com.mxy.eurekafeignclient.eurekafeignclient;

import org.springframework.stereotype.Component;

@Component
public class HiHystrix implements EurekaClientFeign {
    @Override
    public String sayFromClientEureka(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
