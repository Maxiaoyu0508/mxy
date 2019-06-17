package com.mxy.eurekaribbonclient.eurekaribbonclient.Controller;

import com.mxy.eurekaribbonclient.eurekaribbonclient.Service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Service;

@RestController
public class RibbonController {
    @Autowired
    RibbonService ribbonService;
    @GetMapping("/hi")
    public String hi(@RequestParam(required = false,defaultValue = "mxy") String name){
        return ribbonService.hi(name);
    }

    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @GetMapping("/testRibbon")
    public String testRibbon(){
        ServiceInstance instance = loadBalancerClient.choose("eureka-client");
        return instance.getHost()+":"+instance.getPort();
    }
}
