package devdojo.maratona.java.javacore.ZZIjdbc.dominio;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Producer {

    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
