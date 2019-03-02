package top.sponger.managerservice.feignService.fabric;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "fabric-service")
public interface FabricClientFeign {
    @GetMapping("/hi")
    String hi(@RequestParam(value = "name") String name);
}
