package exercises;
import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length: ");
        int length = input.nextInt();
        System.out.println("Please enter the width: ");
        int width = input.nextInt();
        System.out.println("The Rectangle's area is: "+ length * width);

    }
}
