package pacoteHeranca;

public class Car extends Vehicle  {
	
	private String vehicle = "Carro";
	private int maximumSpeed = 110;

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
