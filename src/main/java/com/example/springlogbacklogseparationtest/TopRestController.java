package com.example.springlogbacklogseparationtest;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TopRestController {

    @GetMapping("first")
    public ResponseEntity<Object> first() {
        MDC.put("endpoint", "first");
        log.info("first end point.");
        MDC.clear();
        return ResponseEntity.ok("first");
    }

    @GetMapping("second")
    public ResponseEntity<Object> second() {
        MDC.put("endpoint", "second");
        log.info("second end point.");
        MDC.clear();
        return ResponseEntity.ok("second");
    }

}
