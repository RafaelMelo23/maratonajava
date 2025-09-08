package devdojo.maratona.java.javacore.ZZIjdbc.dominio;

import java.util.Objects;

public class Producer {

    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static final class ProducerBuilder {
        private Integer id;
        private String name;

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            ProducerBuilder that = (ProducerBuilder) o;
            return Objects.equals(id, that.id) && Objects.equals(name, that.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }

        @Override
        public String toString() {
            return "ProducerBuilder{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        private ProducerBuilder() {
        }

        public static ProducerBuilder builder() {
            return new ProducerBuilder();
        }

        public ProducerBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public ProducerBuilder name(String name) {
            this.name = name;
            return this;
        }

        public Producer build() {
            Producer producer = new Producer();
            producer.name = this.name;
            producer.id = this.id;
            return producer;
        }
    }
}
