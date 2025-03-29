package Q1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Diga o nome do aluno: ");
        aluno.nome = scanner.next();
        System.out.println("Digite a primeira nota do aluno: ");
        aluno.n1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota do aluno: ");
        aluno.n2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota do aluno: ");
        aluno.n3 = scanner.nextDouble();
        aluno.calcular_media();
        System.out.println("A média do aluno "+aluno.nome+" é "+aluno.media);

        if (aluno.media>=7){
            System.out.println(aluno.nome+" está aprovado!");

        }else if(aluno.media>4 && aluno.media<7){
            System.out.println(aluno.nome+" está na final!");
        }else{
            System.out.println(aluno.nome+" está reprovado!");
        }

        scanner.close();
    }
}