import java.time.LocalDate;

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AadharCard aadharCard1 = new AadharCard("1234 1234 1234", "Janet Robert Dsouza","Govt Of India", "Mumbai", LocalDate.of(2002, 12, 25), "8876345678");;
		AadharCard aadharCard2 = new AadharCard("5234 6234 9234", "Robert Peter Dmello","Govt Of India", "Pune", LocalDate.of(2003, 11, 20), "7776342618");;
		AadharCard aadharCard3 = new AadharCard("6234 7234 3254", "Julie Smith Pareira","Govt Of India", "Nasik", LocalDate.of(2004, 10, 21), "66876345178");;
		
		
		Person thePersonObj = new Person('F',"Janet", 25, aadharCard1);
//		System.out.println("the person : "+thePersonObj);

		thePersonObj.printPerson();
		System.out.println("-----------");
		

		ReportCard rpt1 = new ReportCard(95,97,96,99,97,98);
		ReportCard rpt2 = new ReportCard(83,87,86,89,87,88);
		
		
		Student theStudentObj = new Student('M', "Robert", 24, aadharCard2, "Bits Pilani", "MBA",rpt1);
		
		theStudentObj.printStudent();
//		System.out.println("the student "+theStudentObj);
		
		System.out.println("-----------");
		
		Employee empObj = new Employee('F', "Julie", 22, aadharCard3, "IIT", "Mtech", "Google", "Analyst", 25000, rpt2);
		empObj.printEmployee();
		
		//		System.out.println("emp obj "+empObj);
	}

}

class AadharCard
{
	String aadharNumber;
	String nameOnAdhaar;
	String issuedBy;
	String address;
	LocalDate birthdate;
	String phoneNumber;
	
	public AadharCard(String aadharNumber, String name, String issuedBy, String address, LocalDate birthdate, String phoneNumber) {
		super();	
		this.aadharNumber = aadharNumber;
		this.nameOnAdhaar = name;
		this.issuedBy = issuedBy;
		this.address = address;
		this.birthdate = birthdate;
		this.phoneNumber = phoneNumber;
	}
	
	void printAdhaarCard() 
	{
		System.out.println("+--------- AADHAR INFO ---------");
		System.out.println("| Aadhar Card : "+aadharNumber);
		System.out.println("| Aadhar Name : "+nameOnAdhaar);
		System.out.println("| Issued By   : "+issuedBy);
		System.out.println("| Address     : "+address);
		System.out.println("| Birthdate   : "+birthdate);
		System.out.println("| Phone Number: "+phoneNumber);
		System.out.println("+------------------------------");
	}
	
}

class Person
{
	char gender; //hasA 1
	String name; //hasA 2
	int age;     //hasA 3
	AadharCard aadharCard; //hasA 4 ( 5 )
   //PanCard
//VotingCard
	//DL
	
	public Person(char gender, String name, int age) {
		super();
		this.gender = gender;
		this.name = name;
		this.age = age;
	}
	

	public Person(char gender, String name, int age, AadharCard aadharCard) {
		super();
		this.gender = gender;
		this.name = name;
		this.age = age;
		this.aadharCard = aadharCard;
	}


	void printPerson() {
		System.out.println("+------ PERSONAL INFO -------");
		System.out.println("| GENDER : "+gender);
		System.out.println("| AGE    : "+age);
		System.out.println("| NAME   : "+name);
		if(aadharCard!=null) {
			aadharCard.printAdhaarCard();
		}
		else {
			System.out.println("No Aadhar Card Info");
		}
		
	}
	/*@Override
	public String toString() {
		return "Person [gender=" + gender + ", name=" + name + ", age=" + age + "]";
	}*/
	
}

class ReportCard
{
	float physics;
	float chemistry;
	float biology;
	float maths;
	float english;
	float geometry;
	float total;
	char grade; //hasA
	
	public ReportCard(float physics, float chemistry, float biology, float maths, float english, float geometry) {
		super();
		this.physics = physics;
		this.chemistry = chemistry;
		this.biology = biology;
		this.maths = maths;
		this.english = english;
		this.geometry = geometry;
		this.total = physics+chemistry+biology+maths+english+geometry;
		float perc = total / 6;
		if(perc >=90 && perc<=100)
			grade = 'A';
		else
			if(perc >=75 && perc<90)
				grade = 'B';
			else
				if(perc >=60 && perc<75)
					grade = 'C';
				else
					if(perc >=45 && perc<60)
						grade = 'D';
					else
						if(perc >=35 && perc<45)
							grade = 'E';
						else
							if(perc <35)
								grade = 'F';
			
	}
	
	void printReportCard() {
		System.out.println("+----- REPORT CARD INFO ----");
		System.out.println("|PHY  : "+physics);
		System.out.println("|CHEM : "+chemistry);
		System.out.println("|BIO  : "+biology);
		System.out.println("|MATH : "+maths);
		System.out.println("|ENG  : "+english);
		System.out.println("|GEOM : "+geometry);
		System.out.println("+--------------------");
		System.out.println("|TOTAL:"+total);
		System.out.println("+--------------------");
		System.out.println("|GRADE:"+grade);
		System.out.println("+--------------------");
	}
}
class Student extends Person //isA
{
//	3 fields from the Person  + 
	String college; //hasA
	String qualification; //hasA
	ReportCard reportCard;
	
	
	public Student(char gender, String name, int age, String college, String qualification) {
		super(gender, name, age);
		this.college = college;
		this.qualification = qualification;
	}
	
	

	public Student(char gender, String name, int age, AadharCard aadharCard, String college, String qualification, ReportCard rpt) {
		super(gender, name, age, aadharCard);
		this.college = college;
		this.qualification = qualification;
		this.reportCard = rpt;
	}



	void printStudent() {
		super.printPerson();
		System.out.println("+------ ACADEMIC INFO -------");
		System.out.println("| COLLEGE: "+college);
		System.out.println("| QUAL   : "+qualification);
		if(reportCard!=null) {
			reportCard.printReportCard();
		}
		else {
			System.out.println("REPORT CARD NOT SET YET");
		}
	}
	/*@Override
	public String toString() {
		return "Student [toString()=" + super.toString() + ", college=" + college + ", qualification=" + qualification
				+ ", grade=" + grade + "]";
	}*/
}

class Employee extends Student //isA
{
	String company; //hasA
	String job; //hasA
	double salary; //hasA
	
	public Employee(char gender, String name, int age, String college, String qualification, String company,
			String job, double salary) {
		super(gender, name, age, college, qualification);
		this.company = company;
		this.job = job;
		this.salary = salary;
	}
	
	

	public Employee(char gender, String name, int age, AadharCard aadharCard, String college, String qualification, String company, String job, double salary, ReportCard rpt) {
		super(gender, name, age, aadharCard, college, qualification,rpt);
		this.company = company;
		this.job = job;
		this.salary = salary;
	}

	void printEmployee() {
		super.printStudent();
		System.out.println("+------ EMPLOYMENT INFO -------");
		System.out.println("| COMPANY: "+company);
		System.out.println("| JOB    : "+job);
		System.out.println("| SALARY : "+salary);
	}

	/*@Override
	public String toString() {
		return "Employee [toString()=" + super.toString() + ", company=" + company + ", job=" + job + ", salary="
				+ salary + "]";
	}*/
	
	
	
}

/*
 * 
 * 		super()
 * 
 * 
 * 		super.
 * 
 * 
 */

