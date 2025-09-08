package devdojo.maratona.java.javacore.ZZClambdas.dominio;

public class StarWars {

    private String title;
    private Integer episodes;

    @Override
    public String toString() {
        return "StarWars{" +
                "title='" + title + '\'' +
                ", episodes=" + episodes +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public Integer getEpisodes() {
        return episodes;
    }

    public StarWars(String title, Integer episodes) {
        this.title = title;
        this.episodes = episodes;
    }


}
