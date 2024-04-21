package br.com.ccs.srpringeservletfilters.api.configurations;

import br.com.ccs.srpringeservletfilters.api.filters.FilterComGenericFilterBean;
import br.com.ccs.srpringeservletfilters.api.filters.FilterComOncePerRequestFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterRegistrationBeanConfig {
    @Bean
    public FilterRegistrationBean<FilterComOncePerRequestFilter> filterRegistrationBeanOncePerRequest(FilterComOncePerRequestFilter filterComOncePerRequestFilter) {
        var filter = new FilterRegistrationBean<FilterComOncePerRequestFilter>();
        filter.setFilter(filterComOncePerRequestFilter);
        filter.addUrlPatterns("/*");
        return filter;
    }

    @Bean
    public FilterRegistrationBean<FilterComGenericFilterBean> filterRegistrationBeanGenericFilter(FilterComGenericFilterBean filterComGenericFilterBean) {
        var filter = new FilterRegistrationBean<FilterComGenericFilterBean>();
        filter.setFilter(filterComGenericFilterBean);
        filter.addUrlPatterns("/*");
        return filter;
    }
}
