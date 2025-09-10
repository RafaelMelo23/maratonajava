package devdojo.maratona.java.javacore.ZZIjdbc.service;

import devdojo.maratona.java.javacore.ZZIjdbc.dominio.Producer;
import devdojo.maratona.java.javacore.ZZIjdbc.repository.ProducerRepository;

import java.util.List;

public class ProducerService {

    public static void saveProducer(Producer producer) {
        ProducerRepository.save(producer);
    }

    public static void deleteProducer(Integer id) {
        requireValidId(id);

        ProducerRepository.delete(id);
    }

    public static void updateProducer(Producer producer) {
        requireValidId(producer.getId());

        ProducerRepository.update(producer);
    }

    public static List<Producer> findAllProducer() {

        return ProducerRepository.findAll();
    }

    private static void requireValidId(Integer id) {

        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Id must be greater than 0");
        }
    }
}
