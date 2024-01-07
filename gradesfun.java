import java.util.Scanner;
public class gradesfun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.print("ENter your marks to see your Grades:");
         int marks = scanner.nextInt();
         scanner.close();
         String grade=calcmarks(marks);
        System.out.println("Your Grade is: " + grade);
    }
    static String calcmarks(int marks) {
        
         if(marks>=91 && marks<=100)
         {
            return "AA";
         }else if(marks>=81&&marks<=90)
         {
            return "AB";
        }else if(marks>=71&&marks<=80)
         {
           return "BB";
        }else if(marks>=61&&marks<=70)
         {
           return "BC";
        }else if(marks>=51&&marks<=60)
         {
            return "CC";
        }else if(marks>=41&&marks<=50)
         {
            return "CD";
        }else 
         {
            return "sorry but you are failed this sem";
        }

    }
}