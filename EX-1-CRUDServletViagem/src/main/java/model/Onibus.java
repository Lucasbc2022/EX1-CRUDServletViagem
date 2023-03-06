package model;

public class Onibus {
	
	private String Placa;
	private String Marca;
	private int Ano;
	private String Descricao;
	
	public String getPlaca() {
		return Placa;
	}
	public void setPlaca(String placa) {
		Placa = placa;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public int getAno() {
		return Ano;
	}
	public void setAno(int ano) {
		Ano = ano;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	@Override
	public String toString() {
		return "Onibus [Placa=" + Placa + ", Marca=" + Marca + ", Ano=" + Ano + ", Descricao=" + Descricao + "]";
	}
	
	

	
}
