 import java.util.Scanner;


 public class SimplePrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
	System.out.println("Hungry\nGet in line\nBuy lunch");
	
		// check if thirsty or not
	System.out.println("are you thirsty ?:");
	System.out.println("1.Yes 2.No");
		int status;
		status= input.nextInt();
			
			if(status == 2){
				System.out.println("Buy water\nEat lunch\nReturn tray\nLeave");
			}
			// check if did you have breakfast	
			else if(status == 1){
				System.out.println("Did you have breakfast:\n1.Yes 2.No");
				int status2;
				status2 = input.nextInt();
				if(status2 == 1){
					System.out.println("Buy diet coke\nEat lunch\nReturn tray\nLeave");
				}
				else if(status2 == 2){
					System.out.println("Buy coke\nEat lunch\nReturn tray\nLeave");
				}
				}
			
				
			
			
	
		
	
	
	
	}

}

 