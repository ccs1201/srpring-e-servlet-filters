package br.com.ccs.srpringeservletfilters.api.filters;

import jakarta.servlet.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Slf4j
public class FilterComponent implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        log.info("\nPassou no -> ".concat(this.getClass().getSimpleName()));

        chain.doFilter(request, response);
    }
}
