package javacore.Ycolecoes.dominio;

public class SmartPhone {

    private String serialNumber;
    private String marca;

    @Override
    public String toString() {
        return "SmartPhone [serialNumber=" + serialNumber + ", marca=" + marca + "]";
    }

    // Reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null
    // Simetrico: para x e y diferentes de null, se x.equals(y) == true logo, y.equals(x) == true
    // Transitividade: para x, y, z diferentes de null, se x.equals(y) == true, logo x.equals(z) == true, logo y.equals(z) == true
    // Consistente: x.equals(x) sempre tem que retorna true se x for diferente de null
    // para X diferente de null, x.equals(null) tem que retornar false
    @Override
    public boolean equals(Object obj) {

        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;

        SmartPhone smartPhone = (SmartPhone) obj;

        return serialNumber != null && serialNumber.equals(smartPhone.serialNumber);
    }

    // se x.equals(y) == true, y.hashcode() == x.hashcode()
    // y.hashcode() == x.hashcode() nao necessariamente o equals de y.equals(x) tem que ser true
    // x.equals(y) == false
    // y.hashcode() != x.hashcode() x.equals(y) devera ser false
    @Override
    public int hashCode() {

        return serialNumber == null ? 0 : serialNumber.hashCode();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public SmartPhone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }
}
