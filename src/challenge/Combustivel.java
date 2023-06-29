package challenge;

public class Combustivel {
	
	private boolean gasolina;
	private boolean alcool;
	private boolean diesel;
	private boolean eletrico;
	private boolean forcaHumana;
	private boolean tracaoAnimal;
	
	public Combustivel() {
		this.gasolina = false;
		this.alcool = false;
		this.diesel = false;
		this.eletrico = false;
		this.forcaHumana = false;
		this.tracaoAnimal = false;
	}
	
	public boolean isGasolina() {
		return gasolina;
	}
	public void setGasolina(boolean gasolina) {
		this.gasolina = gasolina;
	}
	public boolean isAlcool() {
		return alcool;
	}
	public void setAlcool(boolean alcool) {
		this.alcool = alcool;
	}
	public boolean isDiesel() {
		return diesel;
	}
	public void setDiesel(boolean diesel) {
		this.diesel = diesel;
	}
	public boolean isEletrico() {
		return eletrico;
	}
	public void setEletrico(boolean eletrico) {
		this.eletrico = eletrico;
	}
	public boolean isForcaHumana() {
		return forcaHumana;
	}
	public void setForcaHumana(boolean forcaHumana) {
		this.forcaHumana = forcaHumana;
	}
	public boolean isTracaoAnimal() {
		return tracaoAnimal;
	}
	public void setTracaoAnimal(boolean tracaoAnimal) {
		this.tracaoAnimal = tracaoAnimal;
	}
	
	@Override
	public String toString() {
		String texto= "\nCombustível: ";
		if(this.gasolina) texto+="Gasolina";
		if(this.alcool) texto+="Alcool";
		if(this.diesel) texto+="Diesel";
		if(this.eletrico) texto+="Elétrico";
		if(this.forcaHumana) texto+="Força Humana";
		if(this.tracaoAnimal) texto+="Tração Animal";
		return texto;
	}

}
