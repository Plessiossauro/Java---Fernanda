package Q4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();
        String r;

        do{
            System.out.println("Digite a opção que você deseja utilizar: ");
            System.out.println("Digite 1 para consultar o saldo!");
            System.out.println("Digite 2 para depositar!");
            System.out.println("Digite 3 para sacar!");
            System.out.println("Digite 4 para trânsferir!");
            int x = scanner.nextInt();
            switch (x){
                case 1:
                    System.out.println("Consultar saldo");
                    banco.consultar();
                    break;
                case 2:
                    System.out.println("Depositar");
                    banco.receber = scanner.nextDouble();
                    banco.adicionar();
                    break;
                case 3:
                    System.out.println("Sacar");
                    banco.sacar = scanner.nextDouble();
                    banco.retirar();
                    break;
                case 4:
                    System.out.println("Transferir");
                    banco.transferir = scanner.nextDouble();
                    banco.retirar();
                    break;
            }
            System.out.println("Caso queira ver outra opção, digite O");
            r = scanner.next();
        }while (r.equalsIgnoreCase("O"));
    }
}
