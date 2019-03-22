package cn.itcast.controller1;

import cn.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class ControllerTest {
    @RequestMapping("/test")
    public String test(User user){
        System.out.println("方法执行");
        System.out.println(user);
        return "success";
    }

    /**
     * 异步请求
     * @return
     */
    @RequestMapping("/testJson")
    public User test1( @RequestBody String user){
        System.out.println("232324324234");
        System.out.println(user);

        return null;
    }
}
