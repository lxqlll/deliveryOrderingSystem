package com.lxqlll.service;

import com.lxqlll.entity.Menu;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 *
 *
 */
public interface MenuService {
    List<Menu> findAllMenu(int index,int limit);
    int count();
    Menu findByIdMenu(int id);
    int saveMenu(Menu menu);
    int updateMenu(Menu menu);
    int removeMenu(int id);
}
