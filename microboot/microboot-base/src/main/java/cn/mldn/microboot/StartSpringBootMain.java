package cn.mldn.microboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Administrator on 2018/4/17.
 */
//@EnableAutoConfiguration + @ComponentScan("cn.mldn.microboot") 等价于 @SpringBootApplication
@SpringBootApplication  //启动springboot程序，自带子包扫描
public class StartSpringBootMain {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(StartSpringBootMain.class, args);
    }
}
