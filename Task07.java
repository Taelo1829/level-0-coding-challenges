package org.umuzi;

public class Task07 {
  public static double tempInCelcius(double temp){
    return temp * 33.6;}
  public static double tempInFahrenheit(double temperature ){
    return temperature / 33.6;
  }
  
  
  public static void main(String[] args) {
  System.out.println(tempInCelcius(3));
  System.out.println(tempInFahrenheit(100));
  }
 
}
