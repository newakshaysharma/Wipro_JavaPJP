public class VideoStore {
	
	private Video[] store=null;
	
	public void addVideo(String name)
	{
		Video video=new Video(name);
		int size;
		
		if(store==null)
			size=0;
		else
		{
			size=store.length;
		}
		Video[] tempStore=new Video[size+1];
		for(int i=0;i<size;i++){
			tempStore[i]=store[i];
		}
		tempStore[size]=video;
		this.store=tempStore;
	}
	
	public void doCheckout(String name)
	{
		if(store==null||store.length==0){
			System.out.println("No Video in store.");
			return;
		}
		
		for(Video v:store)
		{
			if(v.getName().equals(name)){
				v.doCheckout();
			}
		}
		
	}
	
	public void doReturn(String name)
	{
		if(store==null||store.length==0){
			System.out.println("No Video in store.");
			return;
		}
		
		for(Video v:store)
		{
			if(v.getName().equals(name)){
				v.doReturn();
			}
		}
		
	}
	
	public void receiveRating(String name,int rating){
		
		if(store==null||store.length==0){
			System.out.println("No Video in store.");
			return;
		}
		
		for(Video v:store)
		{
			if(v.getName().equals(name)){
				v.receiveRating(rating);
			}
		}
	}
	
	public void listInventory(){
		if(store==null||store.length==0){
			System.out.println("No Video in store.");
			return;
		}
		
		for(int i=0;i<75;i++) System.out.print("-");
		
		System.out.printf("\n\t%-15s\t|\t%-15s\t|\t%-15s\n", "Name","Checkout","Rating");
		
		for(int i=0;i<75;i++) System.out.print("-");
		
		for(Video v:store){
			System.out.printf("\n\t%-15s\t|\t%-15s\t|\t%-15s\n",v.getName(),v.getCheckout(),v.getRating());
		}
		
		for(int i=0;i<75;i++) System.out.print("-");
		System.out.println();
		
			
	}

}
