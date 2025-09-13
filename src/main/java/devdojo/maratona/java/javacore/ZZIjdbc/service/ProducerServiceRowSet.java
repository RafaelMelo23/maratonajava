package devdojo.maratona.java.javacore.ZZIjdbc.service;

import devdojo.maratona.java.javacore.ZZIjdbc.dominio.Producer;
import devdojo.maratona.java.javacore.ZZIjdbc.repository.ProducerRepositoryRowSet;

import java.util.List;

public class ProducerServiceRowSet {

    public static List<Producer> findByNameJdbcRowSet(String name) {

        return ProducerRepositoryRowSet.findByNameJdbcRowSet(name);
    }
}
