package devdojo.maratona.java.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {

    public static void main(String[] args) {

        ResourceBundle bundle = ResourceBundle.getBundle("messages", Locale.of("en", "US"));
        System.out.println(bundle.getString("good.morning"));

        ResourceBundle bundleBR = ResourceBundle.getBundle("messages", Locale.of("pt", "BR"));
        System.out.println(bundleBR.getString("good.morning"));
    }
}
