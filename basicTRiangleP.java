
public class basicTRiangleP{// Right Angle Triange, stars design.
   public static void main(String [] args){
   // int space=0;
   // int star=0;
      for(int i=1;i<=5;i++){// this the number of rows:5, first row:i=1;
           for(int col=5-i;col>=1;col--){// space=col-i;, this the formular to find number of spaces within same the row; num space is decrementing
               /* space=col-i;
                //star=col-space;
              if(col>0 && space>=0){ // this is rough work to get the formular/ the equation;
                System.out.print(" ");
              }/*if(star<5){
                   System.out.print("*");
              }*/
              System.out.print(" ");
               
           }for(int j=i;j>0;j--){// j represent each row, therefore j=i(row number), row number== stars, e.g first row has one star at the end of itself;
               System.out.print("*");
           }
           System.out.println("");// then we move to the next row;
           
      }
}
}

public class TriangleFStar{//
   public static void main(String [] args){
         int m=5;int colnum=0;
        for(int i=1;i<=5;i++){// this the number of rows:5, first row:i=1;
           for(int lScol=5-i;lScol>=1;lScol--){// space=col-i;, this the formular to find number of spaces within same the row; num space is decrementing
              
              System.out.print(" ");
              if(lScol<=2){
                  colnum=m-2;
              }
               
           }for(int j=i;j>0;j--){// j represent each row, therefore j=i(row number), row number== stars, e.g first row has one star at the end of itself;
              if(j>=3 && j=5){
                System.out.print("*");
              }
           }
           //System.out.println("");// then we move to the next row;

           for(int rcol=4;rcol>=0;i++){
               
           }
                      
      }

  }
}