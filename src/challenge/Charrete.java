package challenge;

public class Charrete extends Veiculo{
	
	private boolean toldo;
	
	//Construtor padrão considerando características básicas de uma charrete
	public Charrete() {
		super("", false, false, 2, 0, 2, false, 0, null);
	}
	
	public Charrete(String modelo, Combustivel combustivel, boolean toldo) {
		//Modelo | Motor | Volante | Passageiros | Portas | Rodas | Carga | Carga Máxima | Combustível
		super(modelo, false, false, 2, 0, 2, false, 0, combustivel);
		this.toldo = toldo;
	}

	public boolean isToldo() {
		return toldo;
	}
	public void setToldo(boolean toldo) {
		this.toldo = toldo;
	}

	@Override
	public String toString() {
		String temToldo = this.temComponente(this.toldo);
		return this.getModelo()
				+"\nQuantidade de Passageiros: "+this.getQtdPassageiros()
				+"\nQuantidade de Rodas: "+this.getQtdRodas()
				+"\nToldo: "+temToldo
				+this.getCombustivel().toString();
	}
	
}
