package com.dev.quickstart.services.impl;

import com.dev.quickstart.services.GreenPrinter;

public class EnglishGreenPrinter implements GreenPrinter {
    @Override
    public String print() {
        return "green";
    }
}
