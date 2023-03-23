package alexandria.core.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ALX_LIVROS")
public class Livro {
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Long sequencial;
	
	@Column(name="NOME")
	private String nome;
	
	@Column(name="GENERO")
	private String genero;
	
	@Column(name="AUTORIA")
	private String author;
	
	@Column(name="DATA_PUBLI")
	private Date dataPub;
	
	//	 Getters e Setters
	public Long getSequencial() {
		return sequencial;
	}
	public void setSequencial(Long idLivros) {
		this.sequencial = idLivros;
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
	

}
