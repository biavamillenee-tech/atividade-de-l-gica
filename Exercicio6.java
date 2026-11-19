import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome;
        int idade;
        boolean ativo;

        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        idade = entrada.nextInt();

        System.out.print("A conta esta ativa? (true/false): ");
        ativo = entrada.nextBoolean();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Conta ativa: " + ativo);
    }
}