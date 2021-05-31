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
    	System.out.println("Dailt wage of full time employee is "+dailyWage);
    }
    public static void partTimeEmp(){
    	int partDailyWage=wagePerHr*partTimeHr;
    	System.out.println("Daitly Wage of part time employee is "+partDailyWage);
    }
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Calculator");
		attendence();
		calcDailyWage();
		partTimeEmp();
		
	}
}
