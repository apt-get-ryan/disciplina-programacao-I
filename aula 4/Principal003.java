import java.util.Scanner;

public class Principal003 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, nota3, media;

        System.out.print("Digite o valor da nota 1: ");
        nota1 = scanner.nextDouble();

        System.out.print("Digite o valor da nota 2: ");
        nota2 = scanner.nextDouble();

        System.out.print("Digite o valor da nota 3: ");
        nota3 = scanner.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;


        System.out.println("A media é igual a " + media);

        if(media >= 7) {
            System.out.println("Aprovado!");
        } else if (media > 4) {
            System.out.println("Final!");
        } else {
            System.out.println("Reprovado!61");
        }
    }
}