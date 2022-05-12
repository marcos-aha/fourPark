package br.com.Fourcamp.fourParkMarcos.model;

public class Vagas {
	private Integer posicao;
	private String horaEntrada;
	private String horaSaida;
	private boolean ocupado = false ;
	private Veiculo veiculo;
	
	public Vagas (Integer posicao ) {
		this.posicao = posicao;
	}
	
	public Vagas(Integer posicao, String horaEntrada, Veiculo veiculo) {
		this.horaEntrada = horaEntrada;
		this.posicao = posicao;
		this.veiculo = veiculo;
		this.ocupado = true;
	}
	public String getHoraEntrada() {
		return horaEntrada;
	}
	public void setHoraEntrada(String horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	public String getHoraSaida() {
		return horaSaida;
	}
	public void setHoraSaida(String horaSaida) {
		this.horaSaida = horaSaida;
	}
	public boolean isOcupado() {
		return ocupado;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public Integer getPosicao() {
		return posicao;
	}
	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}
	
	@Override
	public String toString() {
		return "Vagas [posicao=" + posicao + ", horaEntrada=" + horaEntrada + ", horaSaida=" + horaSaida + ", ocupado="
				+ ocupado + ", veiculo=" + veiculo + "]";
	}
}

