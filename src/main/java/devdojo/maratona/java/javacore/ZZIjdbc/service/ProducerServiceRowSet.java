package devdojo.maratona.java.javacore.ZZIjdbc.service;

import devdojo.maratona.java.javacore.ZZIjdbc.dominio.Producer;
import devdojo.maratona.java.javacore.ZZIjdbc.repository.ProducerRepositoryRowSet;

import java.util.List;

public class ProducerServiceRowSet {

    public static List<Producer> findByNameJdbcRowSet(String name) {

        return ProducerRepositoryRowSet.findByNameJdbcRowSet(name);
    }

    public static void updateByIdJdbcRowSet(Producer producer) {

        ProducerRepositoryRowSet.updateJdbcRowSet(producer);
    }

    public static void updateCachedRowSet(Producer producer) {

        ProducerRepositoryRowSet.updateCachedRowSet(producer);
    }
}
