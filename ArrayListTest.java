import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		
		System.out.println("Creating the content....");
		PhoneLog log1 = new PhoneLog("You missed a call", LocalDate.now(), "Missed", "Reeta");
		PhoneLog log2 = new PhoneLog("You dialed a call", LocalDate.now(), "Dialed", "Anjali");
		PhoneLog log3 = new PhoneLog("You recieved a call", LocalDate.now(), "Recieved", "Shivani");
		PhoneLog log4 = new PhoneLog("You got a sms", LocalDate.now(), "Message In", "Sapna");
		PhoneLog log5 = new PhoneLog("You missed a call", LocalDate.now(), "Missed", "Priya");
		System.out.println("Content is creaeted....");
		
		System.out.println("Creating container....");
		ArrayList<PhoneLog> phoneLogList = new ArrayList<PhoneLog>();
		System.out.println("Container is ready....");
		
		System.out.println("Adding the 1 element....");
		phoneLogList.add(log1);
		
		System.out.println("Adding the 2 element....");
		phoneLogList.add(log2);
		
		System.out.println("Adding the 3 element....");
		phoneLogList.add(log3);
		
		System.out.println("Adding the 4 element....");
		phoneLogList.add(log4);
		
		System.out.println("Adding the 5 element....");
		phoneLogList.add(log5);
		
		System.out.println("---> Now iterating over the container <---");
		
		Iterator<PhoneLog> iterator = phoneLogList.iterator();
		
		while(iterator.hasNext()) {
			PhoneLog theLog = iterator.next();
			System.out.println("The Log : "+theLog);
		}
	}
}
class Log
{
	String logMessage;
	LocalDate logTime;
	
	public Log(String logMessage, LocalDate logTime) {
		super();
		this.logMessage = logMessage;
		this.logTime = logTime;
	}

	@Override
	public String toString() {
		return "Log [logMessage=" + logMessage + ", logTime=" + logTime + "]";
	}

	
}

class PhoneLog extends Log
{
	String logType;
	String logBy;
	
	public PhoneLog(String logMessage, LocalDate logTime, String logType, String logBy) {
		super(logMessage, logTime);
		this.logType = logType;
		this.logBy = logBy;
	}

	@Override
	public String toString() {
		return "PhoneLog [toString()=" + super.toString() + ", logType=" + logType + ", logBy=" + logBy + "]";
	}
	
	
}
