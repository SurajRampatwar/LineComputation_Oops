import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        System.out.println("Enter coordinates of line1");
        int a1, a2, b1, b2;
        int w1, w2, z1, z2;
        Scanner line = new Scanner(System.in);
        a1 = line.nextInt();
        a2 = line.nextInt();
        b1 = line.nextInt();
        b2 = line.nextInt();
        Coordinates input1 = new Coordinates(a1, a2, b1, b2);
        double line1 = input1.lengthOfLine();
        System.out.println("Length of Line1 is " + line1);
        System.out.println("Enter coordinates of line2");
        w1 = line.nextInt();
        w2 = line.nextInt();
        z1 = line.nextInt();
        z2 = line.nextInt();
        Coordinates input2 = new Coordinates(w1, w2, z1, z2);
        double line2 = input2.lengthOfLine();
        System.out.println("Length of Line2 is " + line2);

    }
}
