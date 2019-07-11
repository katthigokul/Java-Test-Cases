import java.util.*;

public class ConditionCheck {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = in.nextInt();
        if (n % 2 == 0 && (n<=20 || n>=30))
        {
            System.out.println("Jerry");
        }
        else if ( n % 2!=0 &&(n <=20 || n >=30))
        {
            System.out.println("Tom");
        }

    }
}


