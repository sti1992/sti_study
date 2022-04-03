/**
 * @version 1.0
 * @Author sti
 * @Date 2022/04/03 20:28
 */
public class HelloService {
       HelloProperties helloProperties;
       public HelloProperties getHelloProperties() {
           return helloProperties;
       }
       public void setHelloProperties(HelloProperties helloProperties) {
           this.helloProperties = helloProperties;
       }
       public String sayHello(String name) {
           return helloProperties.getPrefix() + "-" + name + helloProperties.getSuffix();
       }
}
