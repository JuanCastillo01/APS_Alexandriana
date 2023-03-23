package alexandria.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ALX_DICAS")
public class Trecho {
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Long idTrecho;
	
	@Column(name="TRECHO")
	private String textTrecho;
	
	@Column(name="DIF",length=1)
	private String dif;
	
	@Column(name="FK_LIVRO")
	private Long idLivro;

	public Long getIdTrecho() {
		return idTrecho;
	}

	public void setIdTrecho(Long idTrecho) {
		this.idTrecho = idTrecho;
	}

	public String getTrecho() {
		return textTrecho;
	}

	public void setTrecho(String trecho) {
		this.textTrecho = trecho;
	}

	public String getDif() {
		return dif;
	}

	public void setDif(String dif) {
		this.dif = dif;
	}

	public Long getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(Long idLivro) {
		this.idLivro = idLivro;
	}
}
