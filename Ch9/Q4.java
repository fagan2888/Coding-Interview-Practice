import java.util.HashSet;

public class Q4 {

  public HashSet<HashSet<Integer>> createSets(HashSet<Integer> rem, HashSet<Integer> curr) {
    HashSet<HashSet<Integer>> result = new HashSet<HashSet<Integer>>();
    result.add(curr);
    if (rem.size() != 0) {
      for (Integer element : rem) {
        HashSet<Integer> cloneRem = new HashSet<Integer>(rem);
        cloneRem.remove(element);
        HashSet<Integer> cloneCurr = new HashSet<Integer>(curr);
        cloneCurr.add(element);

        result.addAll(createSets(cloneRem, cloneCurr));
      }
    }
    return result;
  }

  public static void main(String[] args){
      Q4 q4 = new Q4();
      HashSet<Integer> set = new HashSet<Integer>();
      set.add(1);
      set.add(2);
      set.add(3);
      HashSet<HashSet<Integer>> sets = q4.createSets(set, new HashSet<Integer>());
      System.out.println(sets);
  }
}
