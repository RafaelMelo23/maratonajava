package javacore.Qstring.test;

public class StringTest02 {

    public static void main(String[] args) {

        String nome = "Anakin";
        String numeros = "012345";

        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("a", "i"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());

        System.out.println(numeros.charAt(0));
        System.out.println(numeros.length());
        System.out.println(numeros.substring(0,2)); // o endIndex eh exclusivo, ou seja, ele é i - 1
        System.out.println(numeros.substring(3));

        System.out.println(nome.trim());
    }
}
