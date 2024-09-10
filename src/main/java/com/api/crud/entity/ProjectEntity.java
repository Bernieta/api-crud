package com.api.crud.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "projects")
public class ProjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer projectId;

    @Column(name = "project_name")
    private String projectName;

    @OneToMany(targetEntity = TaskEntity.class, fetch = FetchType.LAZY, mappedBy = "project")
    private List<TaskEntity> tasks;

    @ManyToMany(targetEntity = EquipmentEntity.class, fetch = FetchType.LAZY)
    @JoinTable(
            name = "projects_equipments",
            joinColumns = @JoinColumn(name = "id_project"),
            inverseJoinColumns = @JoinColumn(name = "id_equipment")
    )
    private List<EquipmentEntity> equipments;
}
