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
    }

    public void remove(int index){
        // Removes the item placed at index
    }

    public MyLinkedList itemAt(int index){
        // Returns Item at index
    }

    public static void main(String[] args){
        MyLinkedList mll = new MyLinkedList("hello");
        mll.add("stack");
        mll.print();

    }
}