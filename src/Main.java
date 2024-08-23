public class Main {
    public static void main(String[] args) {
        //caller
        System.out.println("hello");

//functions..
//        print();
        //access modifier
        //public everyone can access this function
        //private only current class can access
        //default can accessible in default package/folder
    }
     public static void print(){
        //collie
         System.out.println("message 1");
         print1();
    }

    private static void print1() {
        System.out.println("message2");
    }


}
