import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Função Principal
        System.out.println("Ola Adas Dev!");

        //Casse para ler o terminal
        Scanner leitor = new Scanner(System.in);

        //Declarando Variaveis
        String alluno = "Harry";
        int codigo = 123;
        double medias = 7.8;
        boolean alunoAprovado = true;

        //Recebendo valores do usuario
        System.out.println("Olá, diga qual o seu nome ");
        String nome = leitor.next();

        System.out.println("Seja Bem Vindo ao Sistemas " + nome);

        //Condicional IF
        System.out.println("Digite sua Idade");
        int idade = leitor.nextInt();

        if (idade >=18) {
            System.out.println("Você já é maior de idade!");
        } else {
            System.out.println("Ainda não tem 18 anos");
        }

        //Repetição For
        for (int cont = 1; cont <= idade; cont++) {
            System.out.print(cont + " - ");

        }

    }

}