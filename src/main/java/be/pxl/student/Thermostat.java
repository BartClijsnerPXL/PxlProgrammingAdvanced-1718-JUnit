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
		return this.heating.isHeating ();
	}

	private void evaluate () {
		if (this.current == null || this.target == null) {
			heating.setHeating (false);
		} else {
			heating.setHeating (this.current.getValue () < this.target.getValue ());
		}
	}

}
