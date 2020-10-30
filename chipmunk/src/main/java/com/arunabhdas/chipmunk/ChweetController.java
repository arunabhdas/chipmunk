package com.arunabhdas.chipmunk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ChweetController {
    private static final String template = "Welcome, %s";
    private static AtomicLong counter = new AtomicLong();

    @GetMapping("/chweet")
    public Chweet chweet(@RequestParam(value = "name", defaultValue="chipmunk") String name) {
        return new Chweet(counter.incrementAndGet(), String.format(template, name));
    }
}
