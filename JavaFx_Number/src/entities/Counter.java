package entities;

public class Counter {
	
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Counter(int number) {
		this.number = number;
	}
	
	public void CounterAdd() {
		number += 1;
	}
	
	public void CounterRemove() {
		number -= 1;
	}

	
	
	
}
