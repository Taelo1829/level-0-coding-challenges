package org.umuzi;

public class Task07 {
  public static double    
 //1 Celsius is equal to 32 Fahrenheit 
    tempInCelcius(double celsius ){
    return celsius * 32;}
  public static double tempInFahrenheit(double fahrenheit ){
    return fahrenheit / 32;
  }
  
  
  public static void main(String[] args) {
  System.out.println(tempInCelcius(1));
  System.out.println(tempInFahrenheit(32));
  }
 
}
