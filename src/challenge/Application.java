package challenge;

public class Application {

	public static void main(String[] args) {
		
		Combustivel combMoto = new Combustivel();
		combMoto.setGasolina(true);
		Moto moto = new Moto("Honda Titan", combMoto, true);
		System.out.print(moto.toString());
		
	}

}
