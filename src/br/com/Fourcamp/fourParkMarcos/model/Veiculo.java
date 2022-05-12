package br.com.Fourcamp.fourParkMarcos.model;

public class Veiculo {
	private String placa;
	private String modelo;
	private String proprietario;
	private String documento;
	
	public Veiculo() {
		
	}
	public Veiculo(String placa, String modelo, String proprietario, String documento) {
		this.placa = placa;
		this.modelo = modelo;
		this.proprietario = proprietario;
		this.documento = documento;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getProprietario() {
		return proprietario;
	}
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getDocumento() {
		return documento;
	}
	@Override
	public String toString() {
		return "[placa=" + placa + ", modelo=" + modelo + ", proprietario=" + proprietario + ", documento="
				+ documento + "]";
	}
	
	
	
	
	
	
}
