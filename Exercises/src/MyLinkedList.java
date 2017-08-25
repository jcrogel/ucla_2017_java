public class MyLinkedList {
    MyLinkedList next;
    String word;

    public MyLinkedList(String new_word){
        this.word = new_word;
    }

    public void add(String new_word){
        MyLinkedList inst = this;
        while (inst.next != null){
            inst = inst.next;
        }

        inst.next = new MyLinkedList(new_word);

    }

    public void print(){
        MyLinkedList inst = this;
        while (inst != null) {
            System.out.println(inst.word);
            inst = inst.next;
        }
    }

    public int length (){
        // Returns how many items are on the linked list
        int counter = 0;
        MyLinkedList linked_list_element = this;
        while (linked_list_element != null) {
            counter++;
            linked_list_element = linked_list_element.next;
        }

        return counter;
    }

    public void remove(int index){
        // Removes the item placed at index
        int counter = 0;
        MyLinkedList linked_list_element = this;
        MyLinkedList previous_list_element = null;
        while (linked_list_element != null) {

            if (index == counter) {
                previous_list_element.next = linked_list_element.next;
            }

            counter++;
            previous_list_element = linked_list_element;
            linked_list_element = linked_list_element.next;

        }

    }

    public MyLinkedList itemAt(int index){
        // Returns Item at index
        int counter = 0;
        MyLinkedList linked_list_element = this;
        while (linked_list_element != null) {

            if (index == counter) {
                return linked_list_element;
            }

            counter++;
            linked_list_element = linked_list_element.next;
        }

        return null;
    }

    public static void main(String[] args){
        MyLinkedList mll = new MyLinkedList("hello");
        mll.add("stack");
        mll.add("computer");
        mll.add("exchange");
        mll.print();
        System.out.println("Linked list length:" + mll.length());
        System.out.println("Linked item at 2:" + mll.itemAt(2).word);
        System.out.println("======================================" );
        mll.remove(2);
        mll.print();

    }
}