package devdojo.maratona.java.javacore.ZZIjdbc.test;

import devdojo.maratona.java.javacore.ZZIjdbc.dominio.Producer;
import devdojo.maratona.java.javacore.ZZIjdbc.service.ProducerService;

public class ConnectionFactoryTest01 {

    public static void main(String[] args) {

        Producer producer = Producer.builder().id(4).name("NHK").build();
//        ProducerService.saveProducer(producer);
//        ProducerService.deleteProducer(1);

//        ProducerService.updateProducer(producer);

//        System.out.println(ProducerService.findAllProducer());

//        System.out.println(ProducerService.findByName("nhk"));

//        ProducerService.showProducerMetaData();

//        ProducerService.showDriverMetadata();

//        ProducerService.showTypeScrollWorking();

//        System.out.println(ProducerService.findByNameAndUpdateToUpperCase("nhk"));

//        System.out.println(ProducerService.findByNameAndInsertIfNotFound("nhk"));

//        ProducerService.findByNameAndDelete("nhk");

//        System.out.println(ProducerService.findByNamePreparedStatement("nhk"));

//          ProducerService.updatePreparedStatement(producer);

        System.out.println(ProducerService.findByNameCallableStatement("nhk"));
    }
}
