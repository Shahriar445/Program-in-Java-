
package task_1;
import java.util.Scanner;


public class Task_1 {
    
    public static void main(String[] args) {
        

        int  odd =0,even=0 ,total=0,sum=0,n;
        float  avrg;
        System.out.println("Enter an integer value (the program exits if the input is 0 ) : ");
        
        while (true )
        {
            
             Scanner obj = new Scanner(System.in);
                n=obj.nextInt();
                if (n==0)
                {
                    break;
                }
                else 
                {
                        total++;
                        if (n%2==0)
                        {
                            odd++;
                        }else 
                        {
                            even++;
                        }
                        sum+=n;
                }  
        }
        avrg=((float)sum/total);
       
       System.out.println("The Number of positives is : " +odd);
       System.out.println("The number of negatives is : "+even);
       System.out.println("The total number is : "+ total);
       System.out.println("The average is : " +avrg);
       
        
        
      
    }
    
}
