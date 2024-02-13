/*Author : 218001605/ msstudymail@gmail.com
* function is taking a string as parameter and check if the string is a valid password;
* Password must not contain a word "password".
* Password length must be longer than 7 character and shorter than 31 charactors.
* Password must have atleast punctuation mark/ any mathematical symbol.
* Password must have atleast one digit.
* Password must have uppercase letter.
* This function should return String as true/ false;
*/
import java.util.*;
public class Password{
    public static String singlePassword(String str){
      String valid=""; boolean isnumber=false; boolean symbol=false; boolean ispassword=false; boolean isUpperletter=false;
      if(str.length()>7 && str.length()<31){
         for(int i=0;i<str.length();i++){
            if(!((str.charAt(i)>='a' && str.charAt(i)<='z') || ( str.charAt(i)>='A' && str.charAt(i)<='Z'))){// not alphabet && not digit
               symbol=true;// isLetter() is the most simplest method to be used. ## Character.isLetter(str.charAt(i));
            }if(Character.isDigit(str.charAt(i))){// utelize Character wraper class / Character contains static methods such as isDigit() and isUpperCase().
               isnumber=true;
            }if(Character.isUpperCase(str.charAt(i))){
               isUpperletter=true;
            }
         }
         if(!str.contains("password")){// contains is a String method;
            ispassword=true;
         }
         if(isnumber && symbol && ispassword && isUpperletter ){
            valid="true";
         }else{
            valid="false";
         }
      }else{
         valid="false";
      }
      return valid;
    }
    public static void main(String [] args){
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter Password: "); String pass= scan.nextLine();
      if(singlePassword(pass)=="true"){
         System.out.print(pass+"==>"+singlePassword(pass));
      }else{
         System.out.print(pass+"==>"+singlePassword(pass));
      }
    }
}