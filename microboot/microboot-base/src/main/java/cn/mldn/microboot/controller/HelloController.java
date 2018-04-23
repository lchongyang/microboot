package cn.mldn.microboot.controller;

import cn.mldn.microboot.entity.GirlEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2018/4/18.
 */
@RestController
public class HelloController {

    @Resource
    private GirlEntity girlEntity;

    @RequestMapping(value = "/echo/{message}", method = RequestMethod.GET)
    public String echo(@PathVariable("message") String msg) {
        return "【ECHO】" + msg;
    }

    @RequestMapping(value = "/mul")
    public Object mul(int num) {
        return  num * 6;
    }

    @RequestMapping(value = "/object")
    public String object(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("*** 客户端IP地址：" + request.getRemoteAddr());
        System.out.println("*** 客户端响应编码：" + response.getCharacterEncoding());
        System.out.println("*** 取得sessionID：" + request.getSession().getId());
        System.out.println("*** 取得真实路径：" + request.getServletContext().getRealPath("/upload"));
        return  "hello world !";
    }

    @RequestMapping("/")
    public String home() {
        return girlEntity.getCupSize();
    }
}
