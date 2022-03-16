package com.ivisionic.mybatisplus.pojo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("用户实体类")
@Data
public class User {
    @ApiModelProperty("序号")
    private Integer id;
    @ApiModelProperty("姓名")
    private String name;
    @ApiModelProperty("年龄")
    private Integer age;
    @ApiModelProperty("邮箱")
    private String email;
}
