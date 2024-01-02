package com.dev.quickstart.services.impl;

import com.dev.quickstart.services.BluePrinter;
import org.springframework.stereotype.Component;

@Component
public class EngishBluePrinter implements BluePrinter {

    @Override
    public String print() {
        return "blue";
    }
}
