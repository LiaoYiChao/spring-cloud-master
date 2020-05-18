package study.springcloud.Config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/*
 * @author: Liao
 * @date  2020/5/10 20:31
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate getTemplate() {
        return new RestTemplate();
    }

}
