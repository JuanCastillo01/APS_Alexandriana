package alexandria.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ALX_SUMARIO")
public class Sumario {
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Long idSumario;
	
	@Column(name="SUM_A")
	private String sumA;
	
	@Column(name="SUM_B")
	private String sumB;
	
	@Column(name="SUM_C")
	private String sumC;
	
	@Column(name="SUM")
	private String sumTotal;
	
	@Column(name="FK_LIVRO")
	private Long idLivro;
	
	//Constructor
	public Sumario(Long id, String sumarioA,String sumarioB, String sumarioC, String sumarioTotal, Long fkLivro) {
		setIdSumario(id);
		setSumA(sumarioA);
		setSumB(sumarioB);
		setSumC(sumarioC);
		setSumTotal(sumarioTotal);
		setFkLivro(fkLivro);
	}
	
	//gettes e setters
	public Long getIdSumario() {
		return idSumario;
	}
	public void setIdSumario(Long idSumario) {
		this.idSumario = idSumario;
	}
	public String getSumA() {
		return sumA;
	}
	public void setSumA(String sumA) {
		this.sumA = sumA;
	}
	public String getSumB() {
		return sumB;
	}
	public void setSumB(String sumB) {
		this.sumB = sumB;
	}
	public String getSumC() {
		return sumC;
	}
	public void setSumC(String sumC) {
		this.sumC = sumC;
	}
	public String getSumTotal() {
		return sumTotal;
	}
	public void setSumTotal(String sumTotal) {
		this.sumTotal = sumTotal;
	}
	public Long getFkLivro() {
		return idLivro;
	}
	public void setFkLivro(Long fkLivro) {
		this.idLivro = fkLivro;
	}
	
}
