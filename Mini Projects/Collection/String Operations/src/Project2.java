import java.util.Scanner;


public class Project2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Helper helper = new Helper();
		int ch = 0;
		
		while(true){
			System.out.print("1. Insert\n" + 
								"2. Search\n" + 
								"3. Delete\n" + 
								"4. Display\n" + 
								"5. Exit: \n" + 
								"Enter your choice :");
			
			if(!sc.hasNextInt()){
				sc.next();
				ch=0;
				}
			else ch=sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the item to be inserted");
				if(helper.insertItem(sc.next()))
					System.out.println("Inserted Sucessfully");
				else System.out.println("Insertion Failed");
				break;
			case 2:
				System.out.println("Enter the item to Search");
				if(helper.searchItem(sc.next()))
					System.out.println("Item found in the list.");
				else System.out.println("Item not found in the list.");
				break;
			case 3:
				System.out.println("Enter the item to Delete");
				if(helper.deleteItem(sc.next()))
					System.out.println("Deleted Sucessfully");
				else System.out.println("Item not found in the list.");
				break;
			case 4:
				helper.display();
				break;
			case 5:
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
