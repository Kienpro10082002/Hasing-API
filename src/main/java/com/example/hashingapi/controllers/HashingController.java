package com.example.hashingapi.controllers;

import com.example.hashingapi.utils.HashFunctions;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hashing")
public class HashingController {

    @PostMapping("/sha256")
    public String hashSHA256(@RequestParam String input) {
        try {
            return HashFunctions.sha256(input);
        } catch (Exception e) {
            e.printStackTrace();
            return "Error occurred while hashing input.";
        }
    }

    @PostMapping("/hmacSha256")
    public String hashHMACSHA256(@RequestParam String key, @RequestParam String data) {
        try {
            return HashFunctions.hmacSha256(key, data);
        } catch (Exception e) {
            e.printStackTrace();
            return "Error occurred while hashing input.";
        }
    }

    @PostMapping("/md5")
    public String hashMD5(@RequestParam String input) {
        try {
            return HashFunctions.md5(input);
        } catch (Exception e) {
            e.printStackTrace();
            return "Error occurred while hashing input.";
        }
    }

    @PostMapping("/sha1")
    public String hashSHA1(@RequestParam String input) {
        try {
            return HashFunctions.sha1(input);
        } catch (Exception e) {
            e.printStackTrace();
            return "Error occurred while hashing input.";
        }
    }
}