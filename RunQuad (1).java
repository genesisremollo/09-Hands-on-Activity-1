public class RunQuad {
    public static void main(String[] args) {
        // Create instances of each class
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Parallelogram parallelogram = new Parallelogram();
        Rhombus rhombus = new Rhombus();
        Trapezoid trapezoid = new Trapezoid();

        // Display the choices and their descriptions
        System.out.println("Select from the following:");
        System.out.println("R - Rectangle");
        rectangle.print();
        System.out.println("S - Square");
        square.print();
        System.out.println("P - Parallelogram");
        parallelogram.print();
        System.out.println("H - Rhombus");
        rhombus.print();
        System.out.println("T - Trapezoid");
        trapezoid.print();
    }
}

class Quadrilateral {
    public void print() {
        System.out.println("- is quadrilateral");
    }
}

class Rectangle extends Quadrilateral {
    @Override
    public void print() {
        System.out.println("- has 2 pairs of parallel sides");
        System.out.println("- has 4 right angles");
        super.print();
    }
}

class Square extends Rectangle {
    @Override
    public void print() {
        System.out.println("- has 4 congruent sides");
        super.print();
    }
}

class Parallelogram extends Quadrilateral {
    @Override
    public void print() {
        System.out.println("- has 2 pairs of parallel sides");
        super.print();
    }
}

class Rhombus extends Parallelogram {
    @Override
    public void print() {
        System.out.println("- has 4 congruent sides");
        super.print();
    }
}

class Trapezoid extends Quadrilateral {
    @Override
    public void print() {
        System.out.println("- has 1 pair of parallel sides");
        super.print();
    }
}
