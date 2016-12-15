package cardsnciphering;

import java.util.*;

public class Deckarraylist {
	private ArrayList<card> deck = new ArrayList<card>();
	private ArrayList<card> p1 = new ArrayList<card>();
	private ArrayList<card> p2 = new ArrayList<card>();
	public Deckarraylist(int a){
	
		for(int i = 0; i <a; i++){
			String b = "" + i;
			card c = new card(i);
			deck.add(c);
		}
	}
	public void shuffle(){
	Random rndm = new Random();
	for(int i = 0; i <52; i++){
	deck.add(rndm.nextInt(50), deck.remove(rndm.nextInt(50)));
	}
	}
	
	public void deal(int a){
		for(int i = 0; i <a; i++){
			card b = deck.get(0);
			if(i%2 == 0 || i == 0){
				deck.remove(0);
				p1.add(b);
			}
			else{
				deck.remove(0);
				p2.add(b);
			}
		}
	}
	public void reveal(int a){
		for(int i = 0; i < a; i++){
			card b = deck.get(i);
			b.card();
		}
	}
	public void add(int a){
		
		for(int i = 0; i <a; i++){
			String b = "" + i;
			card c = new card(i);
			deck.add(c);
		}
		
	}
public void remove(int a){
		
		for(int i = 0; i <a; i++){
			deck.remove(i);
		}
		
	}


public void war(){
	shuffle();
	deal(52);
	int pws = 0;
	int cws = 0;
	int fprev = 0;
	Random rndm = new Random();
	Boolean winner = false;
	String won = "Error";
	int i = 0;
	while(winner == false){
		card a = p1.get(0);
		card b = p2.get(0);
		int c = a.warval();
		int d = b.warval();
	System.out.print("Player one, ");
	a.card();
	System.out.print("Player two, ");
	b.card();
		if(c > d){
		System.out.println("Player one Wins the round!  They have " + p1.size() + " cards remaining!");
		p2.remove(0);
		p1.remove(0);
		p1.add(b);
		p1.add(a);
		if(p2.isEmpty()){
			winner  = true;
			won = "Player one";
			cws = p1.size();
		}
		
	}
		else if(c < d){
			System.out.println("Player two Wins the round!  They have " + p2.size() + " cards remaining!");
			p2.remove(0);
			p1.remove(0);
			p2.add(b);
			p2.add(a);
			if(p1.isEmpty()){
				winner  = true;
				won = "Player two";
				cws = p2.size();
			}
		}
		else if(c == d){
			System.out.println("Tie!  Reshuffle!");
			p2.remove(0);
			p1.remove(0);
			p1.add(rndm.nextInt(p1.size()+1), a);
			p2.add(rndm.nextInt(p2.size()), b);
			cws = 0;
		}
		i++;
		if(pws == cws){
			fprev++;
			if(fprev > 3000){
				System.out.println("This game has gone on for more than 3000 rounds due to a complete balance between the sides.  To prevent data loss, this program is aborting.");
			won = "See Above";
			winner = true;
			}
		}
		else{
			fprev = 0;
		}
	}
	System.out.println("Winner is " + won + " That game took " + i + " rounds");
}
}
