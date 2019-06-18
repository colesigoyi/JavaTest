package test.com.qf.API.ex;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-15 18:04
 * @ desc: 用户类
 **/

public class UserService {
    public User Login(String username, String password)throws MyException{
        if(!"admin".equals(username)){
            throw new MyException("用户名错误！");
        }else if (!"12345".equals(password)){
            throw new MyException("密码错误！");
        }
        return new User("admin","12345", 27, "男");
    }
}
