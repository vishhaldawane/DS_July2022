
class CombatFire
{
	void climbAndFight(FireFighting fm) {
		//fm.yawn();
		fm.extinguishTheFire();
		//fm.eat();
		//fm.yawn();
	}
}

class Seminar
{
	public static void attend(Developer d) {
		System.out.println("Semnar for developers to attend...");
	}
	
	public static void deliveryMeeting(ProjectManager ref) {
		System.out.println("delivery meeting for project managers only....");
	}

}
class Picnic
{
	public static void enjoyFood(Eating e)
	{
		System.out.println("eating.....at picnic...");
		e.eat();
		
		
	}
}

class SoftwareCompany
{
	public static void profile(Coding c)
	{
		System.out.println("Coding in a software company....");
		c.code();
		
	}
	public static void officeWork(Yawning y)
	{
		y.yawn();
		System.out.println("yawning at office work...");
	}
	
}

class PhotoStudio
{
	public static void shootPictures(StudioSetting ss)
	{
		System.out.println("Setting up the tripod at picture shoot in a photo studio....");
		ss.setupATripod();
	}
}


public class InterfacesTest {
	public static void main(String[] args) {

		
		FireMarshal fm = new FireMarshal();
		fm.act();
		fm.eat();
		fm.yawn();
		fm.proact();
		fm.react();
		fm.extinguishTheFire();
		System.out.println("-----------------1");
		
		Person p = new Person();
		
		
		p.act();
		p.eat();
		p.proact();
		p.react();
		p.yawn();
		
		System.out.println("----------2");
		
		Photographer pg = new Photographer();

		pg.act();
		pg.eat();
		pg.proact();
		pg.react();
		pg.yawn();
		pg.click();
		pg.setupATripod();
		
		System.out.println("-------------3");
		
		Developer dev  = new Developer();
		SoftwareCompany.profile(dev);

		dev.act();
		dev.eat();
		dev.proact();
		dev.react();
		dev.yawn();
		dev.click();
		dev.code();
		
		System.out.println("------------4");
		
		Picnic.enjoyFood(dev);

		ProjectManager pm = new ProjectManager();
		Seminar.attend(pm);
		Seminar.attend(dev);
		

		Seminar.deliveryMeeting(pm);
		
		PhotoStudio.shootPictures(pg);
		
		SoftwareCompany.officeWork(fm);

		SoftwareCompany.profile(pm);
		
	}
}

interface Reactive
{
	void react();
}
interface Acting
{
	void act();
}
interface Proactive
{
	void proact();
}
interface Eating
{
	void eat();
}

interface Yawning
{
	void yawn();
}

class Person implements Reactive, Acting, Proactive, Eating, Yawning
{
	public void react() {
		System.out.println("Person is reacting....");
	}
	public void act() {
		System.out.println("Person is acting....");
	}
	public void proact() {
		System.out.println("Person is pro-acting....");
	}
	public void eat() {
		System.out.println("Person is eating....");
	}
	public void yawn() {
		System.out.println("Person is yawning....");
	}
}
interface Clicking
{
	void click();
}

interface Developing
{
	void develop();
}
interface StudioSetting
{
	void setupATripod();
}

class Photographer extends Person implements Clicking, Developing, StudioSetting
{
	public void react() {
		System.out.println("Photographer is reacting....");
	}
	public void act() {
		System.out.println("Photographer is acting....");
	}
	public void proact() {
		System.out.println("Photographer is pro-acting....");
	}
	public void eat() {
		System.out.println("Photographer is eating....");
	}
	public void yawn() {
		System.out.println("Photographer is yawning....");
	}

	
	public void click() {
		System.out.println("Photographer is clicking the camera....");
	}
	public void develop() {
		System.out.println("Photographer is developing the pics...");
	}
	public void setupATripod() {
		System.out.println("Photographer is setting up a tripod...");
	}
}

interface Coding
{
	void code();
}

class Developer extends Person implements Clicking, Developing, Coding
{

	public void react() {
		System.out.println("Developer is reacting....");
	}
	public void act() {
		System.out.println("Developer is acting....");
	}
	public void proact() {
		System.out.println("Developer is pro-acting....");
	}
	public void eat() {
		System.out.println("Developer is eating....");
	}
	public void yawn() {
		System.out.println("Developer is yawning....");
	}

	public void click() {
		System.out.println("Developer is clicking the mouse...");
	}
	public void develop() {
		System.out.println("Developer is developing the software...");
	}
	public void code() {
		System.out.println("Developer is coding....");
	}
}
class ProjectManager extends Developer
{
	
}

interface FireFighting
{
	void extinguishTheFire();
}

class FireMarshal extends Person implements FireFighting
{
	public void extinguishTheFire() {
		System.out.println("The fire marshal is exstinguishing the fire....");
	}
	
}
/*
 
 		Sun
 	
  		Interface
  			- pure abstract class
  			
  
  
  
*/ 


