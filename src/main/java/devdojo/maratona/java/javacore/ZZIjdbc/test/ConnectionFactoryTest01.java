package devdojo.maratona.java.javacore.ZZIjdbc.test;

import devdojo.maratona.java.javacore.ZZIjdbc.dominio.Producer;
import devdojo.maratona.java.javacore.ZZIjdbc.service.ProducerService;

public class ConnectionFactoryTest01 {

    public static void main(String[] args) {

        Producer producer = Producer.builder().id(2).name("nhk").build();
//        ProducerService.saveProducer(producer);
//        ProducerService.deleteProducer(1);

//        ProducerService.updateProducer(producer);

        System.out.println(ProducerService.findAllProducer());

//        System.out.println(ProducerService.findByName("nhk"));
    }
}
