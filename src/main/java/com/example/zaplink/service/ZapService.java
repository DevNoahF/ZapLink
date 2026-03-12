package com.example.zaplink.service;

import com.example.zaplink.dto.UserRequestDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@Service
@Slf4j
public class ZapService {

    public String GenerateLink(UserRequestDTO userRequestDTO) {

        log.info("Generating link for user");

        String encodeMessage = URLEncoder.encode (userRequestDTO.message(), StandardCharsets.UTF_8);
        log.info("link generated {}", encodeMessage);

        return "https://wa.me/+55" + userRequestDTO.ddd() + userRequestDTO.phoneNumber() + "?text=" + encodeMessage;




    }
}
