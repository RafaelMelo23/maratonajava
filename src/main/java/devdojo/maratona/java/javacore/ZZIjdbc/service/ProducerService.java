package devdojo.maratona.java.javacore.ZZIjdbc.service;

import devdojo.maratona.java.javacore.ZZIjdbc.dominio.Producer;
import devdojo.maratona.java.javacore.ZZIjdbc.repository.ProducerRepository;

public class ProducerService {

    public static void saveProducer(Producer producer) {

        ProducerRepository.save(producer);
    }

    public static void deleteProducer(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Id must be greater than 0");
        }

        ProducerRepository.delete(id);
    }
}
