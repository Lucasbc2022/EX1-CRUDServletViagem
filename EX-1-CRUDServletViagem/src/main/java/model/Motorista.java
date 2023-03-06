package model;

public class Motorista {
	
	private int Codigo;
	private String Nome;
	private String Naturalidade;
	
	
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getNaturalidade() {
		return Naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		Naturalidade = naturalidade;
	}
	@Override
	public String toString() {
		return "Motorista [Codigo=" + Codigo + ", Nome=" + Nome + ", Naturalidade=" + Naturalidade + "]";
	}
	

	
}
