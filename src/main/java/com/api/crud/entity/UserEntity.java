package com.api.crud.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;

    @Column(nullable = false)
    private String names;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    private Long phone;

    private Byte age;

    private Double height;

    private Boolean married;

    private LocalDate birthday;

    /**
     * Relación con la entidad ProfileEntity
     * targetEntity: Indica la entidad con la que se hará la relación
     */
//    @OneToOne(targetEntity = ProfileEntity.class, cascade = CascadeType.PERSIST)
//    @JoinColumn(name = "id_profile")
//    private ProfileEntity profile;
//
//    @OneToMany(targetEntity = TaskEntity.class, fetch = FetchType.LAZY, mappedBy = "user")
//    private List<TaskEntity> tasks;
}


