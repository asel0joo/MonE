package co.kr.mone;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/mone")
    @ResponseBody
    public String index() {
        return "안녕하세요. mone에 오신것을 환영합니다.";
    }
}