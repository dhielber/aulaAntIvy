import static org.junit.Assert.*;

import org.junit.Test;


public class ClasseCachorroTest {

	@Test
	public void test() {			
		ClasseCachorro rex = new ClasseCachorro("Rex", 5);
		rex.latir();
		ClasseCachorro vira = new ClasseCachorro("Vira", 3);
		vira.latir();
	}

}
