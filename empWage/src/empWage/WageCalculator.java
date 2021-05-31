package empWage;
import java.util.Random;
public class WageCalculator {
	static int wagePerHr=20;
	static int hrPerDay=8;
	static int partTimeHr=4;
	static int daysPerMonth=20;
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
    public static int calcDailyWage() {
    	int dailyWage = wagePerHr*hrPerDay;
    	return dailyWage;
    }
    public static int partTimeEmp(){
    	int partDailyWage=wagePerHr*partTimeHr;
    	return partDailyWage;
    }
    public static int calcFullMonthlyWage() {
    	int wage=daysPerMonth*hrPerDay*wagePerHr;
    	return wage;
    }
    public static int calcPartMonthlyWage() {
    	int wage=daysPerMonth*partTimeHr*wagePerHr;
    	return wage;
    }
    
    public static void Switch() {
    	int exp;
    	Random random=new Random();
    	exp=1+random.nextInt(2);
    	switch(exp) {
    	case 1:
    		System.out.println("Employee is fulltime");
    		calcDailyWage();
    		System.out.println("Fulltime monthly wage is "+calcFullMonthlyWage() );
    		break;
    	case 2:
    		System.out.println("Employee is parttime");
    		partTimeEmp();
    		System.out.println("Fulltime monthly wage is "+calcPartMonthlyWage() );
    		break;
    	default:
    		System.out.println("Invalid");
    	}
    	
    }
    public static void loop() {
    	int counthrs=0;
    	int countdays=0;
    	int monthWage=0;
    	while(counthrs<100 && countdays<20) {
    		int exp;
        	Random random=new Random();
        	exp=1+random.nextInt(2);
        	switch(exp) {
        	case 1:
        		monthWage=calcDailyWage()+monthWage;
        		counthrs=counthrs+8;
        		countdays++;
        		break;
        	case 2:
        		monthWage=partTimeEmp()+monthWage;
        		counthrs=counthrs+8;
        		countdays++;
        		break;
        	default:
        		System.out.println("Invalid");
        	}
    	}
    	System.out.println("Total monthly wage is "+monthWage);
    }
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Calculator");
		attendence();
		calcDailyWage();
		partTimeEmp();
		Switch();
		loop();
		
	}
}
