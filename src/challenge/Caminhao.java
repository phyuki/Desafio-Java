package challenge;

public class Caminhao extends Veiculo{

	private int qtdEixos;
	
	//Construtor padrão considerando características básicas de um caminhão
	public Caminhao() {
		super("", true, true, 2, 2, 4, true, 0, null);
	}
	
	public Caminhao(String modelo, int qtdRodas, int cargaMaxima, Combustivel combustivel, int qtdEixos) {
		//Modelo | Motor | Volante | Passageiros | Portas | Rodas | Carga | Carga Máxima | Combustível
		super(modelo, true, true, 2, 2, qtdRodas, true, cargaMaxima, combustivel);
		this.qtdEixos = qtdEixos;
	}

	public int getQtdEixos() {
		return qtdEixos;
	}
	public void setQtdEixos(int qtdEixos) {
		this.qtdEixos = qtdEixos;
	}

	@Override
	public String toString() {
		return this.getModelo()
				+"\nQuantidade de Eixos: "+this.qtdEixos
				+"\nQuantidade de Rodas: "+this.getQtdRodas()
				+"\nCarga Máxima: "+this.getCargaMaxima()+" KG"
				+this.getCombustivel().toString();
	}
}
