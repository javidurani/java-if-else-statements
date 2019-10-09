
package pkgif.pkgelse.statements;

import java.util.Scanner;



/**
 *
 * Name: Javier Duran
 * Period: 2
 * Project Name: If-Else Statements
 * 
 * 
 */
public class IfElseStatements {

   private static Scanner in = new Scanner(System.in);
    
    
    
    public static void main(String[] args) {
        // Happy Coding!
        
        
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();
        question8();
        question9();
        question10();
    }
    
    
    public static void question1(){
        System.out.println("Enter your grade: ");
        int grade = in.nextInt();
        if (grade >= 70){
            System.out.println("PASSING");
       
        }
        else {
            System.out.println("FAILING");
            
        }
    }
    
    public static void question2(){
        System.out.println("Enter the number to either go or stop: ");
        int num = in.nextInt();
        if (num <= 50){
            System.out.println("GO!");
            
        }
        else {
            System.out.println("STOP!");
        }
    }
    
    
    public static void question3(){
        System.out.println("Enter the integer to see if it is even or odd: ");
        int integer = in.nextInt();
        if (integer % 2 == 0){
            System.out.println("EVEN");
        }
        else {
            System.out.println("ODD");
        }
    }
    
    public static void question4(){
        System.out.println("Enter the number to see if it is a multiple of 5: ");
        int num = in.nextInt();
        if (num % 5 == 0){
            System.out.println("MULTIPLE OF 5");
        
        }
        else{
            System.out.println("NOT A MULTIPLE OF 5");
            
        }
    }
    
    public static void question5(){
        System.out.println("Enter number to check digits: ");
        int num = in.nextInt();
        if (num <= 10){
            System.out.println("ONE DIGIT");
        }
        else if (num >= 100){
            System.out.println("THREE DIGITS");
        }
        else {
            System.out.println("TWO DIGITS");
        }
    }
    
    public static void question6(){
        System.out.println("Enter number to see if it is retired: ");
        int num = in.nextInt();
        if (num == 12 || num == 71 || num == 80){
            System.out.println("That number is retired from the Seattle Seahawks!");
            
        }
      
    }
    
    public static void question7(){
        System.out.println("Enter the state: ");
        String state = in.next();
        if (state.equals("Oregon") || state.equals("Washington") || state.equals("Idaho")){
            System.out.println("This state is in the PNW");
        }
        else {
            System.out.println("You should me here to the PNW; it's great here!");
        }
        
    }
    
    public static void question8(){
        System.out.println("Enter one of the following drinks (Short, Tall, Grande, Venti): ");
        String drink = in.next();
        if (drink.equals("Short")){
            System.out.println("Number of ounces is 8");
            
        }
        else if (drink.equals("Tall")){
            System.out.println("Number of ounces is 12");
        }
        else if (drink.equals("Grande")){
            System.out.println("Number of ounces is 16");
        }
        else if (drink.equals("Venti")){
            System.out.println("Number of ounces is 20");
        }
    }
    
    public static void question9(){
        System.out.println("Enter your rate: ");
        int rate = in.nextInt();
        System.out.println("Enter your hours worked: ");
        int hours = in.nextInt();
        if (hours > 40){
            int extratime = hours - 40;
            int extratime2 = rate + rate/2;
            System.out.println("You would gross: $" + ((hours - extratime) * rate + extratime * extratime2));
        }
        else {
            System.out.println("You would gross: $" + hours * rate);
        }
    }
    
    
    public static void question10(){
         System.out.println("Enter your rate: ");
        int rate = in.nextInt();
        System.out.println("Enter your hours worked: ");
        int hours = in.nextInt();
        if(hours > 60){
            System.out.println("Please see manager.");
    }
        else if (hours > 40){
            int extratime = hours - 40;
            int extratime2 = rate + rate/2;
            System.out.println("You would gross: $" + ((hours - extratime) * rate + extratime * extratime2));
        }
        
        else {
            System.out.println("You would gross: $" + hours * rate);
        }
    }
    
}
