package javacore.Oexception.runtime.test;

import javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {

    public static void main(String[] args)  {

        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {

        String usuarioDB = "Anakin";
        String senhaDB = "123";

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu usuario: ");
        String usuarioDigitado = entrada.nextLine();

        System.out.println("Digite sua senha: ");
        String senhaDigitada = entrada.nextLine();

        if (!usuarioDB.equals(usuarioDigitado) || !senhaDB.equals(senhaDigitada)) {

            throw new LoginInvalidoException();
        }

        System.out.println("Login efetuado com sucesso!");
    }
}
