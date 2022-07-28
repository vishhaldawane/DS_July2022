import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.ds.exceptions.WashingMachineIsNotSwitchedOnException;
import com.ds.exceptions.WashingMachineOverloadedException;
import com.ds.exceptions.WashingMachineTubImbalancedException;

public class WashingMachineTest {
	public static void main(String[] args) {
		
		System.out.println("Begin main...");
		
		WashingMachine washMac = new WashingMachine();
		
		try {
			washMac.switchOn();
			washMac.selectProgram();
		} catch (WashingMachineIsNotSwitchedOnException e) {
			System.out.println("Problem : "+e);
		}
		
		System.out.println("End of main...");
	}
}




class WashingMachine
{
	boolean current;
	
	WashingMachine() 	{
		System.out.println("Washing machine is created....but is it ready with electricity....");
	}

	/*
	WashingMachine() 
	{
		System.out.println("Washing machine is created....but is it ready with electricity....");
	
	}
    */
	
	void switchOn() {
		if(current==false) {
			current = true;
		}
		System.out.println("Machine is switched on....");
	}
	
	void selectProgram() throws WashingMachineIsNotSwitchedOnException
	{
		if(current == false ) {
			WashingMachineIsNotSwitchedOnException washSwitchNotOnEx = new WashingMachineIsNotSwitchedOnException("The Washing Machine is not yet switched on.....");
			throw washSwitchNotOnEx;
		}

		System.out.println("Program started....");
		wash();
		System.out.println("Program finished...");
	}
	
	void wash() 
	{
			for(int i=1;i<=20;i++) {
				double num = Math.random()%100;
				
				System.out.println("Washing...."+i);
				if(num > 0.98) {
					WashingMachineOverloadedException washMacOverldEx = new WashingMachineOverloadedException("Washing machine is overloaded...than the capacity..");
					throw washMacOverldEx;
				}
			}
			rinse();
	}
	
	void rinse()
	{
			for(int i=1;i<=10;i++) {
				System.out.println("\trinse...."+i);
			}
			spin();
	}
	
	void spin() {
		for(int i=1;i<=5;i++) {
			System.out.println("\t\tspinning......."+i);
			
			double n = Math.random()%100;
			if( n > 0.50 ) {
				WashingMachineTubImbalancedException washTubImbalEx = new WashingMachineTubImbalancedException("Washing machine tub is imbalanced ....");
				throw washTubImbalEx;
			}
		}
	}
	
	void switchOff() {
		if(current==true) {
			current = false;
		}
		System.out.println("Machine is switched off...");
	}
}