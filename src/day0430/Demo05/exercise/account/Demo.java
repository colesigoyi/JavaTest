package day0430.Demo05.exercise.account;

class Demo {
    public static void main(String[] args) {
        Account myAccount = new Account();
        myAccount.accountID = "6223 1234 5678 888";
        myAccount.balance = 100000;

        myAccount.showInfo();

        myAccount.withDraw(5);
        myAccount.showInfo();

        myAccount.deposit(100000);
        myAccount.showInfo();

        Account laoDuAccount = new Account();
        laoDuAccount.withDraw(100000);
        laoDuAccount.showInfo();

        laoDuAccount.deposit(1000);
        laoDuAccount.showInfo();
    }
}
