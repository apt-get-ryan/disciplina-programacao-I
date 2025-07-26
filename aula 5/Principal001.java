public class Principal001 {

    public static void main(String[] args) {
        int numero = 1;
        while (numero <= 5) {
            System.out.println(numero);
            numero++;
        }

        System.out.println("---------");
        numero = 9;

        do {
            System.out.println(numero);
            numero++;
        } while(numero <= 5);
    }
}