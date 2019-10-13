package com.stackroute.ApiInterfaceServices.config;


import com.stackroute.ApiInterfaceServices.ErrorFilter;
import com.stackroute.ApiInterfaceServices.PostFilter;
import com.stackroute.ApiInterfaceServices.PreFilter;
import com.stackroute.ApiInterfaceServices.RouteFilter;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {


    @Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }
    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }
    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }
    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }



}
