package sistemaLivraria;

public class Titulo {
    protected String nome;
    protected String editora;
    protected double preco;

    public Titulo(String nome, String editora, double preco) {
        this.nome = nome;
        this.editora = editora;
        this.preco = preco;
    }

    public void calcularPrecoFinal() {
        double iss = 0.0;
        double precoFinal = 0.0;

        if (this instanceof Livro) {
            iss = preco * 0.03; 
        } else if (this instanceof LivroDidatico) {
            iss = preco * 0.10;
        } else if (this instanceof Revista) {
            iss = preco * 0.10; 
        }

        precoFinal = preco + iss;

        System.out.println("Título: " + nome);
        System.out.println("Preço Original: R$" + preco);
        System.out.println("Valor do ISS: R$" + iss);
        System.out.println("Preço Final: R$" + precoFinal);
    }

}
