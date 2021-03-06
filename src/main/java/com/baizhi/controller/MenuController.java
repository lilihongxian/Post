package com.baizhi.controller;

import com.baizhi.entity.Menu;
import com.baizhi.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by admin on 2018/7/6.
 */

@Controller
@RequestMapping("/Menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @RequestMapping("QueryAll")
    @ResponseBody
    public List<Menu> QueryAll(){
        List<Menu> menus = menuService.selectAll();
        return menus;
    }
}
