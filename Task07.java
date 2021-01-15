package org.umuzi;

public class Task07 {
  public static double    
 // Fahrenheit = 1*8(Celcius)+32
    CelciusToFahrenheit(double celsius ){
    return 1.8*celsius + 32;}
  public static double FahrenheitToCelcius(double fahrenheit ){
    return (fahrenheit-32)/1.8;
  }
  
  
  public static void main(String[] args) {
  System.out.println(CelciusToFahrenheit(37));
  System.out.println(FahrenheitToCelcius(98.6));
  }
}
