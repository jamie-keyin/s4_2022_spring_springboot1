package com.keyin.time;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class TimeController {

    private static SimpleDateFormat timeFormatter = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");

    @GetMapping("/formatted_time")
    public FormattedTime getTime() {
        return new FormattedTime(timeFormatter.format(new Date()));
    }

}
