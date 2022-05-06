package day23.interfacetest;

/**
 * @Author Miracle Liuhui
 * @Date 2022/4/21 下午9:41
 * @Version 1.0
 */
public class ProxyTest {
    public static void main(String[] args) {
        Server server = new Server();
        ProxyServer proxyServer = new ProxyServer(server);
        proxyServer.browse();

    }

}

interface NetWork {
    void browse();
}

//被代理类
class Server implements NetWork{

    public void browse() {
        System.out.println("真实的服务器访问网络");

    }
}

//代理类
class ProxyServer implements NetWork{

    private NetWork netWork;
    public ProxyServer(NetWork netWork){
        this.netWork = netWork;
    }
    public void check(){
        System.out.println("联网之前的一些检查工作");
    }

    public void browse() {
        check();
        netWork.browse();

    }
}


