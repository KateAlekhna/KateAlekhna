import java.io.IOException;

public class third {
    public static void main(String[] args) throws IOException {
        double a = 2;
        double b = 7;
        double perimeter;
        double square;


        square = a * b / 2;
        perimeter = Math.sqrt(a * a + b * b) + a + b;


        System.out.println("Периметр = " + perimeter);
        System.out.println("Площадь = " + square);


    }

}
