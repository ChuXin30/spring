package hao.dao.demo1;

import hao.dao.demo2.Host;

public class Client {
    public static void main(String[] args) {
//        Host host = new Host();
//
//        Proxy proxy = new Proxy(host);
//        proxy.rent();

        UserServiceImpl userService = new UserServiceImpl();
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        proxyInvocationHandler.setRent(userService);
        UserService proxy = (UserService) proxyInvocationHandler.getProxy();
        proxy.add();

    }
}
