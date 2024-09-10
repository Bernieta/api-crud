package com.api.crud.mapper;

import com.api.crud.dto.UserDTO;
import com.api.crud.entity.UserEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IUserMapper {

    UserDTO toUserDTO(UserEntity userEntity);

//    @Mapping(target = "profile", ignore = true)
//    @Mapping(target = "tasks", ignore = true)
    UserEntity toUserEntity(UserDTO userDTO);

    List<UserDTO> toUserDTOList(List<UserEntity> userEntityList);
}
