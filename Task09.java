package org.umuzi;

public class Task09 { 
public static void string(String text){
  
     
     text = text.toLowerCase();
     
  for (int i = 0;i < text.length();i++){
   if (text.charAt(i)=='a' || text.charAt(i)== 'e' || text.charAt(i)== 'i' || text.charAt(i)== 'o' || text.charAt(i)== 'u'){ System.out.print(text.charAt(i) + ", ");
   }else{
     continue;
   }
  }
}

  public static void main(String[] args) {
  string("Education");
  }
}

