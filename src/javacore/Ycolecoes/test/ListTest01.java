package javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {

    public static void main(String[] args) {

        List<String> nomesList = new ArrayList<>(16); // Diamond Syntax veio na 1.5
        List<String> nomesList2 = new ArrayList<>(16);

        nomesList.add("Anakin");
        nomesList.add("Plagueis");

        nomesList2.add("Skywalker");
        nomesList2.add("The wise");

        nomesList.addAll(nomesList2);

        // System.out.println(nomesList.remove("Anakin")); // usa o equals da String (literal)
        for (String nome : nomesList) {

            System.out.println(nome);
        }



        System.out.println("---------");
        nomesList.add("Sidious");

        for (int i = 0; i < nomesList.size(); i++) {

            System.out.println(nomesList.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        // Nao pode ser um tipo primitivo, tem de ser um objeto
        numeros.add(1);
    }
}
