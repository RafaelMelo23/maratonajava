package devdojo.maratona.java.javacore.ZZIjdbc.test;

import devdojo.maratona.java.javacore.ZZIjdbc.dominio.Producer;
import devdojo.maratona.java.javacore.ZZIjdbc.service.ProducerServiceRowSet;

import java.util.List;

public class ConnectionFactoryTest02 {

    public static void main(String[] args) {

        List<Producer> producers = ProducerServiceRowSet.findByNameJdbcRowSet("nhk");
        System.out.println(producers);
    }
}
