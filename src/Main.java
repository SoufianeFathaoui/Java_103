public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        Test test = new Test();
        test.printValue(b);
        // This is a anonymouse object and class, that's how we create it.
        new myInterface(){
            public void prentData() {
                System.out.println("Welcome to anonymouse object and class");
            }
            public int getData() {
                return 0;
            }
        }.prentData();


    }




}