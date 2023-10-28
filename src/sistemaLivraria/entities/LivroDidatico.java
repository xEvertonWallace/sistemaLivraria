package sistemaLivraria.entities;

public class LivroDidatico extends Livro{
	
	private String area;

	public LivroDidatico(String nome, String autorPrincipal, String editora, String resumo, double preco, String area) {
		super(nome, autorPrincipal, editora, resumo, preco);
		this.area = area;
	}

	public String getArea() {
		return area;
	}
}
