//  diamond problem
package Classworks;

interface I {
    void foo();
}
class A implements I {
    public void foo() {}
}

class B implements I {
    public void foo() {}
}

class C extends A/*, B */{ // won't compile without comment
    public void bar() {
        super.foo();
    }
}