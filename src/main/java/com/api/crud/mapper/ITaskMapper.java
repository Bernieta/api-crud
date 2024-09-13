package com.api.crud.mapper;

import com.api.crud.dto.TaskDTO;
import com.api.crud.entity.TaskEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ITaskMapper {

    TaskDTO toTaskDTO(TaskEntity taskEntity);

    //@Mapping(target = "user", ignore = true)
    @Mapping(target = "project", ignore = true)
    TaskEntity toTaskEntity(TaskDTO taskDTO);

    List<TaskDTO> toTaskDTOList(List<TaskEntity> taskEntities);
}
