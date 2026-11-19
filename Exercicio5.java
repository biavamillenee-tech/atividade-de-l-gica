import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int idade, dias;

        System.out.print("Digite sua idade: ");
        idade = entrada.nextInt();

        dias = idade * 365;

        System.out.println("Dias vividos: " + dias);
    }
}