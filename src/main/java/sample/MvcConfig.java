/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

/**
 *
 * @author Administrator
 */
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//import com.vdenotaris.spring.boot.security.saml.web.core.CurrentUserHandlerMethodArgumentResolver;
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

//    @Autowired
//    CurrentUserHandlerMethodArgumentResolver currentUserHandlerMethodArgumentResolver;
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/resources/static/css/**").addResourceLocations("/resources/static/css/");
//        registry.addResourceHandler("/resources/static/js/**").addResourceLocations("/resources/static/js/");
//        registry.addResourceHandler("/resources/static/fonts/**").addResourceLocations("/resources/static/fonts/");
//        registry.addResourceHandler("/resources/static/static/js/**").addResourceLocations("/resources/static/static/js/");
//registry.addResourceHandler("/css/**").addResourceLocations("../css/");
//registry.addResourceHandler("/js/**").addResourceLocations("/resources/js/");
registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }
   

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
       
        registry.addViewController("/success").setViewName("success");
        registry.addViewController("/chat").setViewName("chat");
        registry.addViewController("/quan-ly-cong-vec").setViewName("quan-ly-cong-vec");
        registry.addViewController("/error").setViewName("error");
    }

//    @Override
//    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers){
//    	argumentResolvers.add(currentUserHandlerMethodArgumentResolver);
//    }
}
