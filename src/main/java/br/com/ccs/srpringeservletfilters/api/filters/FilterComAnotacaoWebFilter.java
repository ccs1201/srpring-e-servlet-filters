package br.com.ccs.srpringeservletfilters.api.filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@WebFilter(value = "/*")
@Slf4j
public class FilterComAnotacaoWebFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        var httpRequest = (HttpServletRequest) request;

        logarRequisicao(httpRequest);

        chain.doFilter(request, response);
    }

    private void logarRequisicao(HttpServletRequest httpRequest) {
        log.info("\nPassou no - > " + this.getClass().getSimpleName()
                .concat("\nContentType -> ").concat(httpRequest.getContentType())
                .concat("\nURI Soliticidata -> " + httpRequest.getRequestURI())
                .concat("\nParameters: ")
                .concat(getParameters(httpRequest)));
    }

    private static String getParameters(HttpServletRequest request) {
        StringBuilder strLogParameters = new StringBuilder();

        request.getParameterNames().asIterator().forEachRemaining(parameterName -> {
            String parameterValue = request.getParameter(parameterName);
            strLogParameters.append("\nparameter -> ").append(parameterName).append(" value -> ").append(parameterValue);
        });

        return strLogParameters.toString();
    }
}
