package es.cic25.proyectoconjunto.proyectoConjunto.configuration;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import es.cic25.proyectoconjunto.proyectoConjunto.controller.IntentoModificacionSecurityException;

@RestControllerAdvice
public class MiControllerAdvice {

    //@ResponseStatus(HttpStatus.BAD_REQUEST) porque cuando no hay especificado, es un value. Code es un alias de value, luego funciona
    //@ExceptionHandler(IntentoModificacionSecurityException.class) ojo puede ir entre {}
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(exception = IntentoModificacionSecurityException.class)
    public void controloIntentoModificacion() {

    }
}
