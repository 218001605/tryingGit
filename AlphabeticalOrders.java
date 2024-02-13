/*Author: 218001605/msstudymail@gmail.com
*
* write a function that takes a string as parameter then it sorts alphebets in asceding oder and return string with sorted alphabets.
*Assume digits and Symbols were not included.
* e.g Hello ==>ehllo;
*/
import java.util.*;
public class AlphabeticalOrders{
   public static String alphabeticalOrders(String str){
      String alp="";
      char [] arr= str.toLowerCase().toCharArray(); // string conversion to lowercase then it is convected again to be charactor array;
      for(int i=0;i<arr.length;i++){// length of the array with no curly brakects;
         for(int j=0;j<arr.length;j++){
            if(arr[i]<arr[j]){ //sorting in an alphebetical order;
               char temp= arr[j];
               arr[j]=arr[i];
               arr[i]=temp;
            }
         }
      }
       for(int i=0;i<arr.length;i++){
          alp+=String.valueOf(arr[i]);// character is convected to a string then it is concatinated to alp string.
      }
   return alp;
   }
   public static void main(String [] args){
      Scanner scan= new Scanner(System.in);
      System.out.print("Enter Word: "); String str=scan.next();
      System.out.print(str+" ==> "+alphabeticalOrders(str));// string printed.
   }
}