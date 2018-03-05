package be.pxl.student;

import org.junit.Assert;
import org.junit.Test;

public class TemperatureTest {


	@Test
	public void get_value_should_return_constructor_value () throws Exception {
		float someValue = 0.2F;
		Temperature temp = new Temperature (someValue);
		Assert.assertEquals (someValue, temp.getValue (),0.1F);
//		Assert.assertEquals (0.2345F, temp.getValue (),0.001F);
	}

	@Test
	public void get_value_should_return_set_value  () throws Exception {
		float someValue = 0.2F;
		Temperature temp = new Temperature (someValue);
		temp.setValue (someValue);
		Assert.assertEquals (someValue, temp.getValue (),0.1F);
	}

	@Test
	public void objects_with_the_same_temperature_value_should_be_equal () throws Exception {
		float someValue = 0.2F;
		Temperature temp1 = new Temperature (someValue);
		Temperature temp2 = new Temperature (someValue);
		Assert.assertEquals (temp1, temp2);
	}

	@Test
	public void equals_method_of_objects_with_the_same_temperature_value_should_be_true  () throws Exception {
		float someValue = 0.2F;
		Temperature temp1 = new Temperature (someValue);
		Temperature temp2 = new Temperature (someValue);
		Assert.assertTrue (temp1.equals (temp2));
	}

	@Test
	public void hashcode_should_be_the_same () throws Exception {
		float someValue = 0.2F;
		Temperature temp1 = new Temperature (someValue);
		Temperature temp2 = new Temperature (someValue);
		Assert.assertEquals (temp1.hashCode (), temp2.hashCode ());
	}
}
