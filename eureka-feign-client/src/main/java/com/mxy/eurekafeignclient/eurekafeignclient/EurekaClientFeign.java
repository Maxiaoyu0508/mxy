package com.mxy.eurekafeignclient.eurekafeignclient;

import com.mxy.eurekafeignclient.eurekafeignclient.Config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client",configuration = FeignConfig.class)
public interface EurekaClientFeign {
    @GetMapping(value = "/hi")
    String sayFromClientEureka(@RequestParam(value = "name")String name);
}
