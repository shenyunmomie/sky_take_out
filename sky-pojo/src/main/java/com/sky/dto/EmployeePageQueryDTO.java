package com.sky.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(description = "分页的员工数据")
public class EmployeePageQueryDTO implements Serializable {
    //姓名
    private String name;

    //页码
    private int page;

    //员工记录数
    private int pageSize;
}
