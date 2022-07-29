
public class GenericTest {
	public static void main(String[] args) {

		int x=10;
		int y=20;
		System.out.println("x : "+x);
		System.out.println("y : "+y);
		
		swap(x,y); // the value of x, ie 10, the value of y, ie 20
		System.out.println("x : "+x);
		System.out.println("y : "+y);
		
	}
	public static void swap(int x, int y) 
	{
		System.out.println("swapping.....");
		int temp = x;
		x = y;
		y = temp;
		System.out.println("swapped...");
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
*/