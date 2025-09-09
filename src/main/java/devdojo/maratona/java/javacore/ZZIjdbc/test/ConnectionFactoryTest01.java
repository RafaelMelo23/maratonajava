package devdojo.maratona.java.javacore.ZZIjdbc.test;

import devdojo.maratona.java.javacore.ZZIjdbc.dominio.Producer;
import devdojo.maratona.java.javacore.ZZIjdbc.service.ProducerService;

public class ConnectionFactoryTest01 {

    public static void main(String[] args) {

        Producer producer = Producer.builder().name("NHK").build();
//        ProducerService.saveProducer(producer);
        ProducerService.deleteProducer(1);
    }
}
