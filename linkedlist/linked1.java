package linkedlist;

//basic .. like created a node which iwll have a data and next
public class linked1 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {

        // step 1: create a new node
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        // step 2: point the new node's next to head
        newnode.next = head;
        // step 3:update the head
        head = newnode;
    }

    public void addLast(int data) {
        // step1: create a new node
        Node nod = new Node(data);
        size++;
        if (head == null) {
            head = tail = nod;
            return;
        }
        // step 2:connect the tail node to new node
        tail.next = nod;
        // step 3:update the tail
        tail = nod;
    }

    public void print() {
        // create temp node
        Node temp = head;
        while (temp != null) {
            // print the temp data
            System.out.print(temp.data + "-->");
            // update the temp data while temp.next!=null
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addidx(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newnode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;

        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public int removefirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {

        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }
        int val = tail.data;
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        tail = prev;
        prev.next = null;
        size--;
        return val;
    }

    public int linearitrsearch(int key) {
        Node temp = head;
        int idx = 0;

        while (temp != null) {
            if (temp.data == key) {// key found
                return idx;
            } else {
                temp = temp.next;
                idx++;
            }
        }
        return -1; // key not found

    }

    public int helper(Node head, int key) {
        // base case
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);

        if (idx == -1) {
            return -1;
        }
        return idx + 1;

    }

    public int recsearch(int key) {
        return helper(head, key);
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;// in java it goes from right to left...first the value of head is stored in
                                // tail and then it is stored in curr
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;

    }

    public void removenthelefromlast(int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;

        }
        if (n == size) {
            head = head.next;
            return;
        }
        int i = 1;
        int itofind = size - n;
        Node prev = head;
        while (i < itofind) {
            prev = prev.next;
            i++;

        }
        prev.next = prev.next.next;
        return;

    }

    // Slow - Fast Approach
    public Node midele(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;// +1
            fast = fast.next.next;// +2
        }
        return slow;

    }

    public boolean llpalin() {
        // base case
        if (head == null || head.next == null) {
            return true; // ll has only 1 element

        }
        // step 1: To find the mid
        Node mid = midele(head);
        // step 2: Reverse the second half
        Node prev = null;
        Node curr = mid;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        // step 3: Check left half and right half(if they are equal)
        Node right = prev;// coz the curr is at last node becoz of us reversing the 2nd mid half
        Node left = head;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }

    public boolean detectloop() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public void removecycle() {
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }
        // find meeting point
        slow = head;
        Node prev = null;
        while (slow != fast) {
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }
        // remove the cycle and make the fast's prev.next as null
        prev.next = null;
    }

    public Node merge(Node head1, Node head2) {
        // initialize a dummy node -1
        Node mergedll = new Node(-1);
        Node temp = mergedll;
        // loop it until either if the linked list gets empty
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedll.next;

    }

    public Node mergeSort(Node head) {// tc------> O(NLOGN)
        // base case
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node slow = head;
        Node fast = head.next; // inorder to handle the even case
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node midnode = slow;
        // find left and right half
        Node righthead = midnode.next; // for braking the ll into 2 parts
        midnode.next = null; // for braking the ll into 2 parts
        Node newleft = mergeSort(head);
        Node newright = mergeSort(righthead);
        // merge
        return merge(newleft, newright);

    }

    public void Zigzag() {
        // find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        // reverse the 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // as at the top we iterate till current is not equal to null,when current
        // becomes null the last element would ne the previous
        Node left = head;
        Node right = prev;
        Node nextL, nextR;
        // alternate merging
        while (left != null && right != null) {
            // convert
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            // update
            left = nextL;
            right = nextR;

        }

    }

    public static void main(String[] args) {
        linked1 ll = new linked1();
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(9);
        ll.addFirst(4);
        ll.addFirst(7);
        ll.addLast(5);
        ll.addLast(3);
        ll.addLast(4);
        ll.addFirst(11);
        ll.addidx(3, 6);
        ll.print();
        System.out.println(ll.size);
        // ll.removefirst();
        ll.print();
        // ll.removeLast();
        ll.print();
        int q = ll.linearitrsearch(3);
        System.out.println(q);
        System.out.println(ll.recsearch(0));
        ll.reverse();
        ll.print();
        // ll.removenthelefromlast(3);
        ll.print();
        System.out.println(ll.llpalin());
        System.out.println(ll.detectloop());
        ll.head = ll.mergeSort(ll.head);
        ll.print();
        ll.Zigzag();
        ll.print();

    }
}
