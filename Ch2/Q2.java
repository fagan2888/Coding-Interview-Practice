public class Q2 {

  public static class Node<Integer> {
    public int data;
    public Node<Integer> next;

    public Node(int data, Node<Integer> next) {
      this.data = data;
      this.next = next;
    }
  }

  public int kthToLast(int k, Node<Integer> head) {
    if (k < 1) {
      System.out.println("Choose k greater than 0");
      return -1;
    }

    Node<Integer> current = head;
    for (int i = 0; i < k; i++) {
      if(current != null) {
        current = current.next;
      } else {
        System.out.println("Linked list too small");
        return -1;
      }
    }
    Node<Integer> result = head;
    while (current != null) {
      current = current.next;
      result = result.next;
    }
    System.out.println(result.data);
    return result.data;
  }

  public static void main(String[] args){
      Q2 q2 = new Q2();
      int k = 3;
      Node<Integer> head = new Node<Integer>(1, null);
      head = new Node<Integer>(2, head);
      head = new Node<Integer>(3, head);
      head = new Node<Integer>(4, head);
      head = new Node<Integer>(5, head);
      head = new Node<Integer>(6, head);
      int result = q2.kthToLast(k, head);
  }
}
