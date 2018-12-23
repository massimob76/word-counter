package wordcounter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import wordcounter.handler.Handler;

@RestController("/api/wordcounter")
public class Controller {

    @Autowired
    private Handler handler;

    @GetMapping
    public String hello() {
        return "hello";
    }



}
