package com.example.nextnumber.controller;

import com.example.nextnumber.model.NumberResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NextNumberController {

    @GetMapping("/next")
    public NumberResponse getNextNumber(@RequestParam int number) {
        int next = number + 1;
        return new NumberResponse(next);
    }
}
