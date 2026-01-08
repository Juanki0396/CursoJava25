package ud4.datastructures;

public class LinkedList {
    private LinkedList prev;
    private LinkedList next;
    private int value;

    public LinkedList(int value){
        this.value = value;
        this.prev = null;
        this.next = null;
    }

    public void setValue(int newValue){
        this.value = newValue;
    }

    public void setNext(LinkedList newNext){
        this.next = newNext;
    }

    public void setPrev(LinkedList newPrev){
        this.prev = newPrev;
    }


    public int getValue(){
        return this.value;
    }

    public LinkedList getNext(){
        return this.next;
    }

    public LinkedList getPrev(){
        return this.prev;
    }

    public void add(int value){
        LinkedList actualPosition = this;
        while(actualPosition.getNext() != null){
            actualPosition = actualPosition.getNext();
        }
        LinkedList newElement = new LinkedList(value);
        newElement.setPrev(actualPosition);
        actualPosition.setNext(newElement);
    }

    public void delete(){
        if(this.prev != null) {
            this.prev.setNext(this.next);
        }
        if(this.next != null) {
            this.next.setPrev(this.prev);
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList(0);
        for(int i = 1; i < 20; i += 2){
            list.add(i);
        }
        while(list != null){
            System.out.println(list.getValue());
            list = list.getNext();
        }
    }


}
