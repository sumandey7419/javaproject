import java.util.Scanner;
public class itemquantity {
    public void value(int price, int quantities){

        int totalprice = price*quantities;

        if(quantities>10)
        {
            int disc = totalprice*10/100;
            int newprice= totalprice-disc;
            System.out.println("The Discounted Price is: "+newprice);
        }
        else{
            System.out.println("The Price is: "+totalprice);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        itemquantity iq = new itemquantity();

        System.out.println("Enter the per item price: ");
        int price = sc.nextInt();
        System.out.println("Enter the no of quantities of the item: ");
        int quantity = sc.nextInt();

        iq.value(price, quantity);
    }
}
