package day0501.Demo.exercise.atm;
/*
ATM机类
属性：银行账户
行为：存钱，取钱，查余额
 */
public class ATM {
    Account bankAccount;        //银行账户

    //从ATM机上取款
    public void withdraw( double money ) {
        //先判断一下有没有银行账户
        if(bankAccount == null) {
            //抛出异常
            System.out.println("先插入银行卡或输入银行账户");
            return;
        }

        //从ATM机上取款，实际上是从银行账户取款，也就是减少银行账户上的余额
        bankAccount.withDraw(money);
    }
    //从ATM机上存款
    public void deposit( double money ) {
        //从ATM机上取款，实际上是从银行账户存款，也就是增加银行账户上的余额
        bankAccount.deposit(money);
    }

    public void showBalance() {
        if(bankAccount == null) {
            //抛出异常
            System.out.println("先插入银行卡或输入银行账户");
            return;
        }
        //调用查询信息方法
        bankAccount.showInfo();
    }
}
