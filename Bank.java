public class Bank {
    private static Bank single_instance = null;

    private int accNo;
    private String ownerName;
    private int balance;
    private String currency;
    private int deposit;
    private int withDraw;

    private Bank(int nomer, String name, int bal, String curr, int dep, int with) {
        this.accNo = nomer;
        this.ownerName = name;
        this.balance = bal;
        this.currency = curr;
        this.deposit = dep;
        this.withDraw = with;
    }

    public static synchronized Bank getInstance(int nomer, String name, int bal, String curr, int dep, int with) {
        if (single_instance == null) {
            single_instance = new Bank(nomer, name, bal, curr, dep, with);
        }
        return single_instance;
    }

    public int getAccNo() { 
        return accNo; 
    }

    public String getOwnerName() { 
        return ownerName; 
    }
    
    public void setOwnerName(String name) { 
        this.ownerName = name; 
    }

    public String getCurrency() { 
        return currency; 
    }

    public int getBalance() { 
        return balance + deposit - withDraw; 
    }
}