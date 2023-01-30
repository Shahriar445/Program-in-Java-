
package task_2;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Task_2 {

    
    public static void main(String[] args) {
        System.out.println("Enter an integer value(n): ");
        
        Scanner obj= new Scanner(System.in);
        
        int n = obj.nextInt();
       
        
        double pi =0.0;
        DecimalFormat df = new DecimalFormat("0.####");
        
        for (int i =0 ;i<=n;i++)
        {
            //pi+=4*Math.pow(-1,i)/(2*i+1);
            pi+=4.0/(2*i+1)*Math.pow(-1,i);
            
        
        }
        System.out.println(df.format(Math.abs(pi-Math.PI)));
    }
    
}
