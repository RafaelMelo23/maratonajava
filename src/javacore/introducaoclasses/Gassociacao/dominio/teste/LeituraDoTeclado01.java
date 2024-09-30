package javacore.introducaoclasses.Gassociacao.dominio.teste;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LeituraDoTeclado01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo: ");
        String nome = input.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();
        System.out.println("Escolha seu sexo entre M e F");
        char sexo = input.next().charAt(0);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);


    }
}
