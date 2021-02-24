package com.web.springbootweb.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;


/**
 * @Component （把普通pojo实例化到spring容器中，相当于配置文件中的 ）
 * 泛指各种组件，就是说当我们的类不属于各种归类的时候（不属于@Controller、@Services等的时候），我们就可以使用@Component来标注这个类。
 **/


/**
 * @Author LiuYang
 * @Date 2021/2/23 14:47
 */

@Component
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        System.out.println("MyFilter init.......");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("MyFilter doFilter.......");
        //决定是否放行
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("MyFilter destroy.......");

    }
}
