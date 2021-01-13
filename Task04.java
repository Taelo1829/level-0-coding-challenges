package org.umuzi;

public class Task04 {
  public static void evenOrOdd(int number){
    if (number % 2 == 0){
      System.out.println("even");
    }else{
      System.out.println("odd");
    }
  }

  public static void main(String[] args) {
    evenOrOdd(19);
  }

}
