package org.umuzi;

public class Task08 {
  public static void timeConverter(int num){
    int hours = num / 60;
   int minutes = num % 60;
    if (hours == 1 ){
        if (minutes != 1){
      System.out.println(hours + " hour," + minutes + " minutes");
      }else{
      System.out.println(hours + " hour, " + minutes + " minute");
   }
       } else {
      if (minutes != 1){
          System.out.println(hours + " hours," + minutes + " minutes");
          }else{
                System.out.println(hours + " hours," + minutes + " minute");
              }
   }
      
    } 
  
  public static void main(String[] args) {
  timeConverter(121);
  
  }

}
