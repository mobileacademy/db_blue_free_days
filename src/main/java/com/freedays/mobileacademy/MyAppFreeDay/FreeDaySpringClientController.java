package com.freedays.mobileacademy.MyAppFreeDay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.io.IOException;
import java.util.List;

@RestController
public class FreeDaySpringClientController {

    @Autowired
    private FreeDayRetrofitService myFreeDayService;

    @RequestMapping("/")
    String home() {
        return "my page of free days";
    }

    @RequestMapping("/freeDays")
    private List<FreeDayModel> getFreeDays(@PathParam("year") int year, @PathParam("countryCode") String countryCode) throws IOException {
        System.out.println("#### controller getFreeDays" + year + " , " + countryCode);

        return myFreeDayService.getFreeDays(year, countryCode);
    }

}
