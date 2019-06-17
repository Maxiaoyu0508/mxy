package com.mxy.eurekafeignclient.eurekafeignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client",configuration = FeignClient.class)
public interface EurekaClientFeign {
    @GetMapping
    String sayFromClientEureka(@RequestParam(value = "name")String name);
}
