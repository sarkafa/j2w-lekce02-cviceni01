package cz.czechitas.java2webapps.lekce2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Controller
public class MainController {
    private static final Locale LOCALE = Locale.forLanguageTag("cs-CZ");
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("d. MMMM yyyy", LOCALE);

    @GetMapping("/datum")
    public ModelAndView showDatum() {

        ModelAndView result = new ModelAndView("datum");
        result.addObject("datum", LocalDate.now().format(DATE_FORMATTER));
        return result;
    }
}