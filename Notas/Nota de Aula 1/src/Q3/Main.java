package Q3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();

        String r;
        do {
            System.out.println("Digite se você quer vizualizar o estoque.");
            System.out.println("Digite se você quer adicionar mais unidades do produto ao estoque.");
            System.out.println("Digite se você quer vender unidades do produto em estoque.");
            System.out.println("Para vizualizar o estoque, digite 1.");
            System.out.println("Para adicionar ao estoque, digite 2.");
            System.out.println("Para vender unidades do estoque, digite 3.");

            int opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Digite a quantidade de produtos do estoque: ");
                    produto.quantidade = scanner.nextInt();
                    System.out.println("A quantidade de produtos são de: "+produto.exibirEstoque());
                    break;

                case 2:
                    System.out.println("Digite a quantidade original de produtos no estoque: ");
                    produto.quantidade = scanner.nextInt();
                    System.out.println("Digite a Quantidade de produtos que voce deseja adicionar: ");
                    produto.quantidade1 = scanner.nextInt();
                    System.out.println("A quantidade atual de produtos é de: "+ produto.adicionarEstoque());
                    break;

                case 3:
                    System.out.println("Digite a quantidade de produtos no estoque: ");
                    produto.quantidade = scanner.nextInt();
                    System.out.println("Digite a Quantidade do produto que será vendido: ");
                    produto.quantidade1 = scanner.nextInt();
                    System.out.println("A quantidade do estoque após a venda foi de: " + produto.venderProduto());
                    break;

            }
            System.out.println("Caso queira ver outra operação, Digite S");
            r = scanner.next();
        }while(r.equalsIgnoreCase("S"));
    }
}
