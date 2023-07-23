package Classworks;

//  overloading, overriding
class Base {
    void printName() {
        System.out.println("Base Class");
    }
    void printName(String s, int count) {   //  overloading
        while (count > 0) {
            System.out.println(s);
            count--;
        }
    }
}

class Child extends Base {
    @Override
    void printName() {  //  overriding
        System.out.println("Child Class");
    }
}
