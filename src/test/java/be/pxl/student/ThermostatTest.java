package be.pxl.student;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ThermostatTest {

	Thermostat thermostat;

	@Before
	public void setUp () throws Exception {
		thermostat = new Thermostat (new HeatingMock ());
		thermostat.setTarget (new Temperature (22));
		thermostat.setCurrent (new Temperature (18));
	}

	@Test
	public void testChangeCurrent () throws Exception {
		thermostat.setCurrent (new Temperature (21));
		Assert.assertTrue (thermostat.isHeating ());
		thermostat.setCurrent (new Temperature (23));
		Assert.assertFalse (thermostat.isHeating ());
	}

	@Test
	public void testChangeTarget () throws Exception {
		thermostat.setTarget (new Temperature (20));
		Assert.assertTrue (thermostat.isHeating ());
		thermostat.setTarget (new Temperature (18));
		Assert.assertFalse (thermostat.isHeating ());
	}

	private class HeatingMock implements Heating {

		private boolean status;

		public void setHeating (boolean status) {
			this.status = status;
		}

		public boolean isHeating () {
			return this.status;
		}
	}

}
