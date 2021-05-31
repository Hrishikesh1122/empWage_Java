package empWage;
import java.util.Random;
public class WageCalculator {
    
    public static void attendence() {
    	int ran;
    	int isPresent=1;
    	Random random=new Random();
    	ran=random.nextInt(2);
		System.out.println(ran);
		if(ran==isPresent)
			System.out.println("Employee Present");
		else
			System.out.println("Employee absent");
		
    }
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Calculator");
		//Random random=new Random();
		attendence();	
		
	}
}
