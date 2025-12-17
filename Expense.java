package expense_tracker;

public class Expense {
	double cost ;
	String category; 
	
public Expense(double cost ,String category){
	this.cost= cost;
	this.category = category;	
	}

public double getCost(){
	return cost;
}

@Override // for ref :overrided toString becoz i dont want my default toString() to act.
public String toString() {
	return "Category: " + category + " "+ " cost: "+ cost;
}


}
