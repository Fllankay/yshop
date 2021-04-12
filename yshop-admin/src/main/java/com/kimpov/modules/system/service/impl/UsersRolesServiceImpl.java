
package com.kimpov.modules.system.service.impl;

import com.kimpov.common.service.impl.BaseServiceImpl;
import com.kimpov.modules.system.service.UsersRolesService;
import com.kimpov.modules.system.service.dto.UsersRoles;
import com.kimpov.modules.system.service.mapper.UsersRolesMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @date 2020-05-16
 */
@Service
@AllArgsConstructor
//@CacheConfig(cacheNames = "usersRoles")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class UsersRolesServiceImpl extends BaseServiceImpl<UsersRolesMapper, UsersRoles> implements UsersRolesService {

}
