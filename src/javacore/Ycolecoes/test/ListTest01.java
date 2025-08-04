package javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {

    public static void main(String[] args) {

        List<String> nomesList = new ArrayList<>(16); // Diamond Syntax veio na 1.5

        nomesList.add("Anakin");
        nomesList.add("Plagueis");

        for (String nome : nomesList) {

            System.out.println(nome);
        }

        nomesList.add("Sidious");

        for (int i = 0; i < nomesList.size(); i++) {

            System.out.println(nomesList.get(i));
        }
    }
}
