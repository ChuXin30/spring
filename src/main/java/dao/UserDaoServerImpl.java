package dao;

public class UserDaoServerImpl implements UserDao{

    @Override
    public void getUser() {
        System.out.println("server的数据");
    }
}
