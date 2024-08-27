public class Main {
    public static void main(String[] args) {
        //recursive
        /* factorial
        * 4!=4*3!
        * 3!=3*2!
        * 2!=2*1!
        * 1!=1*0!
        * 0!=1
        *n!=n*(n-1)!
        * */




        /*
        * int power (base , exp)
        * 2^4= 2*2^3
        * 2^3= 2*2^2
        * 2^2= 2*2^1
        *2^1= 2*2^0
        * 2^0=1
        *
        * recursive problem always solve through breakdown process
        *
        * */

          //recursion
     /*
     * a function call itself
     * 5 4 3 2 1 solution recursive code
     * through stack and through  recursive tree
     *
     */


//        printSeries(5);
//        System.out.println("Power ="+power(2,4 ));
        System.out.println("Factorial is "+fact(4 ));
    }
    //find factorial
    private static int fact(int num){
        if(num==0||num==1)//base condition
            return 1;
   return num* fact(num-1);//recursive call
    }





    //remaining code ;

// power function using recursion
//static int power(int base,int  exp){
//
//        if (exp==0)//base condition
//            return 1;
//      return base* power(base,exp-1);
}



   // infinite time recursive calls
//     public static void printSeries(int num){
//
//         if(num>1)//Base condition
//         printSeries(num-1);// recursive call
//         System.out.println(num);
//    }
