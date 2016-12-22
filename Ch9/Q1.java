public class Q1 {

  public int stairWays(int n) {
    if (n < 0) {
      return 0;
    } else if (n == 0) {
      return 1;
    } else {
      return stairWays(n-1) + stairWays(n-2) + stairWays(n-3);
    }
  }

  public static void main(String[] args){
      Q1 q1 = new Q1();
      int result = q1.stairWays(3);
      System.out.println(result);
  }

}
