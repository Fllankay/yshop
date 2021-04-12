
package com.kimpov.modules.system.service.mapper;

import com.kimpov.common.mapper.CoreMapper;
import com.kimpov.modules.system.service.dto.UsersRoles;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @date 2020-05-16
 */
@Repository
@Mapper
public interface UsersRolesMapper extends CoreMapper<UsersRoles> {

}
