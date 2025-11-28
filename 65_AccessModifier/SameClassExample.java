/*✅ Public Access Modifier Visibility in All Scenarios
Location of Access	Allowed?	Reason
Same Class	✅ Yes	Always accessible
Same Package (Different Class)	✅ Yes	Public is visible across all classes
Different Package (Non-Inherited Class / Direct Access)	✅ Yes	Public members can be accessed using the object reference
Different Package (Inherited Class / Subclass Access)	✅ Yes	Public members are inherited and accessible */

// File: SameClassExample.java
 class SameClassExample1{
    public int number = 10;

    public void show() {
        System.out.println("Public method accessed within the same class. Number = " + number);
    }
}
public class SameClassExample{
    public static void main(String []args){
        SameClassExample1 obj=new SameClassExample1();
        obj.show();
    }
}

