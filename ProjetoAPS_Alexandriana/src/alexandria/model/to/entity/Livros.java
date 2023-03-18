package alexandria.model.to.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ALX_LIVROS")
public class Livros {
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Long idLivros;
	
	@Column(name="NOME")
	private String nome;
	
	@Column(name="GENERO")
	private String genero;
	
	@Column(name="AUTORIA")
	private String author;
	
	@Column(name="DATA_PUBLI")
	private Date dataPub;
	
	//	Construtor
	public Livros(String nome, String genero, String author, Date dataPub) {
		setNome(nome);
		setGenero(genero);
		setAuthor(author);
		setDataPub(dataPub);
	}
	
	//	 Getters e Setters
	public Long getIdLivros() {
		return idLivros;
	}
	public void setIdLivros(Long idLivros) {
		this.idLivros = idLivros;
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
   // TODO document why this method is empty
 }
}
