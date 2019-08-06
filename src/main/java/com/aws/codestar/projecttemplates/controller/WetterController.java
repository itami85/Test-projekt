package com.aws.codestar.projecttemplates.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Basic Spring MVC controller that handles all GET requests.
 */
@Controller
@RequestMapping("/")
public class WetterController {

    private final String siteName;

    public WetterController(final String siteName) {
        this.siteName = siteName;
    }

    @RequestMapping(method = RequestMethod.GET, path = "weather")
    public ModelAndView weatherController() {
        ModelAndView mav = new ModelAndView("weather");
        mav.addObject("siteName", "Weather App");
        return mav;
    }

}
