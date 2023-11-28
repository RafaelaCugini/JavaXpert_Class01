import javax.swing.*;
import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //quilometragem inicial, quilometragem posto, quantidade de litros (ED)
        double kmInicial, kmFinal, qtdLitros, consumo;
        System.out.println("Informe quantos quilometros o marcador indica no inicio da viagem: ");
        kmInicial = reader.nextDouble();
        System.out.println("Informe quantos quilometros o marcador indica na chegada ao posto: ");
        kmFinal = reader.nextDouble();
        System.out.println("Quantos litros de combustivel foram reabastecidos: ");
        qtdLitros = reader.nextDouble();

        consumo = (kmFinal - kmInicial) / qtdLitros; //PD
        System.out.println("O consumo do veiculo foi " + consumo + " K/L "); //SD

        //teste

    }
}
