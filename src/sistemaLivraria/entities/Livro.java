package sistemaLivraria.entities;

public class Livro extends Titulo {
    private String autor;
    private String resumo;
    private String area;

    public Livro(String nome, String autor, String editora, String resumo, double preco, String area) {
        super(nome, editora, preco);
        this.autor = autor;
        this.resumo = resumo;
        this.area = area;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Autor: " + autor);
        System.out.println("Resumo: " + resumo);
        System.out.println("Área: " + area);
    }
}
