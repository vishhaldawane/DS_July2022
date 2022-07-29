
public class Test {
	public static void main(String[] args) {
		
		Flower f = Garden.getFlower("hug");
		Fragrance fra = f.flowering();
		Perfume per = fra.aroma();
		
		per.enjoy();
	}
}

class Garden
{
	public static Flower getFlower(String hint) {
		
		Flower flower  = null;
		
		if(hint.equals("valentine")) {
			flower = new Rose();
		}
		else if (hint.equals("hug")) {
			flower = new Lily();
		}
		
		return flower;
	}
}
interface Flower
{
	Fragrance flowering();
}
class Rose implements Flower
{
	public Fragrance flowering() {
		System.out.println("Rose is flowering....");
		Fragrance f = new RoseFragrance();
		return f;
	}
}
class Lily implements Flower
{
	public Fragrance flowering() {
		System.out.println("Lily is flowering....");
		Fragrance f = new LilyFragrance();
		return f;
	}
}
/*-----------------------*/
interface Fragrance
{
	Perfume aroma();
}
class RoseFragrance implements Fragrance
{
	public Perfume aroma() {
		Perfume p = new RosePerfume();
		return p;
	}
}
class LilyFragrance implements Fragrance
{
	public Perfume aroma() {
		Perfume p = new LilyPerfume();
		return p;
	}
}
/*-----------------------*/
interface Perfume
{
	void enjoy();
}
class RosePerfume implements Perfume
{
	public void enjoy() {
		System.out.println("Enjoy the Rose Perfume....");
	}
}
class LilyPerfume implements Perfume
{
	public void enjoy() {
		System.out.println("Enjoy the Lily Perfume....");
	}
}
/*-----------------------*/
