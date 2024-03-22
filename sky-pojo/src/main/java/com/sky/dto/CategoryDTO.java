package com.sky.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel("请求的分类数据模型")
public class CategoryDTO {

    private Long id;

    private Integer type;

    private String name;

    private Integer sort;
}
