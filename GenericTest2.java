
public class GenericTest2 {
	public static void main(String[] args) {

		AnyValues<Integer> iv = new AnyValues<Integer>(10, 20);
		
		iv.print();
		iv.swap();
		iv.print();
		
		System.out.println("-------------");
		
		AnyValues<Float> fv = new AnyValues<Float>(10.5f, 20.6f);
		fv.print();
		fv.swap();
		fv.print();
		
		System.out.println("---------------");
		
		AnyValues<String> sv = new AnyValues<String>("Wada", "Paav");
		sv.print();
		sv.swap();
		sv.print();

		System.out.println("---------------");

		Song s1 = new Song("Zhinghat", "Ajay Atul", "Sairat", 2016);
		Song s2 = new Song("My Heart Will Go On","Celine Dior","Titanic",1997);
		
		AnyValues<Song> songVa = new AnyValues<Song>(s1, s2);
		songVa.print();
		songVa.swap();
		songVa.print();
	}
}

class AnyValues<T> // <-- container
{
	T x; // <-- content
	T y; // <-- content
	
	AnyValues(T x,T y) { 
		this.x = x;
		this.y = y;
	}
	void print() { // <-- algorithm
		System.out.println("x "+x);
		System.out.println("y "+y);
	}
	void swap() { // <-- algorithm
		System.out.println("swapping....");
		T temp = x;
		x = y;
		y = temp;
		System.out.println("swapped.....");
	}
}

/*
class SongValues // <-- container
{
	Song x; // <-- content
	Song y; // <-- content
	
	SongValues(Song x,Song y) { 
		this.x = x;
		this.y = y;
	}
	void print() { // <-- algorithm
		System.out.println("x "+x);
		System.out.println("y "+y);
	}
	void swap() { // <-- algorithm
		System.out.println("swapping....");
		Song temp = x;
		x = y;
		y = temp;
		System.out.println("swapped.....");
	}
}


class IntegerValues
{
	int x;
	int y;
	
	IntegerValues(int x,int y) {
		this.x = x;
		this.y = y;
	}
	void print() {
		System.out.println("x "+x);
		System.out.println("y "+y);
	}
	void swap() {
		System.out.println("swapping....");
		int temp = x;
		x = y;
		y = temp;
		System.out.println("swapped.....");
	}
}

class FloatValues
{
	float x;
	float y;
	
	FloatValues(float x,float y) {
		this.x = x;
		this.y = y;
	}
	void print() {
		System.out.println("x "+x);
		System.out.println("y "+y);
	}
	void swap() {
		System.out.println("swapping....");
		float temp = x;
		x = y;
		y = temp;
		System.out.println("swapped.....");
	}
}

class StringValues
{
	String x;
	String y;
	
	StringValues(String x,String y) {
		this.x = x;
		this.y = y;
	}
	void print() {
		System.out.println("x "+x);
		System.out.println("y "+y);
	}
	void swap() {
		System.out.println("swapping....");
		String temp = x;
		x = y;
		y = temp;
		System.out.println("swapped.....");
	}
}
*/

class Song
{
	String title;
	String artist;
	String album;
	int year;
	public Song(String title, String artist, String album, int year) {
		super();
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", year=" + year + "]";
	}
	
	
}


/*

							Iterable
							|
						----------
						|
					Collection
							|
					------------------
					|			    |
					List		   Set
					|DUPLICATE		|UNIQUE
			---------------		------------------
			|			|		|			|
		ArrayList	LinkedList TreeSet	HashSet
									
	-----
0	|	| --> emp
	-----
1	|	| -> stu
	-----
2	|	| -> fli
	-----
3	|	| -> ba
	-----
4	|	|	
	  |
  growable
  at the end
  
  Linked List - speed is not the concern - efficiency is not the concern
  
  		flexibility is teh main concern
  
  				n				n					n					n
  		------------	------------		------------		------------
		|		|2 |	|		|5 |		|		|4 |		|		|  |
		|		|0 |	|		|0 |		|		|0 |		|		|  |
		|		|0 |	|		|0 |		|		|0 |		|		|  |
		----------|--	----------|-		----------|-		------------
		100		  +---->200		  |		-->	300		  +--------->400
			node1		  node2	  |		|		  node3					node4
								  |		|
			----------------------+		|
			|	insert node5 between 	|node2 and node3
			|							|
			|			 n				|
			|	-------------			|
			|	|		|3 |			|
			|	|		|0 |			|
			|	|		|0 |			|
			|	----------|-			|
			+-->500       +-------------+
					node5
				
			
			Phone - phonebook <-- linked list
					phonelog <-- array list 

		
..
..
..		
				50, 30, 70 , 65 , 80, 20, 40 - IN ORDER
		
		
						1000
						
						1-500		501-1000
							ROOT
							 |50
						----------------
						|		  	  |
						L			  R
						|30			  |70
					---------	--------------
					|		|	|			|
					L		R	L			R
					20		40	65			80
					
				20 30 40  50 65 70 80 - OUT ORDER

	CHEMICAL ELEMENT
	
	H HE ..... .....
	1 2 3 4
	
	
	
	THINK AND GROW RICH
	
	
			-----------------------------
			|FICTION	|COMIC	|  MGZ  |
			|.	.	.	|..		|.		|
			--------------------|		|
			|SCIENCE			|-------|
			|.	.	.	.		|SELF	|
			--------------------|HELP	|
			|	SPIRITUAL		|..		|
			|. . . .			|-------|
			|					|EN/TECH|
			|					|		|
			-----------------------------
			
			NO DEFN IN-ORDER - OUTORDER
	
	
	
	
			Component Orthogonal SPACE
			
			
					DataType		
						|x	-			ButterMilk
						|				Fried Rice				
						|				Paneer Chilly
			--------------------------	Noodles
			|y			|			 |z
		Container		|			 Algorithm
		|				|i			 |
	Bottle			Iterator		drink();
	Plate				|			eat();
						Straw		eat();
						Spoon		eat();
						Fork
						ChopStick
						
						
						
water,  tea,	juice,	milk,	buttermilk,   juice,	8pm,   milk
		|		|		 |			 |		   |		 |		|
		cup   juiceglass milkshake  glass    juiceglass  Y		milkshake glass
						 glass
						 
						 
	
	
	
	
	
	
	
	
	
*/