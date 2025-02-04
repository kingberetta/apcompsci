import java.util.Scanner;

class DoorCode{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("INPUT YOUR SECURITY CODE: ");
        String code = scan.nextLine();
        if(code.equals("2772")){
            System.out.println("Enter");
        } else {
            System.out.println("Unrecognised");
        }
        scan.close();
    }
}
