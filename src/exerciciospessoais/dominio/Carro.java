package exerciciospessoais.dominio;

/*Implemente uma classe chamada “Carro” com atributos para armazenar a marca,
o modelo e a velocidade atual do carro. Adicione métodos para acelerar, frear e exibir a velocidade atual.
 */

public class Carro {

    private String carBrand;
    private String carModel;
    private double carSpeed;
    public double brake;
    public double gas;
    public double carNewSpeed;

    public void setCarBrand(String carBrand) {

        this.carBrand = carBrand;
    }

    public void setCarModel(String carModel) {

        this.carModel = carModel;
    }

    public void setCarSpeed(double carSpeed) {

        this.carSpeed = carSpeed;
    }
    public void setBrake(double brake) {

        this.brake = brake;
    }

    public void setGas(double gas) {

        this.gas = gas;
    }

    public String getCarBrand() {
        return this.carBrand;

    }

    public String getCarModel() {
        return this.carModel;
    }

    public double getCarSpeed() {
        return this.carSpeed;
    }

    public void carGas() {

        carNewSpeed += gas;
        System.out.println("Velocidade do veículo após acelerar: " +carNewSpeed);
    }

    public void carBrake() {

        carNewSpeed = carSpeed - brake;
        System.out.println("Velocidade do veículo após frear: " +carNewSpeed);
    }

    public void printCarInfos() {

        System.out.println("Marca do carro: " + carBrand);
        System.out.println("Modelo do carro: " + carModel);
        System.out.println("Velocidade atual do carro: " + carSpeed);

    }
}
