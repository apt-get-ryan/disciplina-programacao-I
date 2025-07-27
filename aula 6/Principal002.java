import java.util.Scanner;

public class Principal002 {

    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);


        String matricula, nome, situacao, turma;
        double teste, prova, media;

        System.out.println("Digite a turma: ");
        turma = inputDevice.next();


        for(int i = 0; i < 3; i++) {
            System.out.println("Digite a matrícula do aluno: ");
            matricula = inputDevice.next();

            System.out.println("Digite o nome do aluno: ");
            nome = inputDevice.next();

            System.out.println("Digite a nota do teste: ");
            teste = inputDevice.nextDouble();

            System.out.println("Digite a nota da prova: ");
            prova = inputDevice.nextDouble();

            media = (teste + prova) / 2;

            System.out.println("Matricula: " + matricula);
            System.out.println("Nome: " + nome);
            System.out.println("Média: " + media);
            if (media >= 6) {
                situacao = "aprovado";

            }
            else if(media < 6 && media >=4) {
                situacao = "recuperação";
            }
            else {
                situacao = "reprovado";
            }
            
            System.out.println("Situação: " + situacao);
            

        }
    }





}