package com.example.hashingapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.example.hashingapi.utils.HashFunctions.*;

@SpringBootApplication
public class HashingApiApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HashingApiApplication.class, args);
        String input = "Hello, World!";

        // SHA-256
        System.out.println("SHA-256 hash: " + sha256(input));

        // HMAC-SHA256 (example key: "mysecretkey")
        String hmacKey = "mysecretkey";
        System.out.println("HMAC-SHA256 hash: " + hmacSha256(hmacKey, input));

        // MD5
        System.out.println("MD5 hash: " + md5(input));

        // SHA-1
        System.out.println("SHA-1 hash: " + sha1(input));
    }

}
