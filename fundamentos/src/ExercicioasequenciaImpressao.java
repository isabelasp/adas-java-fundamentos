import java.util.Scanner;

public class ExercicioasequenciaImpressao {

    public static void main(String[] args) {

            //Casse para ler o terminal
            Scanner leitor = new Scanner(System.in);

            System.out.println("Digite um numero");
            int numero = leitor.nextInt();
            int maiorPar = 0;
            int maiorImpar = 0;

            for (int cont = 1; cont <= numero; cont++) {
                if (cont % 2 == 0 ) {
                    int dobro = cont * 2;
                    if(dobro > maiorPar){
                        maiorPar = dobro;
                    }
                    System.out.print(dobro+" - ");
                } else {
                    int triplo = cont * 3;
                    if(triplo > maiorImpar){
                        maiorImpar = triplo;
                    }
                    System.out.print(triplo + " - ");
                }
            }
            System.out.println();
            System.out.println("Maior numero par " + maiorPar );
            System.out.println("Maior numero impar " + maiorImpar );
    }

}
