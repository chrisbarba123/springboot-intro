package com.dev.quickstart;


import com.dev.quickstart.services.ColourPrinter;
import com.dev.quickstart.services.impl.ColourPrinterImpl;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class QuickstartApplication implements CommandLineRunner {

	private ColourPrinter colourPrinter;

	public QuickstartApplication(ColourPrinter colourPrinter) {
		this.colourPrinter = colourPrinter;
	}

	public static void main(String[] args) {
		SpringApplication.run(QuickstartApplication.class, args);
	}

	@Override
	public void run(final String... args) {
		log.info(colourPrinter.print());
	}

}
