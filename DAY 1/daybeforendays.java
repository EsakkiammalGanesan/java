import java.util.*;
public class daybeforendays {
    public static void main(String[] args) {
        Scanner sn=new Scanner((System.in));
        int today=sn.nextInt();
        int after_some_days=sn.nextInt();
        int x=after_some_days%7;
        int ans=today-x;
        /*if(today<0 || today>6){
            System.out.println("Choose the day between 0 and 6");
        }*/
        if(ans<0){
            ans=ans+7;
        }
        switch (ans) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
                case 2:
                System.out.println("Tuesday");
                break;
                case 3:
                System.out.println("Wednesday");
                break;
                case 4:
                System.out.println("Thursday");
                break;
                case 5:
                System.out.println("Friday");
                break;
                case 6:
                System.out.println("Saturday");
                break;
                default:
                    System.out.println("Choose today between 0 to 6");
                    break;
            
        }
        sn.close();
        
    }
    
}
