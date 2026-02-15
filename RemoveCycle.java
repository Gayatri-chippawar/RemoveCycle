package Linked_List;

public class RemoveCycle {
        public static class Node{
            int data;
            Node next;

            Node(int data){
                this.data = data;
                this.next = null;
            }
        }
        public static Node head;
        public static Node tail;
        public static int size;


        public void getRemoveCycle(){
            //step 1 : detect cycle
            Node slow = head;
            Node fast = head;
            boolean cycle = false;

            while (fast!=null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;

                if(slow == fast) {
                    cycle = true;
                    break;
                }
            }
            if(!cycle){
                return;
            }
            //step 2 find meeting pt
                slow = head;
                Node prev = null;
                while (slow!=fast) {
                    slow = slow.next;
                    prev = fast;
                    fast = fast.next;
                }
                //step 3
                prev.next = null;
        }

    public boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while (fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }

        public static void main(String[] args) {
            RemoveCycle ll = new RemoveCycle();
            //cycle ll
            head = new Node(1);
            Node temp = new Node(2);
            head.next = temp;
            head.next.next = new Node(3);
            head.next.next.next = temp;
            //1-2-3-1
            System.out.println("Before removing cycle : "+ll.isCycle());
            ll.getRemoveCycle();
            System.out.println("After: "+ll.isCycle());

        }
    }
