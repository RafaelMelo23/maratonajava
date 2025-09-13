package devdojo.maratona.java.javacore.ZZIjdbc.test;

import devdojo.maratona.java.javacore.ZZIjdbc.dominio.Producer;
import devdojo.maratona.java.javacore.ZZIjdbc.service.ProducerServiceRowSet;

import java.util.List;

public class ConnectionFactoryTest02 {

    public static void main(String[] args) {

        Producer producer = Producer.builder().id(4).name("updatedUser").build();
        ProducerServiceRowSet.updateByIdJdbcRowSet(producer);

        List<Producer> producers = ProducerServiceRowSet.findByNameJdbcRowSet("");
        System.out.println(producers);
    }
}
