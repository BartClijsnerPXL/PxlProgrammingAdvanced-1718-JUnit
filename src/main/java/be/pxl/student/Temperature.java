package be.pxl.student;

public class Temperature {

	private float temp;

	public Temperature (float temp) {
		this.temp = temp;
	}

	public float getValue () {
		return temp;
	}

	public void setValue (float temp) {
		this.temp = temp;
	}

	public boolean isBoiling () {
		return false;
	}

	public boolean isFreezing () {
		return false;
	}

}
