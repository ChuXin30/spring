package hao.dao.demo1;

public class UserServiceImpl implements UserService{

    @Override
    public void add() {
        System.out.println("add user");
    }

    @Override
    public void dalete() {
        System.out.println("delete user");
    }

    @Override
    public void update() {
        System.out.println("update user");
    }

    @Override
    public void query() {
        System.out.println("query user");
    }
}
