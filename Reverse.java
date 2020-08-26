package Reverse;
import java.io.File;
import java.io.PrintStream;


public class Reverse {

    
    public static void main(String[] args) throws Exception {
        ps.println("String is: "+str);
      ps.print("String in reverse is: ");
      stringReverser(str,ps);
      
       
    }
}
    public static void stringReverser (String str,PrintStream ps) {
      
if ((str.isEmpty())||(str.length() <= 1)) 
           ps.print(str); 
        else
        { 
            ps.print(str.charAt(str.length()-1)); 
            stringReverser(str.substring(0,str.length()-1),ps); 
        } 
}
    
}
