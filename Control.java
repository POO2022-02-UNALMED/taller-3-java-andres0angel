package taller3.televisores;

public class Control {
	private TV tv;

	public void turnOn() {
		this.tv.turnOn();
	}
	
	public void turnOff() {
		this.tv.turnOff();
	}
	
	public void canalUp() {
		this.tv.canalUp(this.tv);
	}
	
	public void canalDown() {
		this.tv.canalDown(this.tv);
	}
	
	public void volumenUp() {
		this.tv.volumenUp(this.tv);
	}
	
	public void volumenDown() {
		this.tv.volumenDown(this.tv);
	}
	
	public void setCanal(int canal) {
			this.tv.setCanal(canal);
	}

	public void enlazar(TV tv) {
		this.tv = tv;
	}

	public TV getTv() {
		return tv;
	}

	public void setTv(TV tv) {
		this.tv = tv;
		tv.setControl(this);
	}

}