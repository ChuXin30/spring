package hao.dao.demo1;

import hao.dao.demo2.Host;
import hao.dao.demo2.Rent;

public class Proxy implements Rent {
    private Host host;
    public Proxy(){

    }
    public Proxy(Host host){
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        fare();
    }

    public void seeHouse(){
        System.out.println("see house");
    }
    public void fare(){
        System.out.println("fare house");
    }
}
