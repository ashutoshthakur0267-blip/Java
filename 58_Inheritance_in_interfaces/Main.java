interface A {
    void methodA();
}

interface B extends A {
    void methodB();
}

class C implements B {
    public void methodA() {
        System.out.println("methodA() from Interface A");
    }
    public void methodB() {
        System.out.println("methodB() from Interface B");
    }
}

public class InterfaceInheritanceDemo {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        obj.methodB();
    }
}
