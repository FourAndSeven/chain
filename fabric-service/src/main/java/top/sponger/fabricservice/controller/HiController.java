package top.sponger.fabricservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Value("${server.port}")
    String port;
    @GetMapping("/hi")
    public String hi(String name){
        return "hi"+name+"i am from port:"+port;
    }
    @GetMapping("/hi2")
    public String hi2(){
        return "hi i am from port:"+port;
    }
}
