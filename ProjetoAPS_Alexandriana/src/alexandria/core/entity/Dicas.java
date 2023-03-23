package alexandria.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ALX_DICAS")
public class Dicas {
	//	Atributos
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int idDicas;
	
	@Column(name="DICAS")
	private String dica;
	
	@Column(name="DIF", length=1)
	private String dif;
	
	@Column(name="FK_LIVROS")
	private int idLivros;
	
	
	//	Construtor
	public Dicas(int idDicas, String dica, String dif, int fkLivros) {
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
	public String getDif() {
		return dif;
	}
	public void setDif(String dif) {
		this.dif = dif;
	}
	public int getFkLivros() {
		return idLivros;
	}
	public void setFkLivros(int fkLivros) {
		this.idLivros = fkLivros;
	}
	
}
