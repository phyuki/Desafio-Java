package challenge;

public class Veiculo {
	
	private String modelo;
	private boolean motor;
	private boolean volante;
	private int qtdPassageiros;
	private int qtdPortas;
	private int qtdRodas;
	private boolean carga;
	private int cargaMaxima;
	private Combustivel combustivel;
	
	public Veiculo(String modelo, boolean motor, boolean volante, int qtdPassageiros, int qtdPortas, int qtdRodas, boolean carga,
			int cargaMaxima, Combustivel combustivel) {
		this.modelo = modelo;
		this.motor = motor;
		this.volante = volante;
		this.qtdPassageiros = qtdPassageiros;
		this.qtdPortas = qtdPortas;
		this.qtdRodas = qtdRodas;
		this.carga = carga;
		this.cargaMaxima = cargaMaxima;
		this.combustivel = combustivel;
	}
	
	public String temComponente(boolean comp) {
		return comp ? "Sim" : "Não";
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean isMotor() {
		return motor;
	}
	public void setMotor(boolean motor) {
		this.motor = motor;
	}
	public boolean isVolante() {
		return volante;
	}
	public void setVolante(boolean volante) {
		this.volante = volante;
	}
	public int getQtdPassageiros() {
		return qtdPassageiros;
	}
	public void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}
	public int getQtdPortas() {
		return qtdPortas;
	}
	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}
	public int getQtdRodas() {
		return qtdRodas;
	}
	public void setQtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}
	public boolean isCarga() {
		return carga;
	}
	public void setCarga(boolean carga) {
		this.carga = carga;
	}
	public int getCargaMaxima() {
		return cargaMaxima;
	}
	public void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}
	public Combustivel getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
	}
	
}
