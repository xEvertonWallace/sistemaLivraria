package sistemaLivraria;

import java.util.ArrayList;
import java.util.List;

class Livraria {
    private String nome;
    private List<Titulo> titulos;

    public Livraria(String nome) {
        this.nome = nome;
        this.titulos = new ArrayList<>();
    }

    public void cadastrarTitulo(Titulo titulo) {
        titulos.add(titulo);
    }

    public void imprimirTodosTitulos() {
        for (Titulo titulo : titulos) {
            titulo.calcularPrecoFinal();
        }
    }

    public static void main(String[] args) {
        Livraria livraria = new Livraria("Minha Livraria");

        Livro livro1 = new Livro("Livro 1", "Autor 1", "Editora 1", "Resumo 1", 50.0);
        LivroDidatico livro2 = new LivroDidatico("Livro 2", "Autor 2", "Editora 2", "Resumo 2", 60.0, "Informática");
        Revista revista1 = new Revista("Revista 1", "Editora 3", 20.0, "Mensal");

        livraria.cadastrarTitulo(livro1);
        livraria.cadastrarTitulo(livro2);
        livraria.cadastrarTitulo(revista1);

        livraria.imprimirTodosTitulos();
    }
}