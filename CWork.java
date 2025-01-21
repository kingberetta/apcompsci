import java.util.Scanner;

class CWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String studentname = "Craig";
        int age = 16;
        String id = "c_212";
        double feesowed = 333.8;
        int gradeforcompsci = 98;
        
        System.out.println("Student name is " + studentname + " and he is " + age + " years old");
        System.out.println("Student ID: " + id);
        System.out.println("Owing: $" + feesowed);
        System.out.println("He got a " + gradeforcompsci + " in Computer Science");
        System.out.println("");
        
        System.out.println("What is your name?");
        String name = input.nextLine();
        
        System.out.println("How old are you?");
        int agee = Integer.parseInt(input.nextLine());
        
        String first = String.valueOf(name.charAt(0)).toLowerCase();
        
        int idnum = (int)(Math.random() * 100001);
        
        String newid = first + "_" + idnum;
        
        System.out.println("How much are you owing our institution in USD?");
        double fees = input.nextDouble();
        input.nextLine();
        
        System.out.println("What grade did you get in Computer Science?");
        int grade = input.nextInt();
        System.out.println("");
        System.out.println("Student name is " + name + " and he is " + agee + " years old");
        System.out.println("Student ID: " + newid);
        System.out.println("Owing: $" + fees);
        System.out.println("He got a " + grade + " in Computer Science");
        
    }
}
