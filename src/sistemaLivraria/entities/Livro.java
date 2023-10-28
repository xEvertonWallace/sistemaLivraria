package sistemaLivraria.entities;

public class Livro {
	private String nome;
	private String autorPrincipal;
	private String editora;
	private String resumo;
	private double preco;
	private String area;

	public Livro(String nome, String autorPrincipal, String editora, String resumo, double preco, String area) {
		this.nome = nome;
		this.autorPrincipal = autorPrincipal;
		this.editora = editora;
		this.resumo = resumo;
		this.preco = preco;
		this.area = area;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public String getArea() {
		return area;
	}

	public double calcularPrecoFinal() {
		double iss = 0;
		double precoFinal = 0;

		if (this instanceof LivroDidatico) {
			iss = this.preco * 0.1;
			precoFinal = this.preco + iss;
		} else {
			iss = this.preco * 0.03;
			precoFinal = this.preco + iss;
		}

		return precoFinal;
	}

	@Override
	public String toString() {
		return "Livro: " + nome + "\nAutor Principal: " + autorPrincipal + "\nEditora: " + editora + "\nResumo: "
				+ resumo + "\nPreço Original: " + preco + "\nValor do ISS: " + calcularPrecoFinal() + "\nPreço Final: "
				+ calcularPrecoFinal();
	}
}
