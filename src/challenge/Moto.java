package challenge;

public class Moto extends Veiculo{

	private boolean partidaEletrica;
	
	public Moto(String modelo, Combustivel combustivel, boolean partidaEletrica) {
		//Modelo | Motor | Volante | Passageiros | Portas | Rodas | Carga | Carga Máxima | Combustível
		super(modelo, true, false, 1, 0, 2, false, 0, combustivel);
		this.partidaEletrica = partidaEletrica;
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
		String texto = this.getModelo()+"\nPartida Elétrica: "+partida
				+"\nQuantidade de Passageiros: "+this.getQtdPassageiros()
				+"\nQuantidade de Rodas: "+this.getQtdRodas()+this.getCombustivel().toString();
		return texto;
	}
}
