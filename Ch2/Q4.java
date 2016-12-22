public class Q4 {

  public static class Node<Integer> {
    public int data;
    public Node<Integer> next;

    public Node(int data, Node<Integer> next) {
      this.data = data;
      this.next = next;
    }
  }

  public Node<Integer> partitionList(int x, Node<Integer> head) {
    if (head == null || head.next == null) {
      System.out.println("Head or next null");
      return head;
    }

    Node<Integer> current = head;
    while (current.next != null) {
      if (current.next.data < x) {
        Node<Integer> moveNode = current.next;
        current.next = current.next.next;
        moveNode.next = head;
        head = moveNode;
      } else {
        current = current.next;
      }
    }
    return head;
  }

  public static void main(String[] args){
      Q4 q4 = new Q4();
      int x = 3;
      Node<Integer> head = new Node<Integer>(1, null);
      head = new Node<Integer>(5, head);
      head = new Node<Integer>(3, head);
      head = new Node<Integer>(4, head);
      head = new Node<Integer>(7, head);
      head = new Node<Integer>(10, head);
      head = new Node<Integer>(2, head);
      Node<Integer> result = q4.partitionList(x, head);
      while (result != null) {
        System.out.print(result.data);
        System.out.print("->");
        if (result.next == null) {
          System.out.println("null");
        }
        result = result.next;
      }
  }
}
