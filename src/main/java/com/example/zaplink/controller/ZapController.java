package com.example.zaplink.controller;

import com.example.zaplink.dto.UserRequestDTO;
import com.example.zaplink.service.ZapService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/generate")
@Controller
@RequiredArgsConstructor
public class ZapController {

    private final ZapService  zapService;

    @GetMapping
    public ResponseEntity<String> GenerateLink(@RequestParam UserRequestDTO userRequestDTO) {

        return ResponseEntity.ok(zapService.GenerateLink(userRequestDTO));
    }
}
