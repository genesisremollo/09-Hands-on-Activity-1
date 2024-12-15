import java.util.Scanner;

class Quadrilateral {
    public void showDescription() {
        System.out.println(" - is quadrilateral");
    }
}

class Rectangle extends Quadrilateral {
    @Override
    public void showDescription() {
        super.showDescription(); // Calls Quadrilateral's method
        System.out.println(" - has 4 right angles");
    }
}

class Square extends Rectangle {
    @Override
    public void showDescription() {
        super.showDescription(); // Calls Rectangle's method
        System.out.println(" - has 4 equal sides");
    }
}

public class RunQuad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Press R for Rectangle or S for Square: ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("R")) {
            Rectangle rectangle = new Rectangle();
            System.out.println("A rectangle:");
            rectangle.showDescription();
        } else if (choice.equalsIgnoreCase("S")) {
            Square square = new Square();
            System.out.println("A square:");
            square.showDescription();
        } else {
            System.out.println("Invalid input. Please enter R or S.");
        }

        scanner.close();
    }
}

