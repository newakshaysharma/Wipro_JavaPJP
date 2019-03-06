public class Video {
	
	private String videoName;
	private boolean checkout;
	private int rating;
	
	public Video(String videoName)
	{
		this.videoName=videoName;
	}
	
	public String getName()
	{
		return videoName;
	}
	
	public void doCheckout()
	{
		this.checkout=true;
	}
	
	public void doReturn()
	{
		this.checkout=false;
	}
	
	public void receiveRating(int rating)
	{
		this.rating=rating;
	}
	
	public int getRating()
	{
		return rating;
	}
	
	public boolean getCheckout()
	{
		return checkout;
	}

}
