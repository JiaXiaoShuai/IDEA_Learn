package innerclass03;
import innerclass.Son1;
public class TestSingleLinked {
    private Node first;

    static private class Node {
        Object data;
        Node next;

        Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void add(Object element) {
        Node newNode = new Node(element, null);
        if (first == null) {
            first = newNode;
            return;
        }

        Node node = first;
        while(node.next !=null){
            node = node.next;
        }
        node.next = newNode;
    }

}
