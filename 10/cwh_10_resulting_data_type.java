

public class cwh_10_resulting_data_type {
    public static void main(String[] args) {
        /* byte x = 5;
        int y = 6;
        short z = 8;
        int a = y + z;
        float b = 6.54f + x;
        System.out.println(b); */

        // Increment and Decrement Operators
        int i = 56;
        // int b = i++; // first b is assigned i (56) then i is incremented
        int j = 67;
        int c = ++j; // first j is incremented then c is assigned j (68)
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
        int y = 7;
        System.out.println( ++y *8);
        char ch = 'a';
        System.out.println(++ch);
    }
}
/*Resulting data type after arithmetic operation
Result = byte + short -> integer
Result = short + integer -> integer
Result = long + float -> float
Result = integer + float -> float
Result = character + integer -> integer
Result = character + short -> integer
Result = long + double -> double
Result = float + double -> double
Increment and Decrement operators
a++, ++a (Increment Operators)
a--, --a (Decrement Operators)
These will operate on all data types except Booleans.

Quick Quiz: Try increment and decrement operators on a Java variable

a++ -> first use the value and then increment
++a -> first increment the value then use it
Quick Quiz: What will be the value of the following expression(x).

int y=7;
int x = ++y*8;
value of x?
char a = ‘B’;
a++; (a is not ‘C’) */