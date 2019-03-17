import java.util.Scanner;
public class VideoLauncher {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		VideoStore store = new VideoStore();
		int ch = 0;
		
		while(true){
			System.out.println("Main Menu");
			System.out.println("===================");
			System.out.print("1. Add Videos: \n" + 
								"2. Check Out Video: \n" + 
								"3. Return Video: \n" + 
								"4. Receive Rating: \n" + 
								"5. List Inventory: \n" + 
								"6. Exit: \n" + 
								"Enter your choice (1..6): ");
			
			if(!sc.hasNextInt()){
				sc.next();
				ch=0;
				}
			else ch=sc.nextInt();
			String name;
			switch (ch) {
			case 1:
				System.out.print("Enter the name of video you want to add : ");
				name=sc.next();
				store.addVideo(name);
				System.out.println("\nVideo "+name+" added successfully.\n");
				break;
			case 2:
				System.out.print("Enter the name of video you want to check out : ");
				name=sc.next();
				store.doCheckout(name);
				System.out.println("\nVideo "+name+" checked out successfully.\n");
				break;
			case 3:
				System.out.print("Enter the name of video you want to Return : ");
				name=sc.next();
				store.doReturn(name);
				break;
			case 4:
				System.out.print("Enter the name of video you want to Rate : ");
				name=sc.next();
				System.out.print("Enter the rating for the video : ");
				int rat=sc.nextInt();
				store.receiveRating(name, rat);
				System.out.println("\nRating \""+rat+"\" has been mapped to the Video \""+name+"\".\n");
				break;
			case 5:
				store.listInventory();
				break;
			case 6:
				sc.close();
				System.out.println("\n\nExiting...!!! Thanks for using the application.\n\n");
				return;
			default:
				System.out.println("\n\nPlease Enter correct choice.\n\n");
				break;
			}
		}
		
	}

}
