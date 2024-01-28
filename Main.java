import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        PaintJob paintJob1 = new PaintJob();
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter the project's title: ");
        paintJob1.setProjectName(scanner1.nextLine());
        System.out.print("Enter your budget: ");
        paintJob1.setBudget(scanner1.nextFloat());
        System.out.print("Enter wall height (feet): ");
        paintJob1.setHeight(scanner1.nextFloat());
        System.out.print("Enter wall width (feet): ");
        paintJob1.setWidth(scanner1.nextFloat());
        System.out.print("Enter wall length (feet): ");
        paintJob1.setLength(scanner1.nextFloat());
        System.out.print("Enter the price of a can of paint: ");
        paintJob1.setCanPrice(scanner1.nextFloat());
        System.out.println("******************************");
        System.out.println("Project name: " + paintJob1.getProjectName());
        System.out.println("Wall area: " + paintJob1.getArea() + "ft^2");
        System.out.println("******************************");
        int i = 1;
        while(i <4){
            System.out.println("Amount of paint needed: " + ((paintJob1.getPaintNeeded() * i) + "L"));
            System.out.println("Number of paint cans needed: " +(paintJob1.getNumCans() + (i-1)) + " cans");
            System.out.println("The price of " + i + " coat(s) of paint: " + (paintJob1.getCoatCost() + (paintJob1.getCanPrice()*(i - 1))) +"$");
            System.out.println("The amount of money left from the budget after a "+ i + " coat(s): " + (paintJob1.getBudget() - (paintJob1.getCoatCost() + (paintJob1.getCanPrice()* (i - 1)))) +"$");
            System.out.println("******************************");
            i += 1;
        }
    }
}