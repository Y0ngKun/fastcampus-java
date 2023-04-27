package ch09;

public class Desktop extends Computer {

	@Override
	public void display() {
		System.out.println("Desktop");
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing");
	}

	@Override
	void turnOn() {
		System.out.println("Desktop turnOff");
	}


}
