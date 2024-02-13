/* Author: @msstudymail@gmail.com
*# AN Amstrong number is a number that is equal to the summation of it's power squared digits. /// e.g 145= (1)^2+(4)^2+(5)^2=145
*  145==(1*1)+(4*4)+(5*5)     // 145== ((1^2)+(4^2)+(5^2))==145
*/
import java.util.*;
public class Armstrong{
   public static void isAmstrong(int number){
       String n=String.valueOf(number); // from integer to string.
      int sum=0;
      for(int i=0;i<n.length();i++){
         sum+=Math.pow(n.charAt(i),2);// Charactor is extracted & raised to the power two then it is added to the sum.
      }
      if(sum==number){
         System.out.println(number+" is an armstrong \n");
      }/*else{
         System.out.print(" is not an armstrong \n");
      }*/

   }
   public static void main(String [] args){
      Scanner scan= new Scanner(System.in);
      System.out.print("Number: "); int number=scan.nextInt();
      System.out.println("Amstrong numbers in 1 - "+number);
      for(int i=1;i<=number;i++){
         isAmstrong(i);
      }
   }
}