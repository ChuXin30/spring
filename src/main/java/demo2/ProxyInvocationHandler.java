package hao.dao.demo2;
import java.lang.reflect.*;
public class ProxyInvocationHandler implements InvocationHandler{

    //被代理的接口
    private Object target;

    public void setRent(Object target){
        this.target = target;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(target , args);

        return result;
    }
}
