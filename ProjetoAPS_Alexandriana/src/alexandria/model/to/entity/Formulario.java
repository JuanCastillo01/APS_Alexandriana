package alexandria.model.to.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ALX_FORMULARIO")
public class Formulario {
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Long idForm;

	@Column(name="SUG_LIVRO")
	private String sugLivro;

	@Column(name="SAT_SCORE")
	private Integer satScore;

	@Column(name="COMENTARIOS")
	private String comentarios;
	
	@Column(name="FK_USER")
	private String idUsuario;
	
}
