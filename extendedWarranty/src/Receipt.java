public class Receipt {
    private double purAmmount;
    private double gplus;
    private double discountValue;

    Receipt(){
        Gplus qc = new Gplus();
    }

    @Override
    public String toString() {
        System.out.println("Your receipt is : ");
        return "Receipt{" +
                "purAmmount=" + purAmmount +
                ", gplus=" + gplus +
                ", discountValue=" + discountValue +
                '}';
    }
}
