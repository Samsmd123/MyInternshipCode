

public class CheckNeon
{
	
    public static void main(String[] args)
    {
    	int n=9;
        int s =0;
        int copy =n;
        int v = n*n;
        do
        {
            int e = v%10;
            s=s+e;
            int x =n/10;
        }while(v!=0);
        if(copy==s)
        {
            System.out.println("its");
            
        }
        else{
            System.out.println("its not");
            
        }
        System.out.println("its not");
    } 
    
}