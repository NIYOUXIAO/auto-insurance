package com.yyds.service;
import com.yyds.entity.Menus;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Component
@FeignClient(value = "cloud-provider-menus",path = "/menus")
public interface MenusClientService {
    @RequestMapping("/getMenus")
    List<Menus> getMenus(@RequestParam("uid") int uid);

}
