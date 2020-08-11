package com.chanchhaya.mybatis;

import com.chanchhaya.model.Category;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository {

    @Select("SELECT * FROM categories WHERE status = TRUE")
    List<Category> selectAll();

}
