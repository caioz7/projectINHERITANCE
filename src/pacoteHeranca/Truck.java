package pacoteHeranca;

public class Truck extends Vehicle {
	
	private String vehicle = "Caminhao";
	private int maximumSpeed = 80;

	public void Show(){
		super.vehicle = this.vehicle;
		super.Show();		
	}
	public void Read(){
		super.vehicle = this.vehicle;
		super.maximumSpeed = this.maximumSpeed ;
		super.Read();
	}

}
