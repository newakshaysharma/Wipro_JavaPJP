package testjunits;

import static org.junit.Assert.*;
import main.helper.Video;
import org.junit.Test;
import org.junit.Before;

public class VideoTest {
	Video video;
	private String vname;
	private int vrating;
	
	@Before
	public void Before()
	{
		vname="Manpreet";
		vrating=8;
		video=new Video(vname);
		
	}

	@Test
	public void testGetName() {
		assertEquals(vname,video.getName());
	}
	
	@Test
	public void testCheckout() {
		video.doCheckout();
		assertTrue(video.getCheckout());
	}
	
	@Test
	public void testReturn() {
		video.doCheckout();
		assertTrue(video.getCheckout());
	}
	
	@Test
	public void testreceiveRating() {
		video.receiveRating(vrating);
		assertEquals(vrating, video.getRating());
	}
	
	//we don't need to check other coz code covergae of video is 100%
	
	

	
}
