import java.util.Scanner;

public class ex3 {
    public static double length(int x1, int y1, int x2, int y2) {

        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты первой вершины (x1 y1):");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Введите координаты второй вершины (x2 y2):");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println("Введите координаты третьей вершины (x3 y3):");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        double sideAB = length(x1, y1, x2, y2);
        double sideBC = length(x2, y2, x3, y3);
        double sideCA = length(x3, y3, x1, y1);
        double perimeter = sideAB + sideBC + sideCA;

        System.out.println("Периметр треугольника: " + perimeter);
    }
}