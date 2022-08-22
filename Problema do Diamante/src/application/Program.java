package application;

import devices.ComboDevice;
import devices.ConcretPrinter;
import devices.ConcretScanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcretPrinter p = new ConcretPrinter("1080");
		p.processDoc("My Letter");
		p.print("My Letter");
          
		System.out.println();
		ConcretScanner s = new ConcretScanner("2003");
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());
		
		System.out.println();
		ComboDevice cd = new ComboDevice("2081");
		cd.processDoc("My dissertation");
		cd.print("My dissertation");
		System.out.println("Scan result:"+cd.scan());
	}
}
	
