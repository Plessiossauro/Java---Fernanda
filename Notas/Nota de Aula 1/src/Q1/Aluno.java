package Q1;

public class Aluno {
    double n1, n2, n3, media;

    String nome;

    public void calcular_media() {
        media = (n1+n2+n3)/3;
        System.out.println(media);
        System.out.println(nome);
    }
}
