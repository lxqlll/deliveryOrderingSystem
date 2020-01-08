package com.lxqlll.service.impl;


import com.lxqlll.entity.Menu;
import com.lxqlll.mapper.MenuMapper;
import com.lxqlll.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 *
 *
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> findAllMenu(int index, int limit){
        return menuMapper.findAllMenu(index,limit);
    }

    @Override
    public int count() {
        return menuMapper.count();
    }

    @Override
    public Menu findByIdMenu(int id) {
        return menuMapper.findByIdMenu(id);
    }

    @Override
    public int saveMenu(Menu menu) {
        return menuMapper.saveMenu(menu);
    }

    @Override
    public int updateMenu(Menu menu) {
        return menuMapper.updateMenu(menu);
    }

    @Override
    public int removeMenu(int id) {
        return menuMapper.removeMenu(id);
    }
}
