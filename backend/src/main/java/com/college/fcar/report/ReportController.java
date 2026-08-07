package com.college.fcar.report;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/report")
public class ReportController {
    @GetMapping("/{subject}")
    ResponseEntity<ReportDto> getReport(@PathVariable String subject) {
        System.out.println(subject);
        return ResponseEntity.ok(new ReportDto());
    }
}
