import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**********Welcome to Coffee Machine Simulator***********");

        while (true){
            System.out.println("Select work what you want to do.");
            System.out.println("Press 1: Buy a Coffee.");
            System.out.println("Press 2: Fill Ingredients.");
            System.out.println("Press 3: See Ingredients.");
            System.out.println("Press 4: Take money.");
            System.out.println("Press 5: See Coffee Machine Analysis.");
            System.out.println("Press 6: Exit.");

            int work = sc.nextInt();
            CoffeeMachineSimulator coffeeMachineSimulator = new CoffeeMachineSimulator();
            switch (work){
                case 1:
                    coffeeMachineSimulator.buyCoffee();
                    break;
                case 2:
                    coffeeMachineSimulator.fillIngredients();
                    break;
                case 3:
                    coffeeMachineSimulator.showIngredients();
                    break;
                case 4:
                    coffeeMachineSimulator.takeMoney();
                    break;
                case 5:
                    coffeeMachineSimulator.showAnalytics();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid work...");
            }
        }
    }
}