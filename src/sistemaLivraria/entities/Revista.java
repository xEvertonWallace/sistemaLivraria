package sistemaLivraria.entities;

public class Revista extends Titulo {
    private String periodicidade;

    public Revista(String nome, String editora, double preco, String periodicidade) {
        super(nome, editora, preco);
        this.periodicidade = periodicidade;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Periodicidade: " + periodicidade);
    }
}
