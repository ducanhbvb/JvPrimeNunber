import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] avg){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number in check:");
        int number=scanner.nextInt();
        if(number<2){
            System.out.println("number Not Prime Number");
        }else {
            int i=2;
            boolean check=true;
            while(i<=Math.sqrt(number)){
                if(number%i==0){
                    check=false;
                    break;
                }
                i++;
            }if(check){
                System.out.println(number+" in Prime Number");
            }else {
                System.out.println(number+" not Prime Number");
            }
        }
    }
}
