package es.cic25.proyectoconjunto.proyectoConjunto.controller;

public class IntentoModificacionSecurityException extends RuntimeException {

    public IntentoModificacionSecurityException() {
        super("Has tratado de modificar mediante creación");
    }

    public IntentoModificacionSecurityException(String message) {
        super(message);
    }

    public IntentoModificacionSecurityException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
