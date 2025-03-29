import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();
        String Ç;
        do{
            System.out.println("Funções: ");
            System.out.println("1 - Cadastro de Dados do Produtos");
            System.out.println("2 - Realizar Compra ");
            System.out.println("3 - Exibir Estoque");

            int x = scanner.nextInt();
            switch (x){
                case 1:
                    System.out.println("Digite o nome do produto:");
                    produto.setNome(scanner.next());
                    System.out.println("Digite código do produto:");
                    produto.setCodigo(scanner.nextInt());
                    System.out.println("Digite tamanho/peso do produto");
                    produto.setPeso(scanner.nextDouble());
                    System.out.println("Digite a cor do produto:");
                    produto.setCor(scanner.next());
                    System.out.println("Digite o valor da unidade do  produto:");
                    produto.setValor(scanner.nextDouble());
                    System.out.println("Digite a quantidade do produto: ");
                    produto.setQuantiade(scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Qual a quantidade de produtos você deseja?:");
                    produto.setQuantidade_cliente(scanner.nextInt());
                    System.out.println("Temos beneficios dependendo o tipo de pagamento, para compras no Pix, Espécie, Transferência ou Débito, 5 % de desconto " + "e no crédito dividimos em 3x sem juros");
                    System.out.println("Qual a forma de pagamento: ");
                    System.out.println("1 - Pix");
                    System.out.println("2 - Débito");
                    System.out.println("3 - Transferência");
                    System.out.println("4 - Espécie");
                    System.out.println("5 - Crédito");

                    int pagamento = scanner.nextInt();
                    if(pagamento >= 1 && pagamento < 4){
                        double desconto = (produto.getValor() - (produto.getValor()*0.05));
                        System.out.println("Cada unidade do produto sairá por "+desconto+" reais");
                        System.out.println("Valor total será de: "+desconto * produto.getQuantidade_cliente()+" reais");
                    }else if(pagamento == 5){
                        System.out.println("Cada parcela do produto sairá por "+(produto.getQuantidade_cliente() * produto.getValor())/3);

                    }else if (pagamento == 4){
                        System.out.println("Valor do Cliente: ");
                        double valor_cliente = scanner.nextDouble();
                        double total = produto.getValor() * produto.getQuantidade_cliente();
                        if(valor_cliente > total){
                            System.out.println("Seu troco será de: "+(valor_cliente - total));
                        }else if(valor_cliente == total){
                            System.out.println("Compra finalizada");
                        }else{
                            System.out.println("Valor insuficiente");
                        }

                    }else {
                        System.out.println("Algo deu errado, tente novamente");
                    }
                    break;
                case 3:
                    produto.cliente();
                    System.out.println("Produto : "+produto.getNome()+" |  Quantidade: "+ produto.getQuantiade());
            }
            System.out.println("Caso deseja volta para o  menu digite v");
            Ç = scanner.next();
        }while (Ç.equalsIgnoreCase("v"));
    }
}
