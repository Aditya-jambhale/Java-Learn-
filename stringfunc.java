//returning the string
public class stringfunc {
    public static void main(String[] args) {
        String message=greet();
        System.out.println(message);
        int calc=sum(10, 20);
        System.out.println(calc);
        
    }
    static String greet()
    {
        String greeting ="Hello  this is aditya ";
        return greeting ;
    }
    // pass the value when you are calling the metod in main
    static int sum(int a , int b )
   {

    int sum = a + b;
    return sum;

   }

}
