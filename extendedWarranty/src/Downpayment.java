import java.util.Scanner;

public class Downpayment {
    Scanner r = new Scanner(System.in);
    int months;

    public void setMonths() {
        System.out.println("how many months do u want us to charge your credit card :");
        this.months = r.nextInt();
        System.out.println("Your down payment will be in " + months + " " + "months");

    }


}
