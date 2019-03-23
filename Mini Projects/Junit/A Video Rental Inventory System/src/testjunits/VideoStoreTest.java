package testjunits;

import static org.junit.Assert.*;
import main.helper.Video;
import main.helper.VideoStore;

import org.junit.Before;
import org.junit.Test;

public class VideoStoreTest {
	
	private VideoStore vs;
	
	@Before
	public void before(){
		vs=new VideoStore();
	}

	@Test
	public void testSize() {
		assertEquals(0, vs.getStoreSize());
	}
	
	@Test
	public void testLastAdded() {
		vs.addVideo("manpreet");
		assertEquals("manpreet", vs.getLastAdded().getName());
		vs.addVideo("mps");
		assertEquals("mps", vs.getLastAdded().getName());
		
	}
	
	@Test
	public void testAdd() {
		vs.addVideo("manpreet");
		assertEquals("manpreet", vs.getLastAdded().getName());
	}
	
	@Test
	public void testDoCheckout() {
		vs.addVideo("manpreet");
		vs.doCheckout("manpreet");
		assertTrue(vs.getLastAdded().getCheckout());
	}
	
	@Test
	public void testDoReturn() {
		vs.addVideo("manpreet");
		vs.doReturn("manpreet");;
		assertFalse(vs.getLastAdded().getCheckout());
	}
	
	@Test
	public void testReceiveRating() {
		vs.addVideo("manpreet");
		vs.receiveRating("manpreet", 10);;
		assertEquals(10, vs.getLastAdded().getRating());
	}
	
	//we don't need to test listInventory because it just list all values, no modification is done in it.
	
	
	
	
	
	

}
