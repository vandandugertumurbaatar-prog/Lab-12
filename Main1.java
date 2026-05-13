public class Main1 {
    public static void main(String[] args) {
        Bank b1 = Bank.getInstance(101, "Bat", 5000, "MNT", 1000, 500);
        
        Bank b2 = Bank.getInstance(999, "Bold", 0, "USD", 0, 0);

        System.out.println("First call owner: " + b1.getOwnerName());
        System.out.println("Second call owner: " + b2.getOwnerName());
    }
}
