package model;



public class Viagem {
	
	private int codigo_viagem;
	private String placa_onibus;
	private String hora_de_Saida;
	private String hora_de_Chegada;
	private String partida;
	private String destino;
	public int getCodigo_viagem() {
		return codigo_viagem;
	}
	public void setCodigo_viagem(int codigo_viagem) {
		this.codigo_viagem = codigo_viagem;
	}
	public String getPlaca_onibus() {
		return placa_onibus;
	}
	public void setPlaca_onibus(String placa_onibus) {
		this.placa_onibus = placa_onibus;
	}
	public String getHora_de_Saida() {
		return hora_de_Saida;
	}
	public void setHora_de_Saida(String hora_de_Saida) {
		this.hora_de_Saida = hora_de_Saida;
	}
	public String getHora_de_Chegada() {
		return hora_de_Chegada;
	}
	public void setHora_de_Chegada(String hora_de_Chegada) {
		this.hora_de_Chegada = hora_de_Chegada;
	}
	public String getPartida() {
		return partida;
	}
	public void setPartida(String partida) {
		this.partida = partida;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	@Override
	public String toString() {
		return "Viagem [codigo_viagem=" + codigo_viagem + ", placa_onibus=" + placa_onibus + ", hora_de_Saida="
				+ hora_de_Saida + ", hora_de_Chegada=" + hora_de_Chegada + ", partida=" + partida + ", destino="
				+ destino + "]";
	}
	

	
	


	

	

	
}
