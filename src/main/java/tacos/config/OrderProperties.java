package tacos.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="taco.orders")
@Data
public class OrderProperties {
    private int pageSize = 20;
}
