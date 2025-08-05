package javacore.Ycolecoes.dominio;

import java.util.Objects;

public class SWLegends implements Comparable<SWLegends> {

    private Long id;
    private String nome;
    private double preco;

    public SWLegends(Long id, String nome, double preco) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(nome);
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SWLegends swLegends = (SWLegends) o;
        return Double.compare(preco, swLegends.preco) == 0 && Objects.equals(id, swLegends.id) && Objects.equals(nome, swLegends.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    @Override
    public String toString() {
        return "SWLegends{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(SWLegends outroLegends) {

        // negativo se o this < outroLegends
        // return 0 se this == outroLegends
        // positivo se this > outroLegends

//        if (this.id < outroLegends.getId()) {
//            return -1;
//        } else if (this.id.equals(outroLegends.getId())) {
//            return 0;
//        } else {
//            return 1;
//        }

        return this.id.compareTo(outroLegends.id);
    }
}
