package com.example.cachemeoutside.controllers;

import com.example.cachemeoutside.Cache;
import com.example.cachemeoutside.UserAbuser;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controllerz {
Cache userCache = new Cache();
    @GetMapping("/get-user-data")
    @ResponseBody
    public String renderChache(@RequestParam int id) throws InterruptedException {

        if(userCache.has(id)==false){
            UserAbuser user = new UserAbuser(id);
            String s = user.getDataSlow();
            userCache.set(id,s);
            return s;
        }
        else if (userCache.has(id)==true) {
            return userCache.get(id);
        }
        return "/get-user-data";
    }
}