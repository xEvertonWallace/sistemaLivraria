package sistemaLivraria;

class LivroDidatico extends Livro {
    private String area;

    public LivroDidatico(String nome, String autor, String editora, String resumo, double preco, String area) {
        super(nome, autor, editora, resumo, preco);
        this.area = area;
    }

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
    
    

}    