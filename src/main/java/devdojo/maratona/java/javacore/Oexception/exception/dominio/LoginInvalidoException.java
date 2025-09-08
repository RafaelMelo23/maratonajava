package javacore.Oexception.exception.dominio;

public class LoginInvalidoException extends Exception {

    public LoginInvalidoException() {
        super("Usuario ou senha invalidos");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
