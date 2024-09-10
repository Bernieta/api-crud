package com.api.crud.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskDTO {

    private Integer taskId;
    private String title;
    private String description;

}
