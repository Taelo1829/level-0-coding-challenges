package org.umuzi;

public class Task06 {
  public static int maximum(int num1,int num2 , int num3){
    if(num1 >= num2 && num1 >= num3)
          return num1;
        if(num2 >= num1 && num2 >= num3)
          return num2;
        else 
          return num3;
        
      
    }
  

  public static void main(String[] args) {
    System.out.println(maximum(9,2,6));
  }

}
