package aoc.puzle2;

public class ID {
    private final String id;

    public ID(String id){
        this.id = id;
    }

    public ID(long id){
        this.id = String.valueOf(id);
    }

    public boolean isValid(){
        if(this.id.length() % 2 != 0){
            return true;
        }
        int midPoint = this.id.length() / 2;
        String sub1 = this.id.substring(0, midPoint);
        String sub2 = this.id.substring(midPoint);
        return !sub1.equals(sub2);
    }
    
    public static void main(String[] args) {
        ID a = new ID(232);
        boolean correctAnswer = true;
        if(a.isValid()  == correctAnswer){
            System.out.println("isValid is working as expected");
        }
        else{
            System.out.println("isValid is not working as expected");
        }
    }
}
