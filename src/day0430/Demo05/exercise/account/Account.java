package day0430.Demo05.exercise.account;
/*
创建银行账户Account，包括：账户id，账户余额balance，创建日期dateCreate
取款方法withDraw，存款方法deposit
 */
class Account {
    String accountID;
    double balance = 0;         //余额
    double x = 0;

    public void withDraw(double money) {
        if (money > balance) {
            x -=money;
        }else {
            balance = balance - money;
        }
    }

    public void deposit(double money) {
        balance += money;
    }

    public void showInfo() {
        System.out.println("-------账户信息--------");
        System.out.println("账户ID：" + accountID);
        if (x < 0) {
            System.out.println("账户余额不足,余额为："  + balance);
        } else {
            System.out.println("账户余额：" + balance);
        }
    }
}
