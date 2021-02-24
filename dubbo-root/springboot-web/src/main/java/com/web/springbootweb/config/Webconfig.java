package com.web.springbootweb.config;

        import com.web.springbootweb.filter.MyFilter;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.web.servlet.FilterRegistrationBean;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.Configuration;

/**
 * @Author LiuYang
 * @Date 2021/2/23 14:52
 */
@Configuration
public class Webconfig {

    @Autowired
    private MyFilter myFilter;

    @Bean
    public FilterRegistrationBean initFilter() {

        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();

        filterRegistrationBean.setFilter(myFilter);

        filterRegistrationBean.setName("myFilter");

        filterRegistrationBean.addUrlPatterns("/*");

        return filterRegistrationBean;

    }
}
