package be.pxl.student;

public class Thermostat {

	private Temperature target;
	private Temperature current;

	private Heating heating;

	public Thermostat (Heating heating) {
		this.heating = heating;
	}

	public void setTarget (Temperature target) {
		this.target = target;
		evaluate ();
	}

	public void setCurrent (Temperature current) {
		this.current = current;
		evaluate ();
	}

	public boolean isHeating () {
		return this.heating.isHeating ();
	}

	private void evaluate () {
		this.heating.setHeating (
			this.current != null
				&& this.target != null
				&& this.current.getValue () < this.target.getValue ()
		);
	}

}
