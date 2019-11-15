package fun.johntaylor.barathrum.controller.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping(value = "/api/json/test", produces = "application/json;charset=utf-8")
    public String test() {
        return "1";
    }
}
