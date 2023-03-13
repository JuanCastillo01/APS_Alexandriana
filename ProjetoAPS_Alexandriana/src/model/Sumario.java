package model;

public class Sumario {
	private int idSumario;
	private String sumA;
	private String sumB;
	private String sumC;
	private String sumTotal;
	private int fkLivro;
	
	//Constructor
	public Sumario(int id, String sumarioA,String sumarioB, String sumarioC, String sumarioTotal, int fkLivro) {
		setIdSumario(id);
		setSumA(sumarioA);
		setSumB(sumarioB);
		setSumC(sumarioC);
		setSumTotal(sumarioTotal);
		setFkLivro(fkLivro);
	}
	
	//gettes e setters
	public int getIdSumario() {
		return idSumario;
	}
	public void setIdSumario(int idSumario) {
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
	public int getFkLivro() {
		return fkLivro;
	}
	public void setFkLivro(int fkLivro) {
		this.fkLivro = fkLivro;
	}
	
}
