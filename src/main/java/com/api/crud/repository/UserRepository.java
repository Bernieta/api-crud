package com.api.crud.repository;

import com.api.crud.dto.UserDTO;
import com.api.crud.mapper.IUserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Repository de usuario
 */
@RequiredArgsConstructor
@Repository
public class UserRepository {

    private final IUserCrudRepository userCrudRepository;
    private final IUserMapper userMapper;

    /**
     * Devuelve una lista de todos los usuarios
     *
     * @return Una lista de dtos de usuarios
     */
    public List<UserDTO> findAll() {
        return userMapper.toUserDTOList(userCrudRepository.findAll());
    }

    /**
     * Devuelve un usuario por su id
     *
     * @param id Id del usuario a obtener
     * @return Optional del usuario
     */
    public Optional<UserDTO> findById(Integer id) {
        return userCrudRepository.findById(id).map(userMapper::toUserDTO);
    }

    /**
     * Guarda un nuevo usuario
     *
     * @param userDTO Dto con la info del usuario a guardar
     * @return Un dto del usuario guardado
     */
    public UserDTO save(UserDTO userDTO) {
        return userMapper.toUserDTO(
                userCrudRepository.save(
                        userMapper.toUserEntity(userDTO)
                )
        );
    }

    /**
     * Elimina un usuario
     *
     * @param id Id del usuario a eliminar
     */
    public void delete(Integer id) {
        userCrudRepository.deleteById(id);
    }
}
