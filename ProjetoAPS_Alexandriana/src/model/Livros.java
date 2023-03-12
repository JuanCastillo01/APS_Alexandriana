package model;

import java.util.Date;

public class Livros {
	private int id_Livros;

	private String Nome;
	private String Genero;
	private String Author;
	private Date Data_pub;
	
	public int getId_Livros() {
		return id_Livros;
	}
	public void setId_Livros(int id_Livros) {
		this.id_Livros = id_Livros;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getGenero() {
		return Genero;
	}
	public void setGenero(String genero) {
		Genero = genero;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public Date getData_pub() {
		return Data_pub;
	}
	public void setData_pub(Date data_pub) {
		Data_pub = data_pub;
	}
	//	Inserir livro na base de dado
	public void cadastrarLivro() {
		
	}
}
