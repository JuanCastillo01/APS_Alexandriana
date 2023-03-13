package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import controller.PostgreSQL_Alexandria;

public class Livros {
	
	// Atributos
	private int idLivros;
	private String nome;
	private String genero;
	private String author;
	private Date dataPub;
	
	//	Construtor
	public Livros(String nome, String genero, String author, Date dataPub) {
		setNome(nome);
		setGenero(genero);
		setAuthor(author);
		setDataPub(dataPub);
	}
	
	//	 Getters e Setters
	public int getIdLivros() {
		return idLivros;
	}
	public void setIdLivros(int id_Livros) {
		this.idLivros = id_Livros;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getDataPub() {
		return dataPub;
	}
	public void setDataPub(Date dataPub) {
		this.dataPub = dataPub;
	}
	
	public void cadastrarLivro() {
		
		
		PostgreSQL_Alexandria conectInst = new PostgreSQL_Alexandria();
		
		try {
			Connection conn = conectInst.connect();
			Statement lastLine = conn.createStatement();
			ResultSet id = lastLine.executeQuery("SELECT MAX(\"ID\")FROM public.\"ALX_LIVROS\";");
			setIdLivros(id.getInt(0));
			Statement insertRow = conn.createStatement();
			String statementText = String.format("INSERT INTO public.\"ALX_LIVROS\"(\"ID\", \"NOME\", \"GENERO\", \"AUTORIA\", \"DATA_PUBLI\")VALUES ('%i', '{%s}', '{%s}', '{%s}', '{%s}');", this.getIdLivros(), this.getNome(), this.getGenero(), this.getAuthor(), this.getDataPub());
			insertRow.executeUpdate(statementText);
			 
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
