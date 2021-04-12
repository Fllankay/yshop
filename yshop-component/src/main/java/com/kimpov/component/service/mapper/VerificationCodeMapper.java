package com.kimpov.component.service.mapper;


import com.kimpov.common.mapper.CoreMapper;
import com.kimpov.component.domain.VerificationCode;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface VerificationCodeMapper extends CoreMapper<VerificationCode> {

}
