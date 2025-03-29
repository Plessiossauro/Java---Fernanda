package Q1;

public class Main {
    public static void main(String[] args){

        Cavalo cavalo = new Cavalo(1.70,"verde","Bretão","Leão");
        Leao leao = new Leao(2.00,"laranja",true,"Cavalo");


        System.out.println("Infomações sobre o cavalo\n");
        System.out.println("Tamanho do cavalo: "+ cavalo.getTamanho()+" m");
        System.out.println("A Cor do Cavalo: "+ cavalo.getCor());
        System.out.println("Sua Raça: "+cavalo.getRaca());
        cavalo.fugir();
        System.out.println("O Cavalo esta Fugindo do "+ cavalo.getNome());

        System.out.println("\nInformações sobre o Leão\n");
        System.out.println("Tamanho do Leão: "+ leao.getTamanho()+" m");
        System.out.println("A Cor do Leão: "+ leao.getCor());
        System.out.println("Ele tem Juba?: "+leao.getJuba());
        leao.cacar();
        System.out.println("O Leão está caçando o "+leao.getNome());





    }
}