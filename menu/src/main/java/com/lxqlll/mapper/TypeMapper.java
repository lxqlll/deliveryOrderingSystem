package com.lxqlll.mapper;

import com.lxqlll.entity.Type;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TypeMapper {
    Type findById(int id);
    List<Type> findAll();
}
