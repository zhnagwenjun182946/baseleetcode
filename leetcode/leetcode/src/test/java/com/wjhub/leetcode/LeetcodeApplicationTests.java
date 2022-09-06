package com.wjhub.leetcode;

import com.wjhub.leetcode.algorithm.strategyMode.QueryGrantTypeService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StopWatch;

import javax.annotation.Resource;

@SpringBootTest
@Slf4j
class LeetcodeApplicationTests {

    @Resource
    private QueryGrantTypeService queryGrantTypeService;

    @Test
    void contextLoads() {
        final String serviceResult = queryGrantTypeService.getResult("红包");
        log.info("serviceResult is {}", serviceResult);
    }

    @Test
    public void testStopWatch() throws InterruptedException {
        StopWatch watch = new StopWatch();
        watch.start("A");
        Thread.sleep(160);
        watch.stop();
        watch.start("B");
        Thread.sleep(140);
        watch.stop();
        watch.start("C");
        Thread.sleep(200);
        watch.stop();
        watch.start("D");
        Thread.sleep(300);
        watch.stop();

        log.info(watch.prettyPrint());
    }

}
