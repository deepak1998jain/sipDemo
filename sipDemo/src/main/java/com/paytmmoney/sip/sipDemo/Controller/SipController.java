package com.paytmmoney.sip.sipDemo.Controller;
import com.paytmmoney.sip.sipDemo.Service.SipService;
import com.paytmmoney.sip.sipDemo.model.mysql.SipEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
public class SipController {

     @Autowired
     private SipService sipservice;

    @ResponseBody
    @GetMapping(value="/")
    public String home()
    {
        return "Hello";
    }

    @ResponseBody
    @GetMapping(value = "/getAllEntities")
    public List<SipEntity> getAllEntities()
    {
         List<SipEntity> newList = sipservice.getAllEntities();

         return newList;
    }
}
