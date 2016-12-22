
public class Q2 {

  public String reverseString(String s) {
    String result = "";
    for (int i = s.length()-1; i >= 0; i--) {
      result += s.charAt(i);
    }
    System.out.println(result);
    return result;
  }

  public static void main(String[] args){
      Q2 q2 = new Q2();
      String result = q2.reverseString("tesfakj");
  }
}
