public class ListNode01 {
    public int data; // data stored in this node
    public ListNode01 next; // link to next node in the list

    // post: constructs a node with data 0 and null link
    public ListNode01() {
        this(0, null);
    }

     // post: constructs a node with given data and null link
    public ListNode01(int data) {
        this(data, null);
    }

    // post: constructs a node with given data and given link
    public ListNode01(int data, ListNode01 next) {
        this.data = data;
        this.next = next;
    }
}