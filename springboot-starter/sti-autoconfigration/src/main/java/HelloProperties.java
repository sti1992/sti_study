import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @version 1.0
 * @Author sti
 * @Date 2022/04/03 20:02
 */
@ConfigurationProperties(prefix = "sti.hello")
public class HelloProperties {
    //前缀
    private String prefix;
    //后缀
    private String suffix;
    public String getPrefix() {
        return prefix;
    }
    public void setPrefix(String prefix){
        this.prefix = prefix;
    }
    public String getSuffix() {
        return suffix;
    }
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
