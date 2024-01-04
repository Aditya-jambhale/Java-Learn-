 
public class palindrome {
    public static void main(String[] args) 
    {
       String original="RADAR";
       String rev="";
        System.out.println("The original string is:"+original);
         int STRrev=original.length();
         for (int i=STRrev-1; i>=STRrev; i--){
                rev= rev + original.charAt(i);
         }
         if(original.equals(rev)){
            System.out.println("The string entered is a palindrome");
         }else {
            System.out.println("The string entered is not a palindrome");
         }
        
        
       
    }
}



