import java.util.Scanner;
public class mainFibSeq{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("How many number you want to show? > ");
        int quantity = sc.nextInt();
        
        System.out.println("First " + quantity + " numbers of fibonacci sequence are: ");
        int f1 = 0; int f2 = 1, f3;
        System.out.print("0, 1");
        for(int i = 2; i < quantity; i++){
            f3 = f1 + f2;
            System.out.print(", " + f3);
            f1 = f2;
            f2 = f3;
        }

        sc.close();
    }
}