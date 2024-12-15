import java.util.*;
class foodcosts{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the cost of mess food per day (Rs.): ");
        int X = scanner.nextInt();

        System.out.print("Enter the cost of restaurant food per day (Rs.): ");
        int Y = scanner.nextInt();

        int messCost = X * 6;
        int restaurantCost = Y;
        int totalCost = messCost + restaurantCost;

        System.out.println("Total cost of food for the week: Rs. " + totalCost);
    }
}