/**
 * Copyright (C) 2018-2020
 * All rights reserved, Designed By www.yixiang.co
 * 注意：
 * 本软件为www.yixiang.co开发研制
 */
package com.kimpov.modules.system.service.impl;

import com.kimpov.common.service.impl.BaseServiceImpl;
import com.kimpov.modules.system.domain.RolesMenus;
import com.kimpov.modules.system.service.RolesMenusService;
import com.kimpov.modules.system.service.mapper.RolesMenusMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author hupeng
 * @date 2020-05-16
 */
@Service
@AllArgsConstructor
//@CacheConfig(cacheNames = "rolesMenus")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class RolesMenusServiceImpl extends BaseServiceImpl<RolesMenusMapper, RolesMenus> implements RolesMenusService {

}
