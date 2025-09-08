package devdojo.maratona.java.javacore.ZZAclassesinternas.test;

public class OuterClassTest02 {

    private String name = "Hego";

    void print() {

        String lastName = "Damask"; // Nesse caso, o java a considera efetivamente final, a nao ser que ela seja modificada dentro do codigo
        class LocalClass {

            void printLocalClass() {
                System.out.println(name + " " + lastName); // <- a regra acima vale pro param tambem
            }
        }

        new LocalClass().printLocalClass();
    }

    public static void main(String[] args) {

        OuterClassTest02 outer = new OuterClassTest02();
        outer.print();
    }
}
