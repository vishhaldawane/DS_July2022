
public class ComplexNumberTest {

	public static void main(String[] args) {
		
		ComplexNumber complexNum1 = new ComplexNumber(2, 3);
		complexNum1.printComplexNumber();
		
		ComplexNumber complexNum2 = new ComplexNumber(4, 7);
		complexNum2.printComplexNumber();

		//ComplexNumber complexNum3 = new ComplexNumber(complexNum1.realNumber+complexNum2.realNumber, complexNum1.image+complexNum2.image);
		
		ComplexNumber complexNum3 = complexNum1.add(complexNum2);
		
	}
}
// 2 3   2+3 * square root of -1 or i
class ComplexNumber
{
	int realNumber;
	int image;
	
	ComplexNumber(int r, int i) {
		realNumber = r;
		image = i;
	}
	
	void printComplexNumber() {
		System.out.println("realNumber : "+realNumber);
		System.out.println("image      : "+image);
	}
	ComplexNumber add(ComplexNumber compRef) {
//		System.out.println("real  number "+(realNumber +compRef.realNumber));
//		System.out.println("image number "+(image +compRef.image));
		ComplexNumber compTemp = new ComplexNumber(realNumber+compRef.realNumber, image+compRef.image);
		return compTemp;
	}
}





