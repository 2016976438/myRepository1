package org.java.web;

import org.java.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InfoController {
    @Autowired
    InfoService infoService;

    @RequestMapping("showInfo")
    public String showInfo(Model model){
        System.out.println("进入了");
        model.addAttribute("list",infoService.getList());
        return "/show";
    }
}
