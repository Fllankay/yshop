
package com.kimpov.modules.system.service.mapper;

import com.kimpov.common.mapper.CoreMapper;
import com.kimpov.modules.system.domain.UserAvatar;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @date 2020-05-14
 */
@Repository
@Mapper
public interface UserAvatarMapper extends CoreMapper<UserAvatar> {

}
