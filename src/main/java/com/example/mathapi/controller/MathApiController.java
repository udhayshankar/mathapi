package com.example.mathapi.controller;

import com.example.mathapi.service.MathApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MathApiController {

    @Autowired
    private MathApiService mathApiService;

    @GetMapping(value="/min")
    public Integer findMinimum(@RequestBody Integer[] integers){
        return mathApiService.findMinimum(integers);
    }
    @GetMapping(value="/max")
    public Integer findMaximum(@RequestBody Integer[] integers){
        return mathApiService.findMaximum(integers);
    }
    @GetMapping(value="/avg")
    public Double findAverage(@RequestBody Integer[] integers){
        return mathApiService.findAverage(integers);
    }
    @GetMapping(value="/median")
    public String findMedian(@RequestBody Integer[] integers){
        return mathApiService.findMedian(integers);
    }
    @GetMapping(value="/percentile/{quantifier}")
    public Double findPercentile(@RequestBody Integer[] integers, @PathVariable Integer quantifier){
        return mathApiService.findPercentile(integers,quantifier);
    }

}
