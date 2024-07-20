import java.util.Scanner;

public class Marks{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the mark for your student");
            int marks = scanner.nextInt();
            
            if (marks >= 80) {
                System.out.print("outstanding achievement!");
            } else if (marks >= 60) {
                System.out.print("Excellent");
            } else if (marks >= 30) {
                System.out.print("pass!");
            } else {
                System.out.print("fail!");
            }
    }}