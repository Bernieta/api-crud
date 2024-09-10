package com.api.crud.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tasks")
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer taskId;

    private String title;
    private String description;

//    @ManyToOne(targetEntity = UserEntity.class)
//    @JoinColumn(name = "id_user")
//    private UserEntity user;

    @ManyToOne(targetEntity = ProjectEntity.class)
    @JoinColumn(name = "id_project")
    private ProjectEntity project;
}
