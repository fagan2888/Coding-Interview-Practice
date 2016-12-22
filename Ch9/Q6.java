public class Q6 {

  public void printParentheses(int n, String s) {
    int numLeft = s.length() - s.replace("(", "").length();
    int numRight = s.length() - s.replace(")", "").length();

    if (numLeft == n && numRight == n) {
      System.out.println(s);
    } else if (s.length() == 0){
      printParentheses(n, s+"(");
    } else if (numLeft == n) {
      printParentheses(n, s + ")");
    } else {
      if (s.charAt(s.length()-1) == '(') {
        printParentheses(n, s+")");
      }
      printParentheses(n, s+"(");
    }
  }

  public static void main(String[] args){
      Q6 q6 = new Q6();
      q6.printParentheses(3, "");
  }
}
