package com.lxqlll.feign;

import com.lxqlll.entity.Menu;
import com.lxqlll.entity.MenuVo;
import com.lxqlll.entity.Type;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@FeignClient(value = "menu")
public interface MenuFeign {

    @GetMapping("/menu/queryMenu/{index}/{limit}")
    MenuVo queryMenu(@PathVariable int index, @PathVariable int limit);

    @DeleteMapping("/menu/deleteMenu/{id}")
    int deleteMenu(@PathVariable int id);

    @GetMapping("/menu/findAllType")
    List<Type> findAllType();

    @PostMapping("/menu/addMenu")
    int addMenu(Menu menu);

    @PostMapping("/menu/updateMenu")
    int updateMenu(Menu menu);

    @GetMapping("menu/findByIdMenu/{id}")
    Menu findByIdMenu(@PathVariable int id);
}
