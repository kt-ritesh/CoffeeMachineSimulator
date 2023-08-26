import java.util.Scanner;

public class CoffeeMachineSimulator {
    Scanner sc = new Scanner(System.in);
    private static int water = 0;
    private static int milk = 0;
    private static int beans = 0;
    private static int money = 0;
    private static int cappuccinoCount = 0;
    private static int latteCount = 0;
    private static int espressoCount = 0;
    private final static int cappuccinoPrice = 6;
    private final static int lattePrice = 7;
    private final static int espressoPrice = 4;

    public void buyCoffee(){
        System.out.println("Enter your coffee choice which you want to buy:- ");
        System.out.println("Press : 1, Cappuccino($"+cappuccinoPrice+")");
        System.out.println("Press : 2, Latte($"+lattePrice+")");
        System.out.println("Press : 3, Cappuccino($"+espressoPrice+")");

        int choice = sc.nextInt();

        if(choice==1){
            if(hasEnoughIngredients(Cappuccino.getWater(), Cappuccino.getMilk(), Cappuccino.getCoffeeBeans())){
                makeCoffee("Cappuccino", cappuccinoPrice, Cappuccino.getWater(), Cappuccino.getMilk(), Cappuccino.getCoffeeBeans());
                cappuccinoCount++;

            }else{
                System.out.println("Not Enough Ingredients to make your preferred coffee!!!");
            }
        }else if(choice==2){
            if(hasEnoughIngredients(Latte.getWater(), Latte.getMilk(), Latte.getCoffeeBeans())){
                makeCoffee("Latte", lattePrice, Latte.getWater(), Latte.getMilk(), Latte.getCoffeeBeans());
                latteCount++;

            }else{
                System.out.println("Not Enough Ingredients to make your preferred coffee!!!");
            }
        }else if(choice==3){
            if(hasEnoughIngredients(Espresso.getWater(), Espresso.getMilk(), Espresso.getCoffeeBeans())){
                makeCoffee("Espresso", espressoPrice, Espresso.getWater(), Espresso.getMilk(), Espresso.getCoffeeBeans());
                espressoCount++;

            }else{
                System.out.println("Not Enough Ingredients to make your preferred coffee!!!");
            }
        }else{
            System.out.println("Invalid coffee choice!!!!");
        }
    }

    private void makeCoffee(String coffeeType, int coffeePrice, int coffeeWater, int coffeeMilk, int coffeeBeans) {
        System.out.println("Dispensing your "+coffeeType+" Enjoy!!!!");
        money+=coffeePrice;
        water-=coffeeWater;
        milk-=coffeeMilk;
        beans-=coffeeBeans;
    }

    private boolean hasEnoughIngredients(int requiredWater, int requiredMilk, int requiredBeans) {
        return (water>=requiredWater && milk>=requiredMilk && beans>=requiredBeans);
    }

    public void fillIngredients(){
        System.out.println("Enter the amount of water you want to add in ml:-");
        water+=sc.nextInt();
        System.out.println("Enter the amount of milk you want to add in ml:-");
        milk+=sc.nextInt();
        System.out.println("Enter the amount of beans you want to add:-");
        beans+=sc.nextInt();
    }

    public void showIngredients(){
        System.out.println("The available Ingredients:-");
        System.out.println("Water : "+water+" ml.");
        System.out.println("Milk : "+milk+" ml.");
        System.out.println("Beans : "+beans+" units.");
        System.out.println("Money : $"+money);
    }

    public void takeMoney(){
        System.out.println("Taking $"+money+" from the money box.");
        money = 0;
    }

    public void showAnalytics(){
        System.out.println("Coffee machine analysis details:--");
        System.out.println("Cappuccino sold: "+cappuccinoCount);
        System.out.println("Latte sold: "+latteCount);
        System.out.println("Espresso sold: "+espressoCount);

        System.out.println("Total Earning: $"+((cappuccinoCount*cappuccinoPrice)+(latteCount*lattePrice)+(espressoCount*espressoPrice)));
        System.out.println("Total water used: "+((cappuccinoCount*Cappuccino.getWater())+(latteCount*Latte.getWater())+(espressoCount*Espresso.getWater())));
        System.out.println("Total milk used: "+((cappuccinoCount*Cappuccino.getMilk())+(latteCount*Latte.getMilk())+(espressoCount*Espresso.getMilk())));
        System.out.println("Total beans used: "+((cappuccinoCount*Cappuccino.getCoffeeBeans())+(latteCount*Latte.getCoffeeBeans())+(espressoCount*Espresso.getCoffeeBeans())));

    }


}
