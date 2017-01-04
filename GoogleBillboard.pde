public final static String e = "2.718281828459045235360287471352662497757247093699959574966967627724076630353547594571382178525166427427466391932003059";  

public void setup() {            
  noLoop();
  // substring up to index 11 because decimal
}

public void draw() {   
  String digits = removeCharAt(e, 1);
  for (int i = 0; i < e.length(); i++) {
    double dDigits = Double.parseDouble(digits);
    if (isPrime(dDigits)) {
      System.out.println(dDigits);
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