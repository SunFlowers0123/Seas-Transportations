import java.util.Calendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String str;int choosePlace;
		int price;
		Scanner scan = new Scanner(System.in);
		System.out.print("Insert the number of tons for sea transportating : ");
		int tonsOfTransportations = scan.nextInt();// determinate numbers of tons
		Ship ship = new Ship(tonsOfTransportations);// determinate numbers of tons in designer
		ship.getShip();//create the ship that will send goods
		System.out.println("If you want to see list of our ships please press Y/N");
		
		str = scan.next();
		if((str.codePointAt(0)==121)||(str.codePointAt(0)==89)) {
			ship.getAllShips();
		}
		
		System.out.println();
		Ports.allPorts();
		System.out.print("OK, here is our list of foreign ports. Please choose of delivery place : ");
		choosePlace=scan.nextInt(); ship.setChoosePlace(choosePlace);//choice place where boat will move
		System.out.print("The price you are counting on : ");
		price=scan.nextInt();// determinate price 
		ship.calculateSpendMoneyTo(price);// if your price is enought hight then you can send your goods
		
		ship.moveToPort();
	}

}
