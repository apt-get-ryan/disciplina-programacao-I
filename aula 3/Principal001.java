import java.util.Scanner;

public class Principal001 {
    public static void main(String[] args) {
        System.out.println(9 + 2);
        System.out.println(9 - 2);
        System.out.println(9 * 2);
        System.out.println(9 / 2); // divisão de inteiros retorna inteiros
        System.out.println(9.0 / 2);

        byte x = 3;
        short y = 4;
        int z = 5;
        long k = 6;

        float u = 2;
        double w = 3;
        boolean t = true;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(k);
        System.out.println("-----------");
        System.out.println(u);
        System.out.println(w);
        System.out.println(t);

        System.out.println("-----------");
        
        double nota1 = 9.0;
        double nota2 = 10.0;
        
        double media;
        media = ( nota1 + nota2 ) / 2;
        
        System.out.println(media);
        System.out.println("-----------");
        int valor = 15;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        valor = teclado.nextInt();
        System.out.println(valor/2);
        System.out.println(valor%2);

    }
}