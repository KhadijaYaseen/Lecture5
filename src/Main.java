public class Main {
    public static void main(String[] args) {
        //caller
        System.out.println("hello");
//call by value
 //print  1 to 5
//pass by reference
        printNumber(5);
        printNumber(6.5);
        int[] newArr ={10,20,30,40};
       int res= sumOfArray(newArr);
        System.out.println(res);
//functions..
//        print();
        //access modifier
        //public everyone can access this function
        //private only current class can access
        //default can accessible in default package/folder
    }
    //array non-primitive and reference data structure
    static int sumOfArray(int []arr){//pass by reference
   int sum=0;
   for(int j=0;j<arr.length;j++){
    sum +=arr[j];
   }
   return sum;

    }
//function overloading
    //1 . same return type, same name but different number of arguments
    //  example == void abc(int n){}
    //void abc(int n1.int n2){}
    //2.  same return type and same name but sequence of parameters / arguments are different
    // example == void abc(int n, double d){}
    // void abc(double d1,int n1){}
    //3. same return type , same name but different data type of parameters.
    //void abc(int n){}
    //void abc(string n1){}
    //void abc(int n, double d){}
    // void abc(int n1, double d1){}

    private static void printNumber(int i) {//call by value
        for(int j=0;j<i ;j++){
            System.out.println(j+1);
        }
    }
    private static void printNumber(double i) {
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
