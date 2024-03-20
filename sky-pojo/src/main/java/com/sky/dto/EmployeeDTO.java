package com.sky.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(description = "传递的员工数据模型")
public class EmployeeDTO {

    private Long id;

    private String username;

    private String name;

    private String phone;

    private String sex;

    private String idNumber;
}
