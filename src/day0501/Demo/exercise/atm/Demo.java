package day0501.Demo.exercise.atm;

class Demo {
    public static void main(String[] args) {
        //先有银行账户对象
        Account myAccount = new Account();
        myAccount.accountID = "6223 1234 5678 888";
        myAccount.balance = 100000;

        //先找一台ATM
        ATM atm = new ATM();
        //需要在ATM机上输入账户，要么插入一张卡
        atm.bankAccount = myAccount;

        atm.showBalance();
        atm.deposit(5000);
        atm.withdraw(10000);
        atm.showBalance();

        ATM abcAtm = new ATM();
        abcAtm.withdraw(10000); //产生一个空指针异常
    }
}
