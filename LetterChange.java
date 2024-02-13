public class LetterChange{
   public static String letterChange(String str){
      String mstr="";
      str.toLowerCase();
         for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
               if(str.charAt(i)=='z'){
                  mstr+='a';
               }else{
                  mstr+=(char)(str.charAt(i)+1);
               }
              }
         }
      return mstr;
   }
   public static void main(String [] args){
      System.out.println(letterChange("abcz"));
   }
}