package challenge;

public class Carro extends Veiculo{

	private boolean automatico;
	private boolean arCondicionado;
	private boolean radio;
	private boolean airbags;
	
	public Carro(String modelo, int qtdPassageiros, int qtdPortas, Combustivel combustivel, 
			boolean automatico, boolean arCondicionado, boolean radio, boolean airbags) {
		//Modelo | Motor | Volante | Passageiros | Portas | Rodas | Carga | Carga Máxima | Combustível
		super(modelo, true, true, qtdPassageiros, qtdPortas, 4, false, 0, combustivel);
		this.automatico = automatico;
		this.arCondicionado = arCondicionado;
		this.radio = radio;
		this.airbags = airbags;
	}
	
	
	public boolean isAutomatico() {
		return automatico;
	}
	public void setAutomatico(boolean automatico) {
		this.automatico = automatico;
	}
	public boolean isArCondicionado() {
		return arCondicionado;
	}
	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}
	public boolean isRadio() {
		return radio;
	}
	public void setRadio(boolean radio) {
		this.radio = radio;
	}
	public boolean isAirbags() {
		return airbags;
	}
	public void setAirbags(boolean airbags) {
		this.airbags = airbags;
	}

	@Override
	public String toString() {
		String temCambioAutomatico = this.temComponente(this.automatico);
		String temAC = this.temComponente(this.arCondicionado);
		String temRadio = this.temComponente(this.radio);
		String temAirbags = this.temComponente(this.airbags);
		return this.getModelo() +"\nQuantidade de Passageiros: "+this.getQtdPassageiros()
				+"\nQuantidade de Portas: "+this.getQtdPortas()
				+"\nCâmbio Automático: "+temCambioAutomatico
				+"\nAr Condicionado: "+temAC
				+"\nRadio: "+temRadio
				+"\ntemAirbags: "+temAirbags
				+this.getCombustivel().toString();
	}
}
