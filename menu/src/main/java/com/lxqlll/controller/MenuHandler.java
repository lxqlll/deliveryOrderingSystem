package com.lxqlll.controller;


import com.lxqlll.entity.Menu;
import com.lxqlll.entity.MenuVo;
import com.lxqlll.entity.Type;
import com.lxqlll.service.MenuService;
import com.lxqlll.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/menu")
@RestController
public class MenuHandler {

    @Value("${server.port}")
        private String port;

    @Autowired
    private MenuService menuService;

    @Autowired
    private TypeService typeService;

    @RequestMapping("/index")
    public String index(){
        return "当前端口"+port;
    }

    @GetMapping("/queryMenu/{index}/{limit}")
    public MenuVo queryMenu(@PathVariable int index, @PathVariable int limit){
        return new MenuVo(0,"",menuService.count(),menuService.findAllMenu(index, limit));
    }

    @DeleteMapping("/deleteMenu/{id}")
    public int deleteMenu(@PathVariable int id){
        return menuService.removeMenu(id);
    }

    @PostMapping("/updateMenu")
    public int updateMenu(@RequestBody Menu menu){
        return menuService.updateMenu(menu);
    }

    @GetMapping("/findAllType")
    public List<Type> findAllType(){
        return typeService.findAll();
    }

    @PostMapping("/addMenu")
    public int addMenu(@RequestBody Menu menu){
        return menuService.saveMenu(menu);
    }

    @GetMapping("/findByIdMenu/{id}")
    public Menu findByIdMenu(@PathVariable int id){
        return menuService.findByIdMenu(id);
    }



}
