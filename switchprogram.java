import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;
public class switchprogram{
    public static void main(String[] args) {
        System.out.println("1 for samosa");
        System.out.println("2 for burger");
        System.out.println("3 for mango shake");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        while(number>0){

        // System.out.println("enter the numner");
        // number=sc.nextInt();
        
        switch (number) {
            case 1:{
                System.out.println("samosa");
                break;
            }
            case 2:{
                System.out.println("burber");
                break;
            }
            case 3:{
                System.out.println("mango shake");
                break;
            }
            default:
            System.out.println("enter the correct number");
        }
        System.out.println("enter the numner");
        number=sc.nextInt();
        
    }
    
    }
}
