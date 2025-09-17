package devdojo.maratona.java.javacore.ZZKjunit.dominio;

public class Developer extends Employee {

    private String mainLanguage;

    public Developer(Long id, String mainLanguage) {
        super(id);
        this.mainLanguage = mainLanguage;
    }

    public String getMainLanguage() {
        return mainLanguage;
    }
}
