import java.util.Scanner;
class number {
    public static void main(String[] args){
    Scanner number= new Scanner(System.in);
  //   Even or oDD number 
     int num=number.nextInt();
     if(num % 2 == 0){
        System.out.println("EVEN");
    }
    else{
        System.out.println("ODD");
    }
  // Taking input and greet
  
     Scanner name= new Scanner(System.in);
      System.out.print("Enter you name:");
      String msg=name.nextLine();
      System.out.println("Hello MR."+msg+"m so happy to see you here kindly have a seat and enjoy!");
     
}

 }

