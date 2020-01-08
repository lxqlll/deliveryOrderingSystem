package com.lxqlll.service.impl;


import com.lxqlll.entity.Type;
import com.lxqlll.mapper.TypeMapper;
import com.lxqlll.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeMapper typeMapper;

    @Override
    public List<Type> findAll() {
        return typeMapper.findAll();
    }
}
