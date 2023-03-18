package alexandria.model.to.entity;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ALX_HISTORICO")
public class EntradaHistorico {

	@Id
	@GeneratedValue
	@Column(name="ID")
	private Long idEntrada;
	
	@Column(name="DATE")
	private Date dataEntrada;
	
	@Column(name="SCORE")
	private BigInteger score;
	
	@Column(name="FK_LIVRO")
	private Long idLivro;
	
	@Column(name="FK_USER")
	private Long idUsuario;

}
