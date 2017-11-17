package com.cxy890.music.controller;

import com.cxy890.music.model.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@EnableScheduling
public class HomeController {

    @GetMapping("/start")
    public CommonResult index() {

        return CommonResult.build("success");
    }

    @Scheduled(cron = "0 0 0 0 ? *")
    public void runP() {

    }

}
