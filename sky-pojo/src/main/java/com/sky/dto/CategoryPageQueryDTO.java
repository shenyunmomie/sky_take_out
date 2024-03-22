package com.sky.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;


import java.io.Serializable;

@Data
@ApiModel("分页的分类请求数据")
public class CategoryPageQueryDTO implements Serializable {

    //分类名称
    private String name;

    //页码
    private int page;

    //每页记录数
    private int pageSize;

    //分类类型 1菜品分类  2套餐分类
    private Integer type;
}
