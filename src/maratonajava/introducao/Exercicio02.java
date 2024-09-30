package maratonajava.introducao;

public class Exercicio02 {
    public static void main(String[] args) {
        double salarioAnual = 55678;
        double impostoAte35k = 9.70 /100;
        double impostoAte69k= 37.35 /100;
        double impostoAcima69k = 49.50 /100;

        if (salarioAnual <= 34712) {
            double impostoPag = salarioAnual * impostoAte35k;
            System.out.println("O imposto sobre o salário anual de até 34 mil euros é de "+impostoPag);
        } else if (salarioAnual <= 68507) {
            double impostoPag = salarioAnual * impostoAte69k;
            System.out.println("O imposto sobre o salário anual de até 68 mil euros é de "+impostoPag);
        } else if (salarioAnual >= 68508) {
            double impostoPag = salarioAnual * impostoAcima69k;
            System.out.println("O imposto sobre o salário anual igual ou acima 68 mil euros é de "+impostoPag);
        }



    }
}
