package devdojo.maratona.java.javacore.ZZJcrud.dominio;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Anime {

    private Integer id;
    private String name;
    private int episodes;
    private Producer producer;

}
