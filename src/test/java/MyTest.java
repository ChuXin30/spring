import dao.UserDaoImpl;
import dao.UserDaoMysqlImpl;
import dao.UserDaoOracleImpl;
import dao.UserDaoServerImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Hello;
import pojo.Student;
import pojo.User;
import service.UserService;
import service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
//       UserService userService = new UserServiceImpl();
////       UserService userService = new UserServiceS);
//        ((UserServiceImpl) userService).setUserDao(new UserDaoOracleImpl());
//       userService.getUser();
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Hello hello = (Hello) context.getBean("hello");
//        System.out.println(hello.toString());
//        UserServiceImpl userServiceImple = (UserServiceImpl) context.getBean("UserServiceImple");
//        userServiceImple.getUser();
//        User user = (User) context.getBean("user");
//        user.show();
        Student student = (Student) context.getBean("student");
        System.out.println(student.getName());
    }
}
