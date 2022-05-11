import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MyCart {
	public static void  DynamicList(){
		System.out.println("please enter the number items to entered :");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
			for(int i=0;i<a;i++){
				
		System.out.println("enter your item name :");
		Scanner sc1=new Scanner(System.in);
		String a1=sc1.nextLine();
		
		
			l.add(a1);
			}
		
			Collections.sort(l);
			System.out.println("the items present in the list are:");
			for(String s:l){
				System.out.println(s);
			}
				
		
		
	}
	private static List<String> l=new ArrayList<String>();
	public static void main(String[] args) {
		 if(l.isEmpty()){
	MyCart.DynamicList();}
		System.out.println("enter your item :");
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		if(l.contains(a)){
			System.out.println("Item is in the stock!!");
			System.out.println("PLease enter no of quantities:");
			int b=sc.nextInt();
			boolean f=false;
			if(b>5){
				int cb=10;
				System.out.println("congrats you get rupees "+cb+"chashback");
				f=true;
			}
			System.out.println("PLease enter the price:");
			int c=sc.nextInt();
			if(c>10){
				try {
					throw new NewException("MyException");
				} catch (NewException e) {
					// TODO Auto-generated catch block
					System.out.println(" Iam inside the catch");}
			}
			int cost;
			if(f){
				 cost=(b*c)-10;
			}
			else{
			 cost=b*c;}
			System.out.println("the total coast  of items is :"+cost);
			
		}
		else{
			System.out.println("item not in stock");
		}
	}
	}
