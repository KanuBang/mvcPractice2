package springMvc.mvcPractice2.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogTestController {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";
        /*
        # 전체 로그 레벨 설정 (기본 info)
        logging.level.root = info

        기본 로그 레벨이 info 이기에 trace, debug는 출력 되지 않음

        # springMvc.mvcPractice2 패키지와 그 하위 로그 레벨 설정
        logging.level.springMvc.mvcPractice2 = debug

        특정 패키지의 로그 레벨을 지정할 수 있음. 전체 로그와는 달리 설정한대로 trace만 출력 되지 않고
        debug부터는 출력됨.
         */
        log.trace("trace log = {}", name);
        log.debug("debug log = {}", name);
        log.info("info log = {}", name);
        log.warn("warn log = {}", name);
        log.error("error log = {}", name);

        log.debug("String concat log="+name);
        return "ok";
    }
}
