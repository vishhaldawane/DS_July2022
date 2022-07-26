/*
 
 		A		B		C		D	
 ----------------------------------		
  1  |Apple	|
 ----------------------------------		
  2  |Mango	|
 ----------------------------------		
  3  |Orange|
 ----------------------------------		
  4  |		|
 ----------------------------------		
  5  |		|
  
  
 */
public class CellTest {
	public static void main(String[] args) {

		CricketPlayer player1 = new CricketPlayer();
		player1.cricketerName="Sachin Tendular";
		
		Letter l1 = new Letter(); //R
		Letter l2 = new Letter(); //E
		Letter l3 = new Letter(); //S
		Letter l4 = new Letter(); //U
		Letter l5 = new Letter(); //M
		Letter l6 = new Letter(); //E
		
		Cell cell1 = new Cell();
		Cell cell2 = new Cell();
		Cell cell3 = new Cell();
		
		cell1.setCell("A", 1, "Apple");
		cell2.setCell("A", 2, "Mango");
		cell3.setCell("A", 3, "Orange");
		
		cell1.printCell();
		cell2.printCell();
		cell3.printCell();
		
	}
}


class Letter
{
	char alphabet;
	int colorCode;
	int fontSize;
	String font;
	String style;
}

//RESUME

class Cell
{
	String column;
	int row;
	String value;
	
	void setCell(String c, int r, String v) {
		column = c;
		row = r;
		value = v;
	}
	void printCell() {
		System.out.println("Column : "+column);
		System.out.println("Row    : "+row);
		System.out.println("Value  : "+value);
		System.out.println("----------------------");
	}
	
}



class WashingMachine1
{
	
	void wash() { }
	
	void spin() { }
	
	void rinse() { }
	
	void blanketWash() { }
	
	void fuzzyWash( ) {  }
	
	void cleanTub() { }
	
	
}
// is "Sachin Tendulkar" an object or a class


class CricketPlayer
{
	int worldRank;
	String cricketerName;
	int age;
	
}
























