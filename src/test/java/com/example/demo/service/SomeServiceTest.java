package com.example.demo.service;


import lombok.var;
import org.junit.Assert;
import org.junit.Test;

public class SomeServiceTest {

    @Test
    public void whenExecuteWithEmpty() {
        var execute = SomeService.execute("");

        Assert.assertEquals("...", execute);
    }
}