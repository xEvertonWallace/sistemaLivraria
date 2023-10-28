package sistemaLivraria;

public class Revista extends Titulo {
    private String periodicidade;

    public Revista(String nome, String editora, double preco, String periodicidade) {
        super(nome, editora, preco);
        this.periodicidade = periodicidade;
    }

	public String getPeriodicidade() {
		return periodicidade;
	}

	public void setPeriodicidade(String periodicidade) {
		this.periodicidade = periodicidade;
	}
    
    
}
