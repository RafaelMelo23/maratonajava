package devdojo.maratona.java.javacore.Pwrapper.test;

public class WrapperTest01 {

    public static void main(String[] args) {
        byte byteP = 127;
        short shortP = 127;
        int intP = 127;
        long longP = 127L;
        float floatP = 127.0f;
        double doubleP = 127.0d;
        char charP = 'A';
        boolean booleanP = true;

        Byte byteW = 127;
        Short shortW = 127;
        Integer intW = 127; //autoboxing
        Long longW = 127L;
        Float floatW = 127.0f;
        Double doubleW = 127.0d;
        Character charW = 'A';
        Boolean booleanW = true;
        // relacionados agora ao polimorfismo, nao as limitacoes dos tipos primitivos

        int i = intW; // unboxing
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean(null);
        System.out.println(verdadeiro);

        System.out.println(Character.isLetter('A'));
        System.out.println(Character.isLetter('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));

    }

}
