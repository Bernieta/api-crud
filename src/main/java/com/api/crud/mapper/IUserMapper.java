package com.api.crud.mapper;

import com.api.crud.dto.UserDTO;
import com.api.crud.entity.UserEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IUserMapper {

    UserEntity toUserEntity(UserDTO userDTO);

    UserDTO toUserDTO(UserEntity userEntity);

    List<UserDTO> toUserDTOList(List<UserEntity> userEntityList);
}
