package Introductor__Hsn__OOP03;

public class Bicycle implements Vehicle{
	int gear;
	int speed;
	
	@Override
	public void changeGear(int newGear) {
		gear=newGear;
	}
	
	@Override
	public void speedUp(int increment) {
		
		speed+=increment;
	}

    @Override
	public void applyBreak(int decrement) {
		speed-=decrement;		
	}
	
	public void printState() {
		System.out.println("Gear : "+gear + "\n"+"Speed :"+speed);
	}

}
