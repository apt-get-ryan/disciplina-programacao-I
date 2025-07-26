import java.util.Scanner;

public class Principal004 {

    public static void main(String[] args) {
        double nota1, nota2, media;
        Scanner inputDevice = new Scanner(System.in);
        for(int na = 1; na <= 1000; na++) {
            System.out.println("Aluno "+na);
            System.out.print("Digite a primeira nota: ");
            nota1 = inputDevice.nextDouble();
            System.out.print("Digite a segunda nota: ");
            nota2 = inputDevice.nextDouble();
            media = (nota1 + nota2) / 2;
            System.out.println("Média: " + media);
            System.out.println("\n");
        }

    }
}