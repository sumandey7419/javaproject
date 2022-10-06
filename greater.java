import java.util.Scanner;
public class greater {
    public void getGreat(int a, int b){
        if(a>b){
            System.out.println(a+" > "+b);
        }
        else{
            System.out.println(b+" > "+a);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        greater gr = new greater();

        System.out.println("Enter the Two Values which are to be compared");
        int a = sc.nextInt();
        int b = sc.nextInt();
        gr.getGreat(a,b);
    }
}
