package cn.cocowwy.showdb.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * route view
 *
 * @author cocowwy.cn
 * @create 2022-01-01-14:22
 */
@Controller
@Slf4j
public class RouteController {

    private static String VIEW_SHOWDB = "showdb";

    /**
     * 主页访问路由
     * @param httpServletRequest
     * @return
     */
    @GetMapping(value = {"/show", "/"})
    public String route2ShowDB(HttpServletRequest httpServletRequest) {
        return VIEW_SHOWDB;
    }

}
