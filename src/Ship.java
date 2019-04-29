import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class Ship extends Ports{
	private int tonsOfTransportation;
	private int choosePlace;
	
	
	public int getChoosePlace() {
		return choosePlace;
	}


	public void setChoosePlace(int choosePlace) {
		this.choosePlace = choosePlace;
	}

	private Map<Integer , String> listShip; // Keys number of tons ; Values name of boats;
	
	{
		listShip = new HashMap<Integer , String>();
		listShip.put(21, "Vilnus");
		listShip.put(60, "Canunas");
		listShip.put(22, "Greysvalt");
		listShip.put(7, "North");
		listShip.put(2, "Villard Sea");
		listShip.put(16, "Yaroslav");
		listShip.put(32, "Kherson");
		listShip.put(70, "Admiral of Seas");
	}
	
	public Ship(int tonsOfTransportation) {// select numbers of tons and determinate state of object ship
		this.tonsOfTransportation=tonsOfTransportation;
	}
	
	
	public double getTonsOfTransportation() {
		return tonsOfTransportation;
	}
	
	public void getAllShips() {
		System.out.println(listShip.values());
	}
	
	public int getShip(){// if tons of transportations is bigger than 70tons or is less than 1 tons then you can not send your goods
		if(tonsOfTransportation<1) {System.out.println("We are sorry but we deliver goods weight not less that one tons");System.exit(0);}
		if(tonsOfTransportation>70) {System.out.println("We are sorry but we deliver only goods up to seventy tons");System.exit(0);}
		while(listShip.containsKey(tonsOfTransportation)!=true) {// here we determinate in tons which boat send goods
			tonsOfTransportation++;
		}System.out.println(listShip.get(tonsOfTransportation));
		return tonsOfTransportation;
	}
	
	public void setRouteTo(int route) {
		route = getChoosePlace();
	}
	
	public String getRouteTo() {// here we select were we will send the goods
		String pathToPort = "";
		
		if(getChoosePlace()==1) pathToPort = "Gaidarpasha";
		if(getChoosePlace()==2) pathToPort = "Batumi";
		if(getChoosePlace()==3) pathToPort = "Samsun";
		if(getChoosePlace()==4) pathToPort = "Derince";
		if(getChoosePlace()==5) pathToPort = "Poti";
		if(getChoosePlace()==6) pathToPort = "Varna";
		else if((getChoosePlace()>7)||(getChoosePlace()<1)) System.exit(0);
		
		return pathToPort;
	}
	
	private void calculateTimeToArrival() {//The method for determonate date arrival
		Calendar date = Calendar.getInstance();
		System.out.println(date.getTime());
		if(getChoosePlace()==1) {System.out.print("The boat will come : ");date.add(Calendar.DAY_OF_MONTH, 1);System.out.println(date.getTime()); }
		if(getChoosePlace()==2) {System.out.print("The boat will come : ");date.add(Calendar.DAY_OF_MONTH, 5);System.out.println(date.getTime());}
		if(getChoosePlace()==3) {System.out.print("The boat will come : ");date.add(Calendar.DAY_OF_MONTH, 3);System.out.println(date.getTime());}
		if(getChoosePlace()==4) {System.out.print("The boat will come : ");date.add(Calendar.DAY_OF_MONTH, 2);System.out.println(date.getTime());}
		if(getChoosePlace()==5) {System.out.print("The boat will come : ");date.add(Calendar.DAY_OF_MONTH, 12);System.out.println(date.getTime());}
		if(getChoosePlace()==6) {System.out.print("The boat will come : ");date.add(Calendar.DAY_OF_MONTH, 14);System.out.println(date.getTime());}
		else if((getChoosePlace()>7)||(getChoosePlace()<1)) System.exit(0);
	}
	
	public void calculateSpendMoneyTo(int price) {//determinate spend money for sending goods
		if(price<15200) {System.out.println("Sorry, but we can not send your box");System.exit(0);}
			
		if((getTonsOfTransportation()>1)&&(getTonsOfTransportation()<10)) {
			if(price>15200)System.out.println("We can send your box by Vilnus . "); calculateTimeToArrival();
		}
		if((getTonsOfTransportation()>10)&&(getTonsOfTransportation()<21)) {
			System.out.println("We can send your box by Canunas . "); calculateTimeToArrival();
		}
		if((getTonsOfTransportation()>21)&&(getTonsOfTransportation()<30)) {
			System.out.println("We can send your box by Greysvalt . "); calculateTimeToArrival();
		}
		if((getTonsOfTransportation()>30)&&(getTonsOfTransportation()<40)) {
			System.out.println("We can send your box by North . "); calculateTimeToArrival();
		}
		if((getTonsOfTransportation()>40)&&(getTonsOfTransportation()<50)) {
			System.out.println("We can send your box by Villard Sea . "); calculateTimeToArrival();
		}
		if((getTonsOfTransportation()>50)&&(getTonsOfTransportation()<60)) {
			System.out.println("We can send your box by Yaroslav . "); calculateTimeToArrival();
		}
		if((getTonsOfTransportation()>60)&&(getTonsOfTransportation()<70)) {
			System.out.println("We can send your box by Kherson. "); calculateTimeToArrival();
		}
		
		System.out.print("By your price . ");
		if((price>15200)&&(price<31800)) {price = 15200;System.out.println("We can send your box by Vilnus . "); calculateTimeToArrival();}
		else if(price < 15200) System.out.println("Sorry, but we can not send your box");
		if((price>31800)&&(price<44400)) {price = 31800;System.out.println("We can send your box by Canunas . "); calculateTimeToArrival();}
		if((price>44400)&&(price<60_000)) {price = 44400;System.out.println("We can send your box by Greysvalt . "); calculateTimeToArrival();}
		if((price>60_000)&&(price<75_000)) {price = 60_000;System.out.println("We can send your box by North . "); calculateTimeToArrival();}
		if((price>75_000)&&(price<105_000)) {price = 75_000;System.out.println("We can send your box by Villard Sea . "); calculateTimeToArrival();}
		if(price>105_000) {price = 105_000;System.out.println("We can send your box by Kherson. "); calculateTimeToArrival();}
	}
	
	public void moveToPort() {// and then the boat will move
		System.out.println("The boat move...");
		
	}
}