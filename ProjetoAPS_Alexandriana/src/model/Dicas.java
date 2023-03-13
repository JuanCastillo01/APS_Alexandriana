package model;

public class Dicas {
	//	Atributos
	private int idDicas;
	private String dica;
	private char dif;
	private int fkLivros;
	
	
	//	Construtor
	public Dicas(int idDicas, String dica, char dif, int fkLivros) {
		setIdDicas(idDicas);
		setDica(dica);
		setDif(dif);
		setFkLivros(fkLivros);
	}
	
	//	Getters e Setters
	public int getIdDicas() {
		return idDicas;
	}
	public void setIdDicas(int id) {
		this.idDicas = id;
	}
	public String getDica() {
		return dica;
	}
	public void setDica(String dica) {
		this.dica = dica;
	}
	public char getDif() {
		return dif;
	}
	public void setDif(char dif) {
		this.dif = dif;
	}
	public int getFkLivros() {
		return fkLivros;
	}
	public void setFkLivros(int fkLivros) {
		this.fkLivros = fkLivros;
	}
	
}
