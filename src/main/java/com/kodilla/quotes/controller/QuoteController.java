package com.kodilla.quotes.controller;

import com.kodilla.quotes.model.Quote;
import com.kodilla.quotes.service.QuoteService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quote")
public class QuoteController {

    private final QuoteService quoteService;

    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @GetMapping("/random")
    public Quote getRandom() {
        return quoteService.getRandomQuote();
    }

    @GetMapping("/{quoteId}")
    public Quote getById(@PathVariable Long quoteId) {
        return quoteService.getById(quoteId);
    }
}
