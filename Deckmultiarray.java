package cardsnciphering;

import java.util.Random;
import java.util.Scanner;

public class Deckmultiarray {
private String a[][] = new String[4][13];
	public Deckmultiarray(){
		for(int i = 0; i<4; i++){
			for(int j = 0; j<=12; j++){
				
				a[i][j] = i + " "+ j;
				
			}
			
		}
	}
public String[] shuffle(){
	String b[] = onearray();
	
	for(int i = 0; i<10;i++){
		Random rmnd = new Random();
		int c = rmnd.nextInt(51)+1;
		for(int j = 0; j < 50; j += c){
		String d = b[j];
		b[j] = b[i];
		b[i] = d;
		}
	}
	return b;
}
public void deal(){
String b[] = shuffle();
for(int i = 0; i <5; i++){
	switch(b[i].substring(2)){
	case "0":
		System.out.print("Ace Of ");
	break;
	case "2":
	case "3":
	case "4":
	case "5":
	case "6":
	case "7":
	case "8":
	case "9":
	case "1":
		System.out.print(b[i].substring(2) + " Of ");
		break;
	case "10":
		System.out.print("Jack Of ");
	break;
	case "11":
		System.out.print("Queen Of ");
	break;
	case "12":
		System.out.print("King Of ");
	break;
}
	switch(b[i].charAt(0)){
	case '0':
		System.out.println("Spades");
		break;
	case '1':
		System.out.println("Clubs");
		break;
	case '2':
		System.out.println("Diamonds");
		break;
	case '3':
		System.out.println("Hearts");
	}
}

}
public String[] onearray(){
	String b[] = new String[52];
	int j = 0;
	int k = 0;
	for(int i = 0; i < 52; i++){
		b[i] = a[j][k];
		if(k == 12){
			j++;
			k = 0;
		}
		else{
			k++;
		}
		
	}
	return b;
	
}
}
