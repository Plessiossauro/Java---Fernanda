package Q2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma operação matematica:");
        System.out.println("Para somar digite 1");
        System.out.println("Para subtrair digite 2");
        System.out.println("Para dividir digite 3");
        System.out.println("Para multiplicar digite 4");
        System.out.println("Digite uma das opções listadas (1-4)");

        int opcao = scanner.nextInt();

        System.out.println("Informe o primeiro número: ");
        double number1 = scanner.nextDouble();
        System.out.println("Informe o segundo número: ");
        double number2 = scanner.nextDouble();
        double result = 0;
        String frase = "O resultado da ";
        boolean error = false;

        Matematica matematica = new Matematica();
        switch (opcao) {
            case 1:
                result = matematica.somar(number1, number2);
                frase += "a soma é "+ result;
                break;

            case 2:
                result = matematica.subtrair(number1, number2);
                frase += "a subtração é "+ result;
                break;

            case 3:
                result = matematica.multiplicar(number1, number2);
                frase += "a multiplicação é "+ result;
                break;

            case 4:
                result = matematica.dividir(number1, number2);
                frase += "a divisão é "+ result;
                break;

            default:
                error = true;
                System.out.println("Opção invalida, selecione uma opção válida");

        if (!error){
            System.out.println(frase);
        }
        }


    }
}
