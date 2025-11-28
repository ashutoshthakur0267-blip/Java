interface X {
    void show();
}

interface Y {
    void display();
}

// Interface Z inherits both X and Y
interface Z extends X, Y {
    void print();
}

class Demo implements Z {
    public void show() {
        System.out.println("show() from X");
    }
    public void display() {
        System.out.println("display() from Y");
    }
    public void print() {
        System.out.println("print() from Z");
    }
}

public class MultipleInterfaceInheritance {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
        d.display();
        d.print();
    }
}
