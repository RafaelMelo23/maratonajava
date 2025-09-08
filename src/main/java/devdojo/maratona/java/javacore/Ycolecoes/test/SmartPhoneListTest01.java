package devdojo.maratona.java.javacore.Ycolecoes.test;

import devdojo.maratona.java.javacore.Ycolecoes.dominio.SmartPhone;

import java.util.ArrayList;
import java.util.List;

public class SmartPhoneListTest01 {

    public static void main(String[] args) {

        SmartPhone s1 = new SmartPhone("1ABC1", "iPhone");
        SmartPhone s2 = new SmartPhone("22221", "Pixel");
        SmartPhone s3 = new SmartPhone("22355", "Samsung");

        List<SmartPhone> smartPhones = new ArrayList<>(6);

        smartPhones.add(s1);
        smartPhones.add(s2);
        smartPhones.add(0, s3); // ou addFirst

        for (SmartPhone smartPhone : smartPhones) {
            System.out.println(smartPhone);
        }

        SmartPhone s4 = new SmartPhone("2221", "Samsung");
        smartPhones.add(s4);

        System.out.println(smartPhones.contains(s4));
        int indexOfSmartPhone4 = smartPhones.indexOf(s4);
        System.out.println(smartPhones.get(indexOfSmartPhone4));


    }
}
