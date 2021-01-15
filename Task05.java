  package org.umuzi;

  public class Task05 {
      public static double AreaOfTriangle(double side1, double side2, double side3){
      double triangleSides = 0.5*(side1 + side2 + side3);
      double triangleArea = Math.sqrt(triangleSides * ((triangleSides - side1 ) * (triangleSides - side2) *(triangleSides - side3)));
 
  return triangleArea;
  }
  public static void main(String[] args) {
     System.out.print(AreaOfTriangle(6,5,5));
  }

}
