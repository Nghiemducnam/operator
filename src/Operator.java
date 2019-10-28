import java.util.Scanner;
public class Operator {
    public static void main(String[] args) {
        float width;
        float height;
        float area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width:");
        width = sc.nextFloat();

        System.out.println("Enter height:");
        height = sc.nextFloat();

        area = width*height;
        System.out.println("area is: " + area);
    }
}
