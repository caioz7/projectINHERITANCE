package pacoteHeranca;

public class Motorcycle extends Vehicle {

	private String vehicle = "Moto";
	private int maximumSpeed = 90;

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
