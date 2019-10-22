package com.example.zadania1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class Endpoint {

    @GetMapping("rev/{input}")
    public ResponseEntity<String> revert(@PathVariable String input)  {
        String result = new StringBuilder(input).reverse().toString();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
