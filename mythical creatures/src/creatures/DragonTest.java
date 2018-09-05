package creatures;

import static org.junit.Assert.*;

import org.junit.Test;

public class DragonTest {

	@Test()
	public void testItExists() {
		Dragon shadow = new Dragon();
		assertTrue(shadow instanceof Dragon);
	}
	
	@Test()
	public void dragonCanBreathFire() {
		Dragon firebreather = new Dragon();
		assertEquals("The dragon breathes fire", firebreather.breatheFire());
	}

	@Test()
	public void itCanAttackWithClaws() {
		Dragon firebreather = new Dragon();
		assertEquals("It attacked with it's claws!", firebreather.attackWithClaws());
		assertEquals("It has no claws left!", firebreather.attackWithClaws());
	}
	
	@Test()
	public void itCanEatHumans() {
		Dragon firebreather = new Dragon();
		assertEquals("It attacked with it's claws!", firebreather.attackWithClaws());
		assertEquals("It has no claws left!", firebreather.attackWithClaws());
	}
}
