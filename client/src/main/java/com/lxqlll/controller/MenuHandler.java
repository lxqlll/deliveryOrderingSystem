package com.lxqlll.controller;

import com.lxqlll.entity.Menu;
import com.lxqlll.entity.MenuVo;
import com.lxqlll.feign.MenuFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/menu")
public class MenuHandler {

    @Autowired
    private MenuFeign menuFeign;

    @GetMapping("/queryMenu")
    @ResponseBody
    public MenuVo queryMenu(@RequestParam("page") int page, @RequestParam("limit") int limit){
        int index = (page-1)*limit;
        return menuFeign.queryMenu(index, limit);
    }

    @GetMapping("/redirect/{location}")
    public String redirect(@PathVariable String location){
        return location;
    }

    @GetMapping("/deleteMenu/{id}")
    public String deleteMenu(@PathVariable int id){
        menuFeign.deleteMenu(id);
        return "redirect:/menu/redirect/index";
    }

    @GetMapping("/findTypes")
    public ModelAndView findTypes(ModelAndView modelAndView){
        modelAndView.setViewName("menu_add");
        modelAndView.addObject("list",menuFeign.findAllType());
        return  modelAndView;
    }

    @PostMapping("/addMenu")
    public String addMenu(Menu menu){
        if (menuFeign.addMenu(menu)>0){
            System.out.println("新增成功！");
        }else {
            System.out.println("新增失败！");
        }
        return "redirect:/menu/redirect/index";
    }

    @PostMapping("/updateMenu")
    int updateMenu(@RequestBody  Menu menu){
        return menuFeign.updateMenu(menu);
    }

    @GetMapping("/findByIdMenu/{id}")
    public ModelAndView findByIdMenu(@PathVariable int id,ModelAndView modelAndView){
        modelAndView.setViewName("menu_update");
        modelAndView.addObject("menu",menuFeign.findByIdMenu(id));
        modelAndView.addObject("list",menuFeign.findAllType());
        return modelAndView;
    }

}
