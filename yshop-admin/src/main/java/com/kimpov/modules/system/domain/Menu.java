/**
 * Copyright (C) 2018-2020
 * All rights reserved, Designed By www.yixiang.co
 * 注意：
 * 本软件为www.yixiang.co开发研制
 */
package com.kimpov.modules.system.domain;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.kimpov.domain.BaseDomain;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author hupeng
 * @date 2020-05-14
 */
@Data
@TableName("menu")
public class Menu extends BaseDomain {

    /** ID */
    @TableId
    private Long id;


    /** 是否外链 */
    private Boolean iFrame;


    /** 菜单名称 */
    @NotBlank(message = "请填写菜单名称")
    private String name;


    /** 组件 */
    private String component;


    /** 上级菜单ID */
    @NotNull(message = "上级菜单ID不能为空")
    private Long pid;


    /** 排序 */
    @NotNull(message = "排序不能为空")
    private Long sort;


    /** 图标 */
    private String icon;


    /** 链接地址 */
    private String path;


    /** 缓存 */
    private Boolean cache;


    /** 是否隐藏 */
    private Boolean hidden;


    /** 组件名称 */
    private String componentName;



    /** 权限 */
    private String permission;


    /** 类型，目录、菜单、按钮 */
    private Integer type;


    public void copy(Menu source) {
        BeanUtil.copyProperties(source, this, CopyOptions.create().setIgnoreNullValue(true));
    }
}
