// ✅ Parent Class
class Animal {
    public String type = "Mammal";      // public - accessible everywhere
    protected void eat() {              // protected - accessible in subclass
        System.out.println("Animal is eating");
    }
}

// ✅ Child Class (Single Inheritance)
class Dog extends Animal {
    public void showDetails() {
        System.out.println("Type: " + type); // Accessing public member
        eat();                               // Accessing protected method
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.showDetails();
        
    }
}
