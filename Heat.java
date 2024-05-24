import java.util.Scanner;
public class Heat {
    public static void main(String[] args) {
        int heat;

        Scanner input=new Scanner(System.in);

        System.out.println("Enter the heat: ");
        heat=input.nextInt();

        if (heat < 5)
        {
            System.out.println("You can go skiing.");
        } else if (heat >=5 && heat <=25)
        {
            if (heat <=15){
                System.out.println("You can go cinema.");
            }
            if (heat >=10){
                System.out.println("You can go picnic.");
            }
        }else {
            System.out.println("You can go swimming.");
        }

    }
}
