import java.util.HashSet;

public class Q1 {

  public boolean uniqueCharacters(String s) {
    HashSet<Character> set = new HashSet<Character>();
    for (int i = 0; i < s.length(); i++) {
      if (set.contains(s.charAt(i))) {
        System.out.println("False");
        return false;
      } else {
        set.add(s.charAt(i));
      }
    }

    System.out.println("True");
    return true;
  }

  public static void main(String[] args){
      Q1 q1 = new Q1();
      boolean result = q1.uniqueCharacters("test");
  }

}
