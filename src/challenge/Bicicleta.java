package challenge;

public class Bicicleta extends Veiculo{

	private boolean motorEletrico;
	private boolean bagageiro;

	//Construtor padrão considerando características básicas de uma bicicleta
	public Bicicleta() {
		super("", false, false, 0, 0, 2, false, 0, null);
	}
	
	public Bicicleta(String modelo, Combustivel combustivel, boolean motorEletrico, boolean bagageiro) {
		//Modelo | Motor | Volante | Passageiros | Portas | Rodas | Carga | Carga Máxima | Combustível
		super(modelo, motorEletrico, false, 0, 0, 2, false, 0, combustivel);
		this.motorEletrico = motorEletrico;
		this.bagageiro = bagageiro;
	}
	
	//Bicicletas não entram no rigor do pedágio
	@Override
	public double pedagio(double tarifaBase) {
		return 0.0;
	}
	
	public boolean isMotorEletrico() {
		return motorEletrico;
	}
	public void setMotorEletrico(boolean motorEletrico) {
		this.motorEletrico = motorEletrico;
	}
	public boolean isBagageiro() {
		return bagageiro;
	}
	public void setBagageiro(boolean bagageiro) {
		this.bagageiro = bagageiro;
	}
	
	@Override
	public String toString() {
		String eletrico = this.temComponente(this.motorEletrico);
		String temBagageiro = this.temComponente(this.bagageiro);
		return this.getModelo()
				+"\nMotor Elétrico: "+eletrico
				+"\nBagageiro: "+temBagageiro
				+this.getCombustivel().toString();
	}
	
}
