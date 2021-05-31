package empWage;
import java.util.Random;
public class WageCalculator {
	static int wagePerHr=20;
	static int hrPerDay=8;
	static int partTimeHr=4;
    public static void attendence() {
    	int ran;
    	int isPresent=1;
    	Random random=new Random();
    	ran=random.nextInt(2);
		if(ran==isPresent)
			System.out.println("Employee Present");
		else
			System.out.println("Employee absent");
		
    }
    public static void calcDailyWage() {
    	int dailyWage = wagePerHr*hrPerDay;
    	System.out.println("Daily wage of full time employee is "+dailyWage);
    }
    public static void partTimeEmp(){
    	int partDailyWage=wagePerHr*partTimeHr;
    	System.out.println("Daitly Wage of part time employee is "+partDailyWage);
    }
    public static void Switch() {
    	int exp;
    	Random random=new Random();
    	exp=1+random.nextInt(2);
    	switch(exp) {
    	case 1:
    		System.out.println("Employee is fulltime");
    		calcDailyWage();
    		break;
    	case 2:
    		System.out.println("Employee is parttime");
    		partTimeEmp();
    		break;
    	default:
    		System.out.println("Invalid");
    	}
    	
    }
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Calculator");
		attendence();
		calcDailyWage();
		partTimeEmp();
		Switch();
	}
}
