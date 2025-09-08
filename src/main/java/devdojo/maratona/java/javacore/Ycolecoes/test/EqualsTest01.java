package javacore.Ycolecoes.test;

import javacore.Ycolecoes.dominio.SmartPhone;

public class EqualsTest01 {

    public static void main(String[] args) {

        SmartPhone s1 = new SmartPhone("1ABC1", "iPhone");
        SmartPhone s2 = new SmartPhone("1ABC1", "iPhone");
        // SmartPhone s2 = s1; <- o equals daria true, porque a referencia seria ao obj de s1

        System.out.println(s1.equals(s2));
    }
}
