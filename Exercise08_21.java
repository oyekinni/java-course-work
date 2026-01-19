import java.util.Scanner;

public class Exercise08_21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of cities: ");
        int n = input.nextInt();

        double[][] cities = new double[n][2]; // 2D array: [cityIndex][x or y]

        System.out.print("Enter the coordinates of the cities: ");
        for (int i = 0; i < n; i++) {
            cities[i][0] = input.nextDouble(); // x
            cities[i][1] = input.nextDouble(); // y
        }

        int centralIndex = -1;
        double minTotalDistance = Double.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            double totalDistance = 0;

            for (int j = 0; j < n; j++) {
                totalDistance += distance(cities[i][0], cities[i][1],
                                         cities[j][0], cities[j][1]);
            }

            if (totalDistance < minTotalDistance) {
                minTotalDistance = totalDistance;
                centralIndex = i;
            }
        }

        System.out.printf("The central city is at (%.1f, %.1f)%n",
                cities[centralIndex][0], cities[centralIndex][1]);
        System.out.printf("The total distance to all other cities is %.2f%n",
                minTotalDistance);

        input.close();
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
