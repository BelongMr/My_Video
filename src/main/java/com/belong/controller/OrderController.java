package com.belong.controller;

import com.belong.config.ConstantConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
@RequestMapping(value = "/my_order")
@SessionAttributes(value = {"order","orderId"})
public class OrderController {
    Logger logger = LoggerFactory.getLogger(OrderController.class);

    @RequestMapping(value = "/preview")
    public String query(@RequestParam("vip_type") String vip_type,
                        @RequestParam("vip_time") String vip_time,
                        Map map){
        map.put("vip_type",vip_type);
        map.put("vip_time",vip_time);
        return ConstantConfig.HOME;
    }
}
