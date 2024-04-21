package br.com.ccs.srpringeservletfilters;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SrpringEServletFiltersApplication {

    public static void main(String[] args) {
        SpringApplication.run(SrpringEServletFiltersApplication.class, args);
    }

}
