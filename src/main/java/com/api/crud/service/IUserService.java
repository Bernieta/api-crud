package com.api.crud.service;

import com.api.crud.dto.UserDTO;

import java.util.List;
import java.util.Optional;

public interface IUserService {

    /**
     * Devuelve una lista de todos los usuarios
     *
     * @return Una lista de dtos de usuarios
     */
    List<UserDTO> findAll();

    /**
     * Devuelve un usuario por su id
     *
     * @param id Id del usuario a obtener
     * @return Optional del usuario
     */
    Optional<UserDTO> findById(Integer id);

    /**
     * Guarda un nuevo usuario
     *
     * @param userDTO Dto con la info del usuario a guardar
     * @return Un dto del usuario guardado
     */
    UserDTO save(UserDTO userDTO);

    /**
     * Actualiza un usuario
     *
     * @param userDTO Dto con la info del usuario a actualizar
     * @return Optional con la info actualizada
     */
    Optional<UserDTO> update(UserDTO userDTO);

    /**
     * Elimina un usuario
     *
     * @param id Id del usuario a eliminar
     * @return true si se eliminó y false si no
     */
    boolean delete(Integer id);
}
