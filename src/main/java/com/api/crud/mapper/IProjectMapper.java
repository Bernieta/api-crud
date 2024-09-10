package com.api.crud.mapper;

import com.api.crud.dto.ProjectDTO;
import com.api.crud.entity.ProjectEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IProjectMapper {

    ProjectDTO toProjectDTO(ProjectEntity projectEntity);

    @Mapping(target = "tasks", ignore = true)
    ProjectEntity toProjectEntity(ProjectDTO projectDTO);

    List<ProjectDTO> toProjectDTOList(List<ProjectEntity> projectEntities);

}
