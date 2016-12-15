package cardsnciphering;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Deckmultiarray deck = new Deckmultiarray();


Scanner kb = new Scanner(System.in);
System.out.println("Welcome to the Advanced Card System, you idiot!  you may: //shuffle// the deck //reveal// top cards, or play //war//, to begin, simply type the words surrounded by \"//\"");
for(boolean cont = true; cont == true;){
Deckarraylist d1 = new Deckarraylist(52);
System.out.println("What next? to exit, simply exist Between Mountains");
String a = kb.nextLine();
switch(a){
case "reveal":
	System.out.println("Type the number you Idiot.");
	int b = kb.nextInt();
	d1.reveal(b);
	break;
case "shuffle":
d1.shuffle();
break;
case "war":
d1.war();
break;
case "n":
	return;
	}

	}
kb.close();
}
}
