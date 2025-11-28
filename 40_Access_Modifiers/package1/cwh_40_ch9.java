

class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
public class cwh_40_ch9 {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
        // harry.id = 45;
        // harry.name = "CodeWithHarry"; --> Throws an error due to private access modifier
        harry.setName("CodeWithHarry");
        System.out.println(harry.getName());
        harry.setId(234);
        System.out.println(harry.getId());
    }
}
/*🔹 1. public

It is fully open.

You can access public members from anywhere.

✅ Example:

Same class? ✔

Same package? ✔

Different package (even without inheritance)? ✔

Subclass in another package? ✔

👉 Use when you want methods/variables accessible everywhere.

🔹 2. protected

More restricted than public.

Accessible in:
✔ Same class
✔ Same package
✔ Subclass in another package
❌ Not accessible in a different package without inheritance

👉 Use when you want to expose something only to subclasses or same-package classes.

🔹 3. default (No Modifier)

When you don’t write any modifier, it's default.

Accessible only:
✔ In the same class
✔ In the same package
❌ Not accessible outside package
❌ Not even in subclasses of other packages

👉 Use when you want something accessible only within the same package.

🔹 4. private

Most restricted.

Accessible only:
✔ Inside the same class
❌ Not in same package
❌ Not in subclass
❌ Not in other package

👉 Use when you want full encapsulation (data hiding).

✅ Visual Example to Remember

Imagine access like a house:

Modifier	Who Can Enter?
public	Everyone (anyone from anywhere)
protected	Family + relatives in other cities (same package + subclasses)
default	Only people in your society/local area (same package only)
private	Only you (same class only)
✅ In One Line Each:

✅ public → accessible everywhere
✅ protected → same package + subclasses in other packages
✅ default → only same package
✅ private → only same class

If you want a quick diagram or more examples, just tell me! */
