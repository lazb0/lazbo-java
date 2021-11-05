import java.util.Scanner;

import java.util.Random;
public class mainRocPapSci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        int playerSel;
        do{
            System.out.print("Rock(1) \nPaper(2) \nScissors(3) > ");
            playerSel = sc.nextInt();
        }while(playerSel < 1 || playerSel > 3);
        int computerSel = rn.nextInt(4)+1;
        if(computerSel == 1 && playerSel == 3 || computerSel == 2 && playerSel == 1 || computerSel == 3 && playerSel == 2){
            System.out.println("Computer has won!");
        } else if (computerSel == playerSel){
            System.out.println("It's a tie!");
        } else {
            System.out.println("Player has won");
        }

        System.out.print("Wanna play again?(y/n) >");
        Character again = sc.next().toLowerCase().charAt(0);
        sc.close();
        if(again.equals('y')){
            main(args);
        }
    }
}