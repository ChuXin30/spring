package hao.dao.demo1;

public class UserServiceProxy implements UserService{

    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;

    }

    @Override
    public void add() {
        userService.add();
    }

    @Override
    public void dalete() {
        userService.dalete();
    }

    @Override
    public void update() {
        userService.update();
    }

    @Override
    public void query() {
        userService.query();
    }

    public void log(String msg){
        System.out.println(msg);
    }
}
