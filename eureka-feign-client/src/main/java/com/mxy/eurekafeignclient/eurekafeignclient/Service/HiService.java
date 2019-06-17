package com.mxy.eurekafeignclient.eurekafeignclient.Service;


import com.mxy.eurekafeignclient.eurekafeignclient.EurekaClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HiService {
    @Autowired
    EurekaClientFeign eurekaClientFeign;
    public String sayHi(String name){
        return eurekaClientFeign.sayFromClientEureka(name);
    }
}
