package ru.neoflex.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController
{
    @GetMapping("/{a}+{b}")
    public Integer plus(@PathVariable Integer a, @PathVariable Integer b)
    {
        return a+b;
    }

    @GetMapping("/{a}-{b}")
    public Integer minus(@PathVariable Integer a, @PathVariable Integer b)
    {
        return a-b;
    }

    @GetMapping("{a}x{b}")
    public Integer multiply(@PathVariable Integer a, @PathVariable Integer b)
    {
        return a*b;
    }

    @GetMapping("{a}:{b}")
    public Integer division(@PathVariable Integer a, @PathVariable Integer b)
    {
        return a/b;
    }
}
