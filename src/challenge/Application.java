package challenge;

import java.text.DecimalFormat;

//Foi adicionado um contexto de pedágio para testar o polimorfismo entre as classes filhas de Veiculo
public class Application {

	public static void main(String[] args) {
		
		//Valor do pedágio para automóveis convencionais
		double valorPedagio = 4.70;
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Pedágio - Tarifa Convencional: R$ "+df.format(valorPedagio)+'\n');
		
		//Instanciando objetos com os construtores completos
		Combustivel combMoto = new Combustivel();
		combMoto.setGasolina(true);
		Moto moto = new Moto("Honda Titan", combMoto, true);
		System.out.println(moto.toString());
		System.out.println("Valor do Pedágio: R$ "+df.format(moto.pedagio(valorPedagio))+"\n");
		
		Combustivel combBicicleta = new Combustivel();
		combBicicleta.setForcaHumana(true);
		Bicicleta bike = new Bicicleta("BMX Street", combBicicleta, false, false);
		System.out.println(bike.toString());
		System.out.println("Valor do Pedágio: R$ "+df.format(bike.pedagio(valorPedagio))+"\n");
		
		Combustivel combCharrete = new Combustivel();
		combCharrete.setTracaoAnimal(true);
		Charrete charrete = new Charrete("Charrete Social L11/C", combCharrete, true);
		System.out.println(charrete.toString());
		System.out.println("Valor do Pedágio: R$ "+df.format(charrete.pedagio(valorPedagio))+"\n");
		
		Combustivel combCaminhao = new Combustivel();
		combCaminhao.setDiesel(true);
		Caminhao truck = new Caminhao("Mercedes-Benz Actros 6X2", 6, 60000,  combCaminhao, 3);
		System.out.println(truck.toString());
		System.out.println("Valor do Pedágio: R$ "+df.format(truck.pedagio(valorPedagio))+"\n");
		
		Combustivel combCarro = new Combustivel();
		combCarro.setEletrico(true);
		Carro carro = new Carro("BMW iX", 4, 4, combCarro, true, true, true, true);
		System.out.println(carro.toString());
		System.out.println("Valor do Pedágio: R$ "+df.format(carro.pedagio(valorPedagio))+"\n");
		
		//Também há a possibilidade de inserir os dados do veículo manualmente através dos setters
		Combustivel combCarro2 = new Combustivel();
		combCarro2.setAlcool(true);
		Carro carroCarga = new Carro();
		carroCarga.setModelo("Fiat Uno");
		carroCarga.setQtdPassageiros(4);
		carroCarga.setQtdPortas(4);
		carroCarga.setCarga(true);
		carroCarga.setAutomatico(false);
		carroCarga.setArCondicionado(true);
		carroCarga.setRadio(true);
		carroCarga.setAirbags(true);
		carroCarga.setCombustivel(combCarro2);
		System.out.println(carroCarga.toString());
		System.out.println("Valor do Pedágio: R$ "+df.format(carroCarga.pedagio(valorPedagio))+"\n");
	}

}
