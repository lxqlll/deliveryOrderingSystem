package com.lxqlll.mapper;


import com.lxqlll.entity.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MenuMapper {
    List<Menu> findAllMenu(int index,int limit);
    int count();
    Menu findByIdMenu(int id);
    int saveMenu(Menu menu);
    int updateMenu(Menu menu);
    int removeMenu(int id);
}
