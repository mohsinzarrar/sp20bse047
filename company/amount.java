class amount{
    private int balance;
   public amount (){
        System.out.println("no arg");

    }
    public amount(int b){
        this.balance=b;

    }
    public void withdraw(int draw){
       balance=balance-draw;
        System.out.println("the amount withdraw"+balance);
    }

    public void deposit(int d) {
       balance=balance+d;
        System.out.println("the  balance deposit is"+balance);

    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }
}
class runner3{
    public static void main(String[] args) {
        amount A =new amount();
        amount A1 =new amount(9999);
        A1.setBalance(99999);
        System.out.println("current balance"+A1.getBalance());
        A.deposit(333);
        A.withdraw(888);
    }
}