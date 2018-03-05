package be.pxl.student;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TemperatureTest {

	float someValue = 0.2F;
	Temperature temp1;
	Temperature temp2;

	@Before
	public void setUp () throws Exception {
		temp1 = new Temperature (someValue);
		temp2 = new Temperature (someValue);
	}

	@Test
	public void get_value_should_return_constructor_value () throws Exception {
		Assert.assertEquals (someValue, temp1.getValue (),0.1F);
	}

	@Test
	public void get_value_should_return_set_value  () throws Exception {
		temp1.setValue (someValue);
		Assert.assertEquals (someValue, temp1.getValue (),0.1F);
	}

	@Test
	public void objects_with_the_same_temperature_value_should_be_equal () throws Exception {
		Assert.assertEquals (temp1, temp2);
	}

	@Test
	public void equals_method_of_objects_with_the_same_temperature_value_should_be_true  () throws Exception {
		Assert.assertTrue (temp1.equals (temp2));
	}

	@Test
	public void hashcode_should_be_the_same () throws Exception {
		Assert.assertEquals (temp1.hashCode (), temp2.hashCode ());
	}
}
