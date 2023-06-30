package challenge;

public class Moto extends Veiculo{

	private boolean partidaEletrica;
	
	//Construtor padrão considerando características básicas de uma moto
	public Moto() {
		super("", true, false, 1, 0, 2, false, 0, null);
	}
	
	public Moto(String modelo, Combustivel combustivel, boolean partidaEletrica) {
		//Modelo | Motor | Volante | Passageiros | Portas | Rodas | Carga | Carga Máxima | Combustível
		super(modelo, true, false, 1, 0, 2, false, 0, combustivel);
		this.partidaEletrica = partidaEletrica;
	}

	//Motocicletas tem uma tarifa mais barata do que outros automóveis
	@Override
	public double pedagio(double tarifaBase) {
		return 0.55*tarifaBase;
	}
	
	public boolean isPartidaEletrica() {
		return partidaEletrica;
	}
	public void setPartidaEletrica(boolean partidaEletrica) {
		this.partidaEletrica = partidaEletrica;
	}

	@Override
	public String toString() {
		String partida = this.temComponente(this.partidaEletrica);
		String texto = this.getModelo()
				+"\nQuantidade de Passageiros: "+this.getQtdPassageiros()
				+"\nQuantidade de Rodas: "+this.getQtdRodas()
				+"\nPartida Elétrica: "+partida
				+this.getCombustivel().toString();
		return texto;
	}
}
