package challenge;

public class Application {

	public static void main(String[] args) {
		
		Combustivel combMoto = new Combustivel();
		combMoto.setGasolina(true);
		Moto moto = new Moto("Honda Titan", combMoto, true);
		System.out.println(moto.toString()+"\n");
		
		Combustivel combBicicleta = new Combustivel();
		combBicicleta.setForcaHumana(true);
		Bicicleta bike = new Bicicleta("BMX Street", combBicicleta, false, false);
		System.out.println(bike.toString()+"\n");
		
		Combustivel combCharrete = new Combustivel();
		combCharrete.setTracaoAnimal(true);
		Charrete charrete = new Charrete("Social L11/C", combCharrete, true);
		System.out.println(charrete.toString()+"\n");
		
		Combustivel combCaminhao = new Combustivel();
		combCaminhao.setDiesel(true);
		Caminhao truck = new Caminhao("Mercedes-Benz Actros 6X2", 6, 60000,  combCaminhao, 3);
		System.out.println(truck.toString()+"\n");
		
		Combustivel combCarro = new Combustivel();
		combCarro.setEletrico(true);
		Carro carro = new Carro("BMW iX", 4, 4, combCarro, true, true, true, true);
		System.out.println(carro.toString()+"\n");
		
		//Também há a possibilidade de inserir os dados do veículo manualmente através dos setters
		Combustivel combCarro2 = new Combustivel();
		combCarro2.setAlcool(true);
		Carro carro2 = new Carro();
		carro2.setModelo("Fiat Uno");
		carro2.setQtdPassageiros(4);
		carro2.setQtdPortas(4);
		carro2.setAutomatico(false);
		carro2.setArCondicionado(true);
		carro2.setRadio(true);
		carro2.setAirbags(true);
		carro2.setCombustivel(combCarro2);
		System.out.println(carro2.toString()+"\n");
	}

}
