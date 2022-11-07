import java.util.*;
public class add{
  public static String add(String a, String b) {
   //making sure b length is bigger than a
    if(a.length()>b.length()){
      String t = a;
      a= b ;
      b= t;
    }
    
  //Declaring a and b length
    int longB = b.length();
    int longA = a.length();
    
  //Making two arrays of integer
    int[] numB = new int[longB];
    int[] numA = new int[longB];
  //initializing the long array
    for(int i = 0; i<longB;i++){
      numB[i] = Character.getNumericValue(b.charAt(longB-i-1));
    }
  //initializing the lower array
    for (int i=0;i<longA;i++){
       numA[i] = Character.getNumericValue(a.charAt(longA-i-1));
    }
    //for(int k =longA-1;k<longB;k++){
      //numA[k]=0;
   // }
    for(int i = 0; i<longB;i++){
      System.out.print(numB[i]);
    }
    System.out.println("");
    for(int i = 0; i<longB;i++){
      System.out.print(numA[i]);
    }
  //intializing nthe sum array
    int[] sum  = new int[longB+1];
  for(int i=0;i<longB;i++){
    sum[i]=0;
  }  
  for(int i = 0;i<longB;i++){
    sum[i]=numA[i]+numB[i]+sum[i];
    if(sum[i]>9){
      sum[i]=sum[i]-10;
      sum[i+1]=1;
    }
  }
  
    
  //initializing the smaller array
   String rc="";
    for(int j=longB;j>=0;j--){
      rc=rc+sum[j];
    }
    for(int i=0;i<rc.length();i++){
      if(rc.charAt(0)=='0'){
        rc = rc.substring(1,rc.length());
      }
    }
  return rc;
  
  }
}
