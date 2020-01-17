import java.lang.reflect.Array;

public class DEQueue<type> {
    private class Node{
        type value;
        Node prev;
        Node next;

        Node(Node prev, type value, Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int count;

    public DEQueue(type[] arr){
        head = null;
        count = 0;
        Node node;
        for (int i = 0; i < arr.length; i++){
            node = new Node(tail, arr[i], null);
            if (i == 0){
                head = node;
                tail = node;
            }
            else{
                tail.next = node;
                tail = node;
            }
            count++;
        }
    }

    public DEQueue(){
        count = 0;
    }

    public type front(){
        try{
            return(head.value);
        }
        catch(NullPointerException ex){
            return null;
        }
    }

    public type back(){
        try{
            return(tail.value);
        }
        catch(NullPointerException ex){
            return null;
        }
    }

    public void pushFront(type value) {
        Node node = new Node(null, value, head);
        if (count == 0){
            tail = node;
        }
        else{
            head.prev = node;
        }
        head = node;
        count++;
    }

    public void pushBack(type value){
        Node node = new Node(tail, value, null);
        if (count == 0){
            head = node;
        }
        else{
            tail.next = node;
        }
        tail = node;
        count++;
    }

    public String toString(){
        Node node = head;
        String ret = "";
        if (node != null){
            while (node.next != null) {
                ret += node.value;
                ret += ", ";
                node = node.next;
            }
            ret += node.value;
        }
        return ret;
    }

    public type popBack(){
        type val = null;
        if (count > 0){
            val = tail.value;
            tail = tail.prev;
            tail.next = null;
            count--;
        }
        else{
            throw new NullPointerException("Попытка извлечения элемента из пустой очереди");
        }
        return val;
    }

    public type popFront(){
        type val = null;
        if (count > 0){
            val = head.value;
            head = head.next;
            head.prev = null;
            count--;
        }
        else{
            throw new NullPointerException("Попытка извлечения элемента из пустой очереди");
        }
        return val;
    }

    public int size(){
        return count;
    }

    public void clear(){
        head = null;
        tail = null;
        count = 0;
    }

    public type[] toArray(Class<type> clazz){
        type[] arr = (type[]) Array.newInstance(clazz, count);
        Node node = head;
        int i = 0;
        if (node != null){
            while (node.next != null) {
                arr[i] = node.value;
                node = node.next;
                i++;
            }
            arr[count-1] = node.value;
        }
        return arr;
    }
}
