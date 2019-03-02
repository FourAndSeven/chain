package top.sponger.managerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.sponger.managerservice.feignService.fabric.FabricClientFeign;

@RestController
public class HiController {
   @Autowired
   FabricClientFeign fabricClientFeign;

   @GetMapping("hi")
   public String hi(){
       return fabricClientFeign.hi("manager");
   }
}
