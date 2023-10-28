package sistemaLivraria.entities;

public class Titulo {
    protected String nome;
    protected String editora;
    protected double preco;

    public Titulo(String nome, String editora, double preco) {
        this.nome = nome;
        this.editora = editora;
        this.preco = preco;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + nome);
        System.out.println("Editora: " + editora);
        System.out.println("Preço: " + preco);
    }
}
