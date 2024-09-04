package com.api.crud.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Manejador global de excepciones
 */
@RestControllerAdvice
public class GlobalExceptionsHandlers {

    /**
     * Logger para mostrar los mensajes de la consola
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionsHandlers.class);

    /**
     * Maneja las respuestas para las excepciones del tipo Bad_Request
     *
     * @param badRequestException Tipo de excepción
     * @return Respuesta con los detalles de la excepción
     */
    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<CustomResponseHandler> badRequestExceptionHandler(BadRequestException badRequestException) {
        LOGGER.error("badRequestExceptionHandler - message {}", badRequestException.getMessage());
        CustomResponseHandler customResponseHandler = new CustomResponseHandler(
                HttpStatus.BAD_REQUEST,
                HttpStatus.BAD_REQUEST.value(),
                badRequestException.getMessage()
        );
        return new ResponseEntity<>(customResponseHandler, HttpStatus.BAD_REQUEST);
    }

    /**
     * Maneja las respuestas para las excepciones del tipo Not_Found
     *
     * @param notFoundException Tipo de excepción
     * @return Respuesta con los detalles de la excepción
     */
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<CustomResponseHandler> notFoundExceptionHandler(NotFoundException notFoundException) {
        LOGGER.error("notFoundExceptionHandler - message {}", notFoundException.getMessage());
        CustomResponseHandler customResponseHandler = new CustomResponseHandler(
                HttpStatus.NOT_FOUND,
                HttpStatus.NOT_FOUND.value(),
                notFoundException.getMessage()
        );
        return new ResponseEntity<>(customResponseHandler, HttpStatus.NOT_FOUND);
    }

    /**
     * Maneja las respuestas para las excepciones del tipo Unauthorized
     *
     * @param unauthorizedException Tipo de excepción
     * @return Respuesta con los detalles de la excepción
     */
    @ExceptionHandler(UnauthorizedException.class)
    public ResponseEntity<CustomResponseHandler> unauthorizedExceptionHandler(UnauthorizedException unauthorizedException) {
        LOGGER.error("unauthorizedExceptionHandler - message {}", unauthorizedException.getMessage());
        CustomResponseHandler customResponseHandler = new CustomResponseHandler(
                HttpStatus.UNAUTHORIZED,
                HttpStatus.UNAUTHORIZED.value(),
                unauthorizedException.getMessage()
        );
        return new ResponseEntity<>(customResponseHandler, HttpStatus.UNAUTHORIZED);
    }

    /**
     * Maneja las respuestas para las excepciones del tipo Forbidden
     *
     * @param forbiddenException Tipo de excepción
     * @return Respuesta con los detalles de la excepción
     */
    @ExceptionHandler(ForbiddenException.class)
    public ResponseEntity<CustomResponseHandler> forbiddenExceptionHandler(ForbiddenException forbiddenException) {
        LOGGER.error("forbiddenExceptionHandler - message {}", forbiddenException.getMessage());
        CustomResponseHandler customResponseHandler = new CustomResponseHandler(
                HttpStatus.FORBIDDEN,
                HttpStatus.FORBIDDEN.value(),
                forbiddenException.getMessage()
        );
        return new ResponseEntity<>(customResponseHandler, HttpStatus.FORBIDDEN);
    }

    /**
     * Maneja las respuestas para las excepciones del tipo Internal_Server_Error
     *
     * @param internalServerErrorException Tipo de excepción
     * @return Respuesta con los detalles de la excepción
     */
    @ExceptionHandler(InternalServerErrorException.class)
    public ResponseEntity<CustomResponseHandler> internalServerErrorExceptionHandler(InternalServerErrorException internalServerErrorException) {
        LOGGER.error("internalServerErrorExceptionHandler - message {}", internalServerErrorException.getMessage());
        CustomResponseHandler customResponseHandler = new CustomResponseHandler(
                HttpStatus.INTERNAL_SERVER_ERROR,
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                internalServerErrorException.getMessage()
        );
        return new ResponseEntity<>(customResponseHandler, HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
