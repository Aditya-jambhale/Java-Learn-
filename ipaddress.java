import java.util.Scanner;
public class ipaddress {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter ip address:");
        String address=in.nextLine();
       String print= ipaddress(address);
       System.out.println("The defanged address is : " + print);
    }
    static String ipaddress(String address)
    {
        
        return address.replace(".","[.]");
        
    }
}
