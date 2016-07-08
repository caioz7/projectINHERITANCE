package pacoteHeranca;

import java.util.Scanner;

public class Vehicle  {
	
	protected String brand;
	protected String model;
	protected String vehicle;
	protected String color;
	protected int maximumSpeed;
	protected int speed;
	
	private static Scanner scanf;
	
	void Read(){
		scanf = new Scanner(System.in);
		System.out.println("[ - " + this.vehicle.toUpperCase() + " - ]");
		System.out.print("Informe a marca do(a) " + this.vehicle + " : ");
		brand = scanf.next();
		System.out.print("Informe o modelo do(a) " + this.vehicle + " : ");
		model = scanf.next();
		System.out.print("Informe a cor do(a) " + this.vehicle + " : ");
		color = scanf.next();
		System.out.print("Informe a velocidade(Max permitida: " + maximumSpeed + ") : ");
		speed = scanf.nextInt();
		
	}
	void GetSpeed(int maximumSpeed, int speed){
		speed = this.speed;
		maximumSpeed = this.maximumSpeed;
		if(speed > maximumSpeed){
			System.out.println("Velocidade do(a) " + vehicle + " acima do limite de " + maximumSpeed + " Km/h");
		}else
			System.out.println("Velocidade dentro do limite. " + speed + " Km/h");
	}
	
	void Show(){
		System.out.println(" - " + vehicle.toUpperCase() + " - ");
		System.out.println("Marca: " + brand + "\nModelo: " + model + "\nCor: " + color);
		GetSpeed(maximumSpeed, speed);
		System.out.println();
	}
}
