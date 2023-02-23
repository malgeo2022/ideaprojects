import java.util.ArrayList;
import java.util.Scanner;

public class Gplus {
    private double totalValue;
    private double purchaseAmmount;
    private double valueOfProduct;
    private double totalAmmount;
    private double ammount;
    ArrayList<Integer> ammountGplus = new ArrayList<>(5);

    Downpayment t = new Downpayment();

    public double getValueOfProduct() {
        return valueOfProduct;
    }

    public ArrayList<Integer> getAmmountGplus() {
        setAmmountGplus(ammountGplus);
        return ammountGplus;
    }

    public double getPurchaseAmmount() {
        return purchaseAmmount;
    }

    public void setAmmountGplus(ArrayList<Integer>ammountGplus) {
        Integer firstCategory = new Integer(10);
        ammountGplus.add(firstCategory);
        Integer secondCategory = new Integer(20);
        ammountGplus.add(secondCategory);
        Integer thirdCategory = new Integer(40);
        ammountGplus.add(thirdCategory);
        Integer fourthCategory = new Integer(60);
        ammountGplus.add(fourthCategory);
        Integer fifthCategory = new Integer(80);
        ammountGplus.add(fifthCategory);
        Integer sixthCategory = new Integer(99);
        ammountGplus.add(sixthCategory);
        }

    public void setPurchaseAmmount() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the ammount of the product : ");
        System.out.print(" ");
        this.purchaseAmmount = scan.nextDouble();
        seeInfo();
    }

    private void seeInfo(){
        System.out.println("Your product has this value : " + getPurchaseAmmount() + "€");

  }

    public void getammountAndGplus() {
        double ir = 0;
        if (purchaseAmmount > 0 && this.purchaseAmmount < 100){
            System.out.println("Gplus value is : " + ammountGplus.get(0)+ "€");
            ir = ammountGplus.get(0);
        }else if (purchaseAmmount > 100 && purchaseAmmount < 200){
            System.out.println("Gplus value is : " + ammountGplus.get(1)+ "€");
            ir = ammountGplus.get(1);
        }else if (purchaseAmmount > 201 && purchaseAmmount < 440.99) {
            System.out.println("Gplus value is : " + ammountGplus.get(2) + "€");
            ir = ammountGplus.get(2);
        }else if (purchaseAmmount > 441 && purchaseAmmount < 650.99) {
            System.out.println("Gplus value is : " + ammountGplus.get(3)+ "€");
            ir = ammountGplus.get(3);
        }else if (purchaseAmmount > 651 && purchaseAmmount < 799.99) {
            System.out.println("Gplus value is : " + ammountGplus.get(4)+ "€");
            ir = ammountGplus.get(4);
        }else if (purchaseAmmount > 800 && purchaseAmmount < 1199.99) {
            System.out.println("Gplus value is : " + ammountGplus.get(5)+ "€");
            ir = ammountGplus.get(5);
        }else{
            System.out.println("Invalid ammount of purchase ! ");
        }
        this.totalValue = ir;
        }

    public void setValueOfProduct(){
        this.valueOfProduct = (double) (purchaseAmmount + totalValue);
    }

    public void printMenu() {
        Discount w = new Discount(5, 10, 15);
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose your Discount % : " + "\n1. 5%" + "\n2. 10%" + "\n3. 15%" + "\n4. Exit.");
        int choice = scan.nextInt();
        if (choice == 1) {
            this.ammount = (valueOfProduct * (w.getDiscount1() / 100.0)) - valueOfProduct;
            System.out.println("Amount after discount =" + ammount + "€");
        } else if (choice == 2) {
            this.ammount = (valueOfProduct * (w.getDiscount2() / 100.0)) - valueOfProduct;
            System.out.println("Amount after discount =" + ammount + "€");
        } else if (choice == 3) {
            this.ammount = (valueOfProduct * (w.getDiscount3() / 100.0)) - valueOfProduct;
            System.out.println("Amount after discount =" + ammount + "€");
        } else if(choice == 4){
            this.ammount = valueOfProduct;
            System.out.println("Your total ammount without discount is : " + ammount);
        }else {
            System.out.println("Invalid choice try again !!");
        }
    }

    public void setTotalAmmount(){
        t.setMonths();
        totalAmmount = getValueOfProduct() / t.months;
        System.out.println("Your total ammount per month with Extra Warranty is : " + (double) Math.round(totalAmmount * 100) / 100 + "€");
        System.out.println("Your total ammount per month without Extra Warranty is  : " + (double)Math.round(getPurchaseAmmount() / t.months) + "€");
    }

    public void seeInfo1(){
        System.out.println("Total ammount for customer is : " + getValueOfProduct() + "€");
    }

    public void setNewAmmount(){
        double ammountNew = ammount / t.months;
        System.out.println("Your New total ammount per month with Extra Warranty is : " + (double) Math.round(ammountNew * 100) / 100 + "€");
    }

    public void openDiscounts(){
        System.out.println("Do you want to make your client a discount ? " + "Y " + "or " + " N ");
        Scanner choice2 = new Scanner(System.in);
        String answer = choice2.next().toUpperCase();
        if(answer.equals("Y")){
            printMenu();
            setNewAmmount();
        }else{
            System.out.println("Thank u for your purchase !");
        }
    }
}
