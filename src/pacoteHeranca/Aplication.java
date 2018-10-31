package pacoteHeranca;

public class Aplication {

	public static void main(String[] args) {
		Car carro = new Car();
		Motorcycle moto = new Motorcycle();
		Truck cam = new Truck();
		
		carro.Read();
		moto.Read();
		cam.Read();
		
		
		for(int i = 0; i < 50; i++){
			System.out.println(" ");
		}	
		carro.Show();
		moto.Show();
		cam.Show();	

	}

}
