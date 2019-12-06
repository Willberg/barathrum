package fun.johntaylor.barathrum.controller.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

/**
 * @author John Taylor
 * @date 19-11-18
 * @description 用户相关操作
 */
@RestController
public class UserController {
    @PostMapping(value = "/auth/v1/user/login", produces = "application/json;charset=utf-8")
    public Mono<List<String>> login() {
        List<String> t = new ArrayList<>();
        t.add("1");
        t.add("2");
        return Mono.just(t);
    }

}
