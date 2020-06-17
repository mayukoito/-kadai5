package kadai5;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class IntToEngTest {

	@Test
	public void test() {
		IntToEng ite=new IntToEng();
		String expected="three";
		String actual=ite.translateEng(3);
		assertThat(actual,is(expected));
	}

}
