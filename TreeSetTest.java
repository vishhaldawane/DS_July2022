import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
	
		ChemicalElement element1 = new ChemicalElement(1,"Hydrogen", "H", 1.00797f);
		ChemicalElement element2 = new ChemicalElement(79,"Gold", "Au", 196.9665f);
		ChemicalElement element3 = new ChemicalElement(3,"Lithium", "Li", 6.941f);
		ChemicalElement element4 = new ChemicalElement(11,"Sodium", "Na", 22.98977f);
		ChemicalElement element5 = new ChemicalElement(12,"Magnesium", "Mg", 24.305f);
		System.out.println("Chemical elements are ready....");		
		
		TreeSet<ChemicalElement> periodTable = new TreeSet<ChemicalElement>();
		System.out.println("Periodic Table set is ready....");
		
		System.out.println("Adding the 1st element");
		periodTable.add(element1);
		
		System.out.println("Adding the 2nd element");
		periodTable.add(element2);
		
		System.out.println("Adding the 3rd element");
		periodTable.add(element3);
		
		System.out.println("Adding the 4th element");
		periodTable.add(element4);
		
		System.out.println("Adding the 5th element");
		periodTable.add(element5);
		
		
		Iterator<ChemicalElement> setIterator = periodTable.iterator();
		while(setIterator.hasNext()) {
			ChemicalElement theElement = setIterator.next();
			System.out.println("The Element : "+theElement);
			System.out.println("--------------");
		}
		
		System.out.println("==========");
		
		for (ChemicalElement theElement : periodTable) {
			System.out.println("The Element : "+theElement);
			System.out.println("--------------");
		}
	}
}

class ChemicalElement implements Comparable<ChemicalElement>
{
	int atomicNumber;
	String atomicName;
	String atomicForumla;
	float atomicWeight;
	
	public ChemicalElement(int atomicNumber, String atomicName, String atomicForumla, float atomicWeight) {
		super();
		this.atomicNumber = atomicNumber;
		this.atomicName = atomicName;
		this.atomicForumla = atomicForumla;
		this.atomicWeight = atomicWeight;
	}
	@Override
	public String toString() {
		return "ChemicalElement [atomicNumber=" + atomicNumber + ", atomicName=" + atomicName + ", atomicForumla="
				+ atomicForumla + ", atomicWeight=" + atomicWeight + "]";
	}
	
	public int compareTo(ChemicalElement o) {
		System.out.println("Comparing "+atomicNumber + " with "+o.atomicNumber);
		return Integer.compare(atomicNumber, o.atomicNumber);
	}
	
	
}
