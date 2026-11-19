import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double metros, centimetros;

        System.out.print("Digite a medida em metros: ");
        metros = entrada.nextDouble();

        centimetros = metros * 100;

        System.out.println("Medida em centimetros: " + centimetros);
    }
}