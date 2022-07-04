package io.github.ctlove0523.mybatis.started.mapper;

import io.github.ctlove0523.mybatis.started.model.Category;

public interface CategoryMapper {

    Category selectCategory(int categoryId);
}
