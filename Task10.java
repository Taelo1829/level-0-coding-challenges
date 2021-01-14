package org.umuzi;

public class Task10 {
   public static void commonCharacters(String firstString,String secondString){
       int length;
       firstString = firstString.toLowerCase();
       secondString = secondString.toLowerCase();
      if(firstString.length() > secondString.length()){
        length = firstString.length();
      } 		else{
         length = secondString.length();
      }
      System.out.print("Common letters :");
      for(int i = 0 ; i < length;i++){
   
       	String character= String.valueOf(secondString.charAt(i));
               if(firstString.contains(character)){              System.out.print(secondString.charAt(i)+",");
               firstString = firstString.replaceFirst(character,"");
       
     if(i == (firstString.length() -1)|| i == (secondString.length()-1)){
       break;
     }
       
         
         }
      
    }
    }

    public static void main(String[] args) {
      commonCharacters("HOUSE","computers");
    }
    
}
