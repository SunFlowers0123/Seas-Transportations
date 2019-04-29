import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

 public class Ports {
	private String nameOfPort;
	static private Set<String> listOfPorts ;
	static{
		listOfPorts = new HashSet();
		listOfPorts.add("Gaidarpasha"); 
		listOfPorts.add("Batumi"); 
		listOfPorts.add("Samsun");
		listOfPorts.add("Varna"); 
		listOfPorts.add("Samsun"); 
		listOfPorts.add("Poti");
		listOfPorts.add("Derince");	
	}	
	
	public String getNameOfPort() {
		return nameOfPort;
	}
	public void setNameOfPort(String nameOfPort) {
		this.nameOfPort = nameOfPort;
	}
	
	static public Set allPorts() {
		Iterator iter = listOfPorts.iterator();
		int i=1;
		while(iter.hasNext()) {
			System.out.println(i + " " + iter.next());
			i++;
		}
		return listOfPorts;
	}
	
	
	
	
	
	
	
}
