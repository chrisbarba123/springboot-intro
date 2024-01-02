package com.dev.quickstart.config;

import com.dev.quickstart.services.BluePrinter;
import com.dev.quickstart.services.ColourPrinter;
import com.dev.quickstart.services.GreenPrinter;
import com.dev.quickstart.services.RedPrinter;
import com.dev.quickstart.services.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

    @Bean
    public BluePrinter bluePrinter() {
        return new EngishBluePrinter();
    }

    @Bean
    public RedPrinter redPrinter() {
        return new EnglishRedPrinter();
    }

    @Bean
    public GreenPrinter greenPrinter() {
        return new EnglishGreenPrinter();
    }

    @Bean
    public ColourPrinter colourPrinter(BluePrinter bluePrinter, RedPrinter redPrinter, GreenPrinter greenPrinter) {
        return new ColourPrinterImpl(redPrinter, greenPrinter, bluePrinter);
    }
}
