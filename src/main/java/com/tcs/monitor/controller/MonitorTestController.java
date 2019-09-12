package com.tcs.monitor.controller;

import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class MonitorTestController {
	
	@Timed(
            value = "tcs.monitoring.test.1",
            histogram = true,
            percentiles = {0.95, 0.99},
            extraTags = {"version", "1.0"}
    )
    @GetMapping("/test")
    public String test() {
        return "Hello! End Point 1";
    }

    @Timed(
            value = "tcs.monitoring.test.2",
            histogram = true,
            percentiles = {0.95, 0.99},
            extraTags = {"version", "2.0"}
    )
    @GetMapping("/test2")
    public String test2() {
        return "Hello! End Point 2";
    }
    
    @Timed(
            value = "tcs.monitoring.test.3",
            histogram = true,
            percentiles = {0.95, 0.99},
            extraTags = {"version", "3.0"}
    )
    @GetMapping("/test3")
    public String test3() {
        return "Hello! End Point 3";
    }
    
    @Timed(
            value = "tcs.monitoring.test.4",
            histogram = true,
            percentiles = {0.95, 0.99},
            extraTags = {"version", "4.0"}
    )
    @GetMapping("/test4")
    public String test4() {
        return "Hello! End Point 4";
    }
	

}
