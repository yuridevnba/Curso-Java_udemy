package devices;

public class ComboDevice extends Device  implements Printer,Scanner {

	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public String scan() {
		// TODO Auto-generated method stub
		return "Combo scan result";
	}

	@Override
	public void print(String doc) {
		System.out.println("Combo printing:  "+doc);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processDoc(String doc) {
	System.out.println(" Combo processing  "+doc);
		
	}
}

// a classe concreta ComboDevice não pode ter mais de uma superclasse.