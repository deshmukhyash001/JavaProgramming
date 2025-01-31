import java.util.*;

class Main{
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :) ");
        String n = "SYAIML";
        /** meaning of String b = sc.next();
         is b = new "SYAIML";
         
         and == operator compares object of the both variable but both object are different thats why we het fallse when n == b compared 
         
         we have two options 
         1) to use equals() method.
            - else method uses conttent of the variable to compare
         
         2) to use .next().intern(); input method.
            - it doesent make any new object for the input string if its already created.
            
            then the condition can be checked by == operator 
            we'll get desired output.
         **/
        String b = sc.next().intern();
        
        if(n == b){
            System.out.println("you entered string is 'SYAIML'");
        }
        else{
            System.out.println("String is not 'AIML'");
        }
    }
}