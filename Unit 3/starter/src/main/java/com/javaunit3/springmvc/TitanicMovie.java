package com.javaunit3.springmvc;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TitanicMovie implements Movie {
    public String getTitle() {
        return "Titanic";
    }

    public String getMaturityRating() {
        return "PG-13";
    }

    public String getGenre() {
        return "Romance";
    }
}
