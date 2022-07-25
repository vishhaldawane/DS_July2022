
public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person thePersonObj = new Person('F',"Janet", 25);
//		System.out.println("the person : "+thePersonObj);

		thePersonObj.printPerson();
		System.out.println("-----------");
		
		
		Student theStudentObj = new Student('M', "Robert", 24, "Bits Pilani", "MBA", 'A');
		
		theStudentObj.printStudent();
//		System.out.println("the student "+theStudentObj);
		
		System.out.println("-----------");
		
		Employee empObj = new Employee('F', "Julie", 22, "IIT", "Mtech", 'A', "Google", "Analyst", 25000);
		empObj.printEmployee();
		
		//		System.out.println("emp obj "+empObj);
	}

}

class Person
{
	char gender;
	String name;
	int age;
	
	public Person(char gender, String name, int age) {
		super();
		this.gender = gender;
		this.name = name;
		this.age = age;
	}

	void printPerson() {
		System.out.println("GENDER : "+gender);
		System.out.println("AGE    : "+age);
		System.out.println("NAME   : "+name);
		
	}
	/*@Override
	public String toString() {
		return "Person [gender=" + gender + ", name=" + name + ", age=" + age + "]";
	}*/
	
}

class Student extends Person
{
//	3 fields from the Person  + 
	String college;
	String qualification;
	char grade;
	
	public Student(char gender, String name, int age, String college, String qualification, char grade) {
		super(gender, name, age);
		this.college = college;
		this.qualification = qualification;
		this.grade = grade;
	}

	void printStudent() {
		super.printPerson();
		System.out.println("COLLEGE: "+college);
		System.out.println("QUAL   : "+qualification);
		System.out.println("GRADE  : "+grade);

	}
	/*@Override
	public String toString() {
		return "Student [toString()=" + super.toString() + ", college=" + college + ", qualification=" + qualification
				+ ", grade=" + grade + "]";
	}*/
}

class Employee extends Student
{
	String company;
	String job;
	double salary;
	public Employee(char gender, String name, int age, String college, String qualification, char grade, String company,
			String job, double salary) {
		super(gender, name, age, college, qualification, grade);
		this.company = company;
		this.job = job;
		this.salary = salary;
	}

	void printEmployee() {
		super.printStudent();
		System.out.println("COMPANY: "+company);
		System.out.println("JOB    : "+job);
		System.out.println("SALARY : "+salary);
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

