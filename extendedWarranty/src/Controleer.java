
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Controleer {


    public static void main(String[]args){
       List<Double> totalAmmount1 = new ArrayList<Double>();

        Gplus e = new Gplus();
           int i = 0;
           do {
               e.setPurchaseAmmount();
               e.getAmmountGplus();
               e.getammountAndGplus();
               e.setValueOfProduct();
               e.seeInfo1();
               e.setTotalAmmount();
               e.openDiscounts();
               double ammounts = e.getValueOfProduct();
               totalAmmount1.add(ammounts);
               System.out.println(totalAmmount1);
               ammounts++;
               i++;
           }while(i<2);
        Receipt o = new Receipt();
        System.out.println(o);

            }


        }




