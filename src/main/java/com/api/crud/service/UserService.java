package com.api.crud.service;

import com.api.crud.dto.UserDTO;
import com.api.crud.exception.NotFoundException;
import com.api.crud.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService implements IUserService {

    private final UserRepository userRepository;

    /**
     * Devuelve una lista de todos los usuarios
     *
     * @return Una lista de dtos de usuarios
     */
    @Override
    public List<UserDTO> findAll() {
        return userRepository.findAll();
    }

    /**
     * Devuelve un usuario por su id
     *
     * @param id Id del usuario a obtener
     * @return Optional del usuario
     */
    @Override
    public Optional<UserDTO> findById(Integer id) {
        Optional<UserDTO> user = userRepository.findById(id);
        if (user.isEmpty()) throw new NotFoundException("EL usuario no existe");
        return user;
    }

    /**
     * Guarda un nuevo usuario
     *
     * @param userDTO Dto con la info del usuario a guardar
     * @return Un dto del usuario guardado
     */
    @Override
    public UserDTO save(UserDTO userDTO) {
        return userRepository.save(userDTO);
    }

    /**
     * Actualiza un usuario
     *
     * @param userDTO Dto con la info del usuario a actualizar
     * @return Optional con la info actualizada
     */
    @Override
    public Optional<UserDTO> update(UserDTO userDTO) {
        Optional<UserDTO> userDTOOptional = userRepository.findById(userDTO.getId());
        if (userDTOOptional.isEmpty()) throw new NotFoundException("El usuario no existe");
        return Optional.of(userRepository.save(userDTO));
    }

    /**
     * Elimina un usuario
     *
     * @param id Id del usuario a eliminar
     * @return true si se eliminó y false si no
     */
    @Override
    public boolean delete(Integer id) {
        Optional<UserDTO> userDTOOptional = userRepository.findById(id);
        if (userDTOOptional.isEmpty()) return false;
        userRepository.delete(id);
        return true;
    }
}
