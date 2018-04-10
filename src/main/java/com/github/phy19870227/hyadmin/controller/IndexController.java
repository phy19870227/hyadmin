package com.github.phy19870227.hyadmin.controller;

import com.github.phy19870227.hyadmin.module.vo.PageView;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * @author buhuayang
 */
@Controller
public class IndexController {

    @RequestMapping(path = "/")
    public String root() {
        return "redirect:/index.htm";
    }

    @RequestMapping(path = "/index.htm")
    public String index() {
        return "index";
    }

    @RequestMapping(path = "/main.htm")
    public String main(Model model) {
        PageView pageView = new PageView();
        Map<String, String> data = new HashMap<>(3);
        data.put("title", "标题");
        data.put("content", "内容");
        data.put("extraInfo", "只有超级管理员能看到");
        pageView.setData(data);
        model.addAttribute("pageView", pageView);
        return "main";
    }

}
