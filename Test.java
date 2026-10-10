

class Dog {
    public void bark() {
        System.out.println("Inside bark method of class Dog");
    }
}

class Puppy1 extends Dog {
    public void bark() {
        System.out.println("Inside bark method of class Puppy1");
    }
}

class Puppy2 extends Dog {
    public void bark() {
        System.out.println("Inside bark method of class Puppy2");
    }
}

class Test {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Puppy1();
        Dog d3 = new Puppy2();

        d1.bark();
        d2.bark();
        d3.bark();
    }
}
