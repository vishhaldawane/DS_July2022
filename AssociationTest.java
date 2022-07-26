
public class AssociationTest {
	public static void main(String[] args) {
	
		WashingTub tub = new WashingTub("Steel", 9.8f);
		
		Cloth myCloth = new Cloth("Shirt","cotton",2000,"spoiled by pickle");
	
		Electricity elect = new Electricity(220, "Reliance", 2);
		
		WashingPowder wp = new WashingPowder("Tide", 240.0f, 50.0f, "FrontLoad");
		
		Water w = new  Water("Soft","Cold",20.0f);
	
		WashingMachine washMachine = new WashingMachine(123, "Samsung", 42000, "Front Load", tub);
		Laundry theLaundry  = washMachine.wash(myCloth, wp,w,elect);
		theLaundry.printLaundry();
		
	}
}
class Machine{ 
	int serialNumber;
	String company;
	float cost;
	
	public Machine(int serialNumber, String company, float cost) {
		super();
		this.serialNumber = serialNumber;
		this.company = company;
		this.cost = cost;
	}
	
	void printMachine() {
		System.out.println("+----MACHINE INFO----");
		System.out.println("|Serial No : "+serialNumber);
		System.out.println("|Company   : "+company);
		System.out.println("|Cost      : "+cost);
		System.out.println("+-----------------------");
	}
	
}
class WashingMachine extends Machine //isA
{
	WashingTub tub ; //hasA
	String washingMachineType; //front load, top load
	
	
	public WashingMachine(int serialNumber, String company, float cost, String washingMachineType, WashingTub wt) {
		super(serialNumber, company, cost);
		this.washingMachineType = washingMachineType;
		this.tub = wt;
	}

	//producesA		usesA	usesA			usesA		usesA
	//|				|			|			|				|
	Laundry wash(Cloth c, WashingPowder wp, Water w, Electricity e) {
			System.out.println(company+"'s washing machine of "+washingMachineType+" type is washing the cloth ");
			System.out.println("Tub info "+tub.type+" capacity "+tub.capacity);
			System.out.println("Cloth under wash is "+c.type+" of "+c.fabric+" issue "+c.descrip);
			System.out.println("Water type "+w.type+" of temp "+w.temp);
			System.out.println("Using the electricity of "+e.supplier+" of unit "+e.unitConsumed);
			System.out.println("Detergent used : "+wp.brand+" of type "+wp.type+" quanity "+wp.quantity+" gm");
		Laundry laundry = new Laundry(1, 75.0f);
		return laundry;
	}
}
class Cloth { 
	String type; //T shirt, Jean, Pant
	String fabric;
	float cost;
	String descrip;
	
	public Cloth(String type, String fabric, float cost, String descrip) {
		super();
		this.type = type;
		this.fabric = fabric;
		this.cost = cost;
		this.descrip = descrip;
	}
	
	
	
}
class WashingPowder { 
	String brand;
	float amount;
	float quantity;
	String type;
	
	public WashingPowder(String brand, float amount, float quantity, String type) {
		super();
		this.brand = brand;
		this.amount = amount;
		this.quantity = quantity;
		this.type = type;
	}
	
	
	
}


class Water {
	String type;
	String temp;
	float quantity;
	
	public Water(String type, String temp, float quantity) {
		super();
		this.type = type;
		this.temp = temp;
		this.quantity = quantity;
	}
	
		
	
}

class Electricity { 
	
	float volate;
	String supplier;
	float unitConsumed;
	
	public Electricity(float volate, String supplier, float unitConsumed) {
		super();
		this.volate = volate;
		this.supplier = supplier;
		this.unitConsumed = unitConsumed;
	}
	
	
	
}

class Laundry { 
	float amount;
	int quantity;
	float amountPerCloth;
	public Laundry(int quantity, float amountPerCloth) {
		super();
		this.quantity = quantity;
		this.amountPerCloth = amountPerCloth;
		this.amount = quantity * amountPerCloth;
	}
	void printLaundry() {
		System.out.println("Laundry : "+amount);
	}
	
}

class WashingTub { 
	String type; //steel or plastic
	float capacity;
	public WashingTub(String type, float capacity) {
		super();
		this.type = type;
		this.capacity = capacity;
	}
	
}
