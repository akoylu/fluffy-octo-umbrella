package com.example.demo.service;

import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.StringUtils;

@UtilityClass
public final class SomeService {

    public static String execute(String input) {
        return StringUtils.defaultIfBlank(input, "...");
    }
}
