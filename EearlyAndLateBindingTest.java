
public class EearlyAndLateBindingTest {
	public static void main(String[] args) {
	
		Doctor d = new Doctor();
		d.diagnose(); // d.Doctor.diagnose() - binding at compile time - early binding 
		
		Surgeon s = new Surgeon();
		s.diagnose(); // s.Surgeon.diagnose()  
		
		HeartSurgeon hs = new HeartSurgeon();
		hs.diagnose(); // hs.HeartSurgeon.diagnose();
		
		// d.diagnose, s.diagnose, hs.diagnose
		
		
		if(d instanceof Doctor) {
			System.out.println("Yes, d is pointing to a Doctor");
		}
		
		if(s instanceof Doctor) {
			System.out.println("Yes, s is pointing to a Doctor");
		}
		
		if(hs instanceof Doctor) {
			System.out.println("Yes, hs is pointing to a Doctor");
		}
		
		System.out.println("================");
		
		
		Doctor ref = d;
		
		ref.diagnose(); //late - ref.Doctor.diagnose()
		
		ref = s;
		
		ref.diagnose(); //late - ref.Surgeon.diagnose()
		
		ref = hs;
		
		ref.diagnose(); //late - ref.HeartSurgeon.diagnose()
		
		
	}
}

class Doctor
{
	void diagnose() //overridden - hidden
	{
		System.out.println("Doctor: diagnose()...ENT checkup..");
	}
}

class Surgeon extends Doctor
{
	void diagnose() //overriding
	{
		System.out.println("Surgeon: diagnose()...CT scan checkup..");
	}
}

class HeartSurgeon extends Surgeon
{
	void diagnose()
	{
		System.out.println("HeartSurgeon: diagnose()...ECG scan checkup..");
	}
}
