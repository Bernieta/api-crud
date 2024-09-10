package com.api.crud.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.CreditCardNumber;

import java.time.LocalDate;

@Getter
@Setter
public class UserDTO {

    /*
    @NotNull: Para campos null
    @Size(min = 2, max = 10): Para longitudes de cadenas de caracteres
    @NotBlank: Para campos en blanco o vacíos
    @Min(18) @Max(60): Para valores minimos y maximos en números
    @NotEmpty: Para lista vacías
    @Pattern(regexp = expresion regular): para validar con expresiones regulares
    @Email: Para validar email
    @Digits(integer = 1, fraction = 2): para validar fracciones
    @Past @Future: Para validar fechas anteriores y futuras
    @AssertTrue: Para valores verdaderos
    @AssertFalse: Para valores falsos
    @CreditCardNumber: Para validar tarjetas ce creditos
     */

    private Integer userId;

    @NotNull
    private String names;

    @NotNull
    @Size(min = 2, max = 20)
    private String lastName;

    @NotNull
    @NotBlank
    @Email
    private String email;

    private Long phone;

    @Min(18)
    @Max(60)
    private Byte age;

    @Digits(integer = 1, fraction = 2)
    private Double height;

    @AssertTrue
    @AssertFalse
    private Boolean married;

    @Past
    @Future
    private LocalDate birthday;

}
