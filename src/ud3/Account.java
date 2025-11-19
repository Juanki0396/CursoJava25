package ud3;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }
    
    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getBalance(){
        return this.balance;
    }

    public int credit(int amount){
        this.balance += amount;
        return this.balance;
    }

    public int debit(int amount){
        if(amount <= this.balance){
            this.balance -= amount;
        }
        else{
            System.out.println("Amount excedeed balance");
        }
        return this.balance;
    }

    public int transferTo(Account another, int amount){
        if(amount <= this.balance){
            another.credit(amount);
            this.balance -= amount;
        }
        else{
            System.out.println("Amount excedeed balance");
        }
        return this.balance;
    }

    public String toString(){
        String s = "Account[id=" + this.id + ",name=" + this.name + ",balance=" + this.balance + "]";
        return s;
    }

    public static void main(String[] args) {
        // Test constructor and toString()
      Account a1 = new Account("A101", "Tan Ah Teck", 88);
      System.out.println(a1);  // toString();
      Account a2 = new Account("A102", "Kumar"); // default balance
      System.out.println(a2);

      // Test Getters
      System.out.println("ID: " + a1.getID());
      System.out.println("Name: " + a1.getName());
      System.out.println("Balance: " + a1.getBalance());

      // Test credit() and debit()
      a1.credit(100);
      System.out.println(a1);
      a1.debit(50);
      System.out.println(a1);
      a1.debit(500);  // debit() error
      System.out.println(a1);

      // Test transfer()
      a1.transferTo(a2, 100);  // toString()
      System.out.println(a1);
      System.out.println(a2);
    }



}
