import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class GoogleBillboard extends PApplet {

public final static String e = "2.718281828459045235360287471352662497757247093699959574966967627724076630353547594571382178525166427427466391932003059";  

public void setup() {            
  noLoop();
  // substring up to index 11 because decimal
  // substring up to index 10 removed decimal 
}

public void draw() {   
  for (int i = 0; i < e.length() - 10; i++) {
  	String digits = removeCharAt(e, 1).substring(i, i+10);
  	// System.out.println(digits + " " + digits.length());
    double dDigits = Double.parseDouble(digits);
    if (isPrime(dDigits)) {
      System.out.println(dDigits);
      System.out.println(digits);
      return;
    }
  }
}

public boolean isPrime(double dNum) {   
  if (dNum <= 1) {
    return false;
  }
  for (int i = 2; i < Math.sqrt(dNum); i++) {
    if (dNum % i == 0) {
      return false;
    }
  }
  return true;
}

public String removeCharAt(String string, int index) {
  return string.substring(0, index) + string. substring(index + 1);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "GoogleBillboard" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
