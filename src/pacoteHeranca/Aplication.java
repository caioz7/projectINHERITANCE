package pacoteHeranca;

public class Aplication {

	public static void main(String[] args) {
		Car c = new Car();
		Motorcycle m = new Motorcycle();
		Truck cam = new Truck();
		
		c.Read();
		m.Read();
		cam.Read();
		
		
		for(int i = 0; i < 50; i++){
			System.out.println(" ");
		}	
		c.Show();
		m.Show();
		cam.Show();		

	}

}
