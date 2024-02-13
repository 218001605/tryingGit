import java.util.*;
public class Calculator{
   public static void calculator(String str){
      double sum; char [] arr=str.toCharArray(); double num1=0; double num2=0; char c1, char c2;
      for(int i=0;i<str.length();i++){
        
      
      for(int j=i; j<arr.length;j++){
         /* if(str.charAt()=='('){
          pos=j;
         //}
         if(str.charAt()==')'){
            pos=j;
         }
         */if(arr[i]=='+' && arr[i]!=arr[0] && arr[arr.length-1]!='+'){
            if(num1!=0 && isDigit(arr[i+1])){
               num2=arr[1+1];
               sum=num1+num2;
               num1=sum;
               num2=0;
               i++;
            }if(arr[i]=='*'){
               
            }if(arr[i]=='/'){
            
            }
         }
         if(str.charAt()=='-'){
            pos=j;
         }
         if(arr[i]=='*'){
            
         }
         if(str.charAt()=='/'){
            pos=j;
         }

      }
      sum=
     }
      
   }
   public static char symbol(){
      
   }
   public static void main(String [] args){
      
   }
}