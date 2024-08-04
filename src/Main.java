import java.util.*;
class Main{
    public static void main(String[]Args){
        System.out.println("Welcome to 80-100 Converter. ");
        System.out.println("This is a branch of MARKS COUNTER where you can enter your mark out of 80 and we");
        System.out.println("will convert them out of 100.");
        System.out.println("For more efficient calculation out of 100, please visit MARKS COUNTER PROJECT.");
        System.out.println("where you will get your personalized progress report from your computer.");
        System.out.println("THANK YOU 🙏.");
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR MARK OUT OF 80.");
        int mark=sc.nextInt();
        double ma=mark/80.0*100;

        System.out.println("YOUR MARK OUT OF 100 IS :   "+ma);
        System.out.println("PERCENTAGE              :   "+ma+"%");

    }
}