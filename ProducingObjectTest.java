
public class ProducingObjectTest {
	public static void main(String[] args) {

		Scene s = new Scene();
		Light l = new Light();
		Background bg = new Background();
		
		Camera cam = new Camera();
		Photo pic1 = cam.click(s,l,bg);
		
		
	
		
		Cow theCow = new Cow();
		
		Milk theMilk = theCow.milkACow();
		
		Curd theCurd = theMilk.coagulate();
	
		Sugar s = new Sugar();
		Ice i = new Ice();
		
		Lassi las = theCurd.createLassi(s, i);
		
		
		Butter theButter = theCurd.churn();
		
		ClarifiedButter theGhee = theButter.boil();
		
		theGhee.eatIt();
		
		
		//ClarifiedButter cf = new Cow().milkACow().coagulate().churn().boil();
		//cf.eatIt();
		
	}
}

class Cow
{
	Milk milkACow() {
		System.out.println("milkACow is done...");
		Milk m = new Milk();
		return m;
	}
}

class Milk
{
	Curd coagulate() {
		System.out.println("Milk is coagulated...");
		Curd theCurd = new Curd(); 
		return theCurd;
	}
	
	MilkShake createChocolateMilkShake(Sugar s, Ice e, ChocolatePowder cp)
	{
		MilkShake ms = new MilkShake();
	}
}

class MilkShake
{
	
}

class ChocolatePoweder
{
	
}

class Curd
{
	Butter churn() {
		System.out.println("Churning the Curd...");
		Butter theButter = new Butter();
		return theButter;
	}
	
	Lassi createLassi(Sugar s, Ice i) {
		
		Lassi l = new Lassi();
		return l;
	}
}

class Lassi { }
class Sugar { }
class Ice { }

class Butter
{
	
	ClarifiedButter boil() {
		System.out.println("Boiling the butter....");
		ClarifiedButter cf = new ClarifiedButter();
		return cf;
	}
}

class ClarifiedButter
{
	void eatIt() {
		System.out.println("Have clarified butter every day....");
	}
}









class Camera
{
	
	Photo click(Scene s, Light l, Background b)
	{
			Photo p = new Photo();
			return p;
	}
}

class VideoCamera extends Camera
{
	VideoClip record(MotionScene m, int speed) {
			VideoClip vc = new VideoClip();
			return vc;

	}
}

class Photo  { }
class Scene { }
class Light { }

class Background  { }

class VideoClip { }

class MotionScene { }





















