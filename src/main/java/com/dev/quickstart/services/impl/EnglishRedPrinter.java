package com.dev.quickstart.services.impl;

import com.dev.quickstart.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishRedPrinter implements RedPrinter {
    public String print() {
        return "red";
    }
}
