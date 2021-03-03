package zhuJieDemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 517
 * @date 2021-03-03 - 11:36
 */

@Configuration//说明该类为配置类
@ComponentScan(basePackages = "zhuJieDemo")//指定扫描包的路径
public class springConf {

}
