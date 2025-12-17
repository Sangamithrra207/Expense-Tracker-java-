package expense_tracker;
import java.util.ArrayList;
import java.util.Scanner;


public class ExpenseTracker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Expense> expense = new ArrayList<>();
		
		while(true) {
			System.out.println("1.Add expense");
			System.out.println("2.view expenses");
			System.out.println("3.view total expense");
			System.out.println("4.exit");
			System.out.println("enter your choice:");
			
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("enter the cost:");
				double cost = sc.nextInt();
				sc.nextLine();
				System.out.println("enter the category:");
				String category = sc.nextLine();
				
				Expense a = new Expense(cost, category);
				expense.add(a);
				break;
				
			case 2:
				for(Expense exp : expense) {
					System.out.println(exp.toString());
				}
				break;
				
			case 3:
				double total=0;
				for(Expense exp : expense){
				total = total+ exp.getCost();
				}
				System.out.println("Total Expense: " + total);
				break;
				
			case 4:
				System.out.println("Exiting, See you soon!");
				sc.close();
				return;
			
				
			}
				
			
		}
		
	}

}
