package sistemaLivraria;

public class Livro extends Titulo {
    private String autor;
    private String resumo;
  

    public Livro(String nome, String autor, String editora, String resumo, double preco) {
        super(nome, editora, preco);
        this.autor = autor;
        this.resumo = resumo;
    }


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getResumo() {
		return resumo;
	}


	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
    
    
   
}
