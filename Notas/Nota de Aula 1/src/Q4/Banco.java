package Q4;

public class Banco {
    double saldo = 0;
    double receber, sacar, transferir, valor;

    public void consultar(){
        System.out.println(valor);
    }

    public void adicionar(){
        valor = receber + valor;
    }

    public void retirar(){
        if(valor >0) {
            valor = valor - sacar;
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }
}
