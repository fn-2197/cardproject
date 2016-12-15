package cardsnciphering;

public class card implements Comparable{
private int a;
private String suit;
private int numsuit;
private int num;
	public card(int z){
		if(z > 52){
			System.out.println("Deck too Large.  Failure.");
			return;
		}
		a = z;
		if( z <= 12){
			suit = "Clubs";
			numsuit = 0;
			num = z;
		}
		else if(z >= 13 && z <= 24){
			suit = "Diamonds";
			numsuit = 1;
			num = z - 12;
		}
		else if(z >= 25 && z <=37){
			suit = "Spades";
			numsuit = 2;
			num = z - 25;
		}
		else if(z >=38){
			suit = "Hearts";
			numsuit = 3;
			num = z - 38;
		}
		
	}
	public void card(){
	System.out.print("Your cards is:  ");
	if(num == 0){
		System.out.print("an Ace");
	}
	else if(num > 0 && num < 10){
		System.out.print("a " + (num+1));
	}
	else if(num == 10){
		System.out.print("a Jack");
	}
	else if(num == 11){
		System.out.print("a Queen");
	}
	else if(num == 12){
		System.out.print("a King");
	}
	else{
		System.out.println("An Error has occured with num value."  + num + suit);
		return;
	}
	System.out.println(" of " + suit + ".");	
	}
	public int cardval(){
		return a;	
	}
	
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return ((card) arg0).cardval() - a;
	}
	public int warval(){
		return num;
	}
}
