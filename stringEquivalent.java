// public class stringEquivalent {
//   public static void main(String[] args) {
//  String[] word1= {"ab","c"};
//  String[] word2={"a","bc"};
// // check the lenght of both the words.
// if(word1.length==word2.length){
//     boolean ans = true;
// //check for each character
// for(int i=0; i<word1.length; i++) 
// {
//     if(!word1[i].equals(word2[i]))
//     {
//        ans = false;
//        break;
//     }
// }
// if(ans) {
//     System.out.println("The string is equal");
// }else {
//     System.out.println("The string is not equal");
// }

// }else{
//     System.out.println("The length of the stirng is not equal");
// }

//   }
// }
public class stringEquivalent{
    public static void main(String[] args) {
        String[] word1={"ab","cd","e"};
        String word2="abcde";

        StringBuilder sb = new StringBuilder();
        for(String word : word1) {
            sb.append(word);
        }

        if(sb.toString().equals(word2))
        
        {
            System.out.println("The string are equal");
        }else
        {
            System.out.println("The string are not equal");
        }
     }
}
