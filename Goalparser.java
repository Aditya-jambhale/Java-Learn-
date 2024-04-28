public class Goalparser {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
       int i = 0;
        String  s="(al)G()()()";
        while(i<s.length())
         if (s.charAt(i)=='G') {
        sb.append("G");
        i++;
         }
         else if(s.charAt(i)=='('&&s.charAt(i+1)==')')
         {
           sb.append("o");
           i+=2;
         }
         else if(s.charAt(i)=='(' && s.substring(i,i+4).equals("(al)"))
         {
            sb.append("al");
            i+=4;
         }
         else {
            System.out.println("Invalid");
         }
         System.out.println(sb.toString());

    }
}
