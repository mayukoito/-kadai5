package kadai5;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class IntToEngTest {

	@Test
	public void testF() {
		IntToEng ite=new IntToEng();
		String expected="three";
		String actual=ite.translateEng(3);
		assertThat(actual,is(expected));
	}
	public void testTeen() {
		IntToEng ite=new IntToEng();
		String expected="fourteen";
		String actual=ite.translateEng(14);
		assertThat(actual,is(expected));
	}

}
