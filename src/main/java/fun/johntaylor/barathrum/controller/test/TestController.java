package fun.johntaylor.barathrum.controller.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author John Taylor
 * @date 19-11-17
 * @description 测试类
 */
@RestController
public class TestController {
    @GetMapping(value = "/api/json/test", produces = "application/json;charset=utf-8")
    public String test() {
        return "1";
    }

    @GetMapping("mono")
    public Mono<String> mono() {
        return Mono.just("hello webflux");
    }
}
