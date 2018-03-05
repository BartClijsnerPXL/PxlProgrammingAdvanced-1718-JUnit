package be.pxl.student;

public class Thermostat {

	private Temperature target;
	private Temperature current;
	private boolean status;

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
		return this.status;
	}

	private void evaluate () {
		if (this.current == null || this.target == null) {
			this.status = false;
		} else {
			this.status = this.current.getValue () < this.target.getValue ();
		}
		heating.setHeating (this.status);
	}

}
