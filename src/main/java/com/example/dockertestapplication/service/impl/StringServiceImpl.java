package com.example.dockertestapplication.service.impl;

import com.example.dockertestapplication.service.StringService;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class StringServiceImpl implements StringService {

    public String getRandomString(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = RANDOM.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(index));
        }
        return sb.toString();
    }

    private static final String CHARACTERS =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final Random RANDOM = new Random();

}
