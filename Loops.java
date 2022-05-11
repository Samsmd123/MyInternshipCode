import java.util.Scanner;
public class Loops {
static long startTime = System.currentTimeMillis();
	private static Scanner sc;
	public static void main(String[] args) {
		System.out.print("enter the key to validate the day::");
		sc = new Scanner(System.in);
		
		int day =sc. nextInt();
		
	if(day==0){
		System.out.println(" hello today is sunday");
	}
	else if(day==1){
		System.out.println("hello tomorrow is monday");
	}
	else if(day==2){
		System.out.println("its Tuesday today");
	}
	else if(day==3){
		System.out.println("its Wednesday tomorrow");
	}
	else if(day==4){
		System.out.println("its Thursday ");
	}
	else if(day==5){
		System.out.println("Friday is back");
	}
	else if(day==6){
		System.out.println("Iam saturday");
	}
	else{
		System.out.println("invalid ");
	}
	 long duration = System.currentTimeMillis() - startTime;
	System.out.println( " time taken is :"+duration/1000+"sec");
	}
	
}
