package com.aws.codestar.projecttemplates.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Basic Spring MVC controller that handles all GET requests.
 */
@Controller
@RequestMapping("/bomberman")
public class BombermanController {

    private final String siteName;

    public BombermanController(final String siteName) {
        this.siteName = siteName;
    }

    @RequestMapping(method = RequestMethod.GET, path = "leaderboard")
    public ModelAndView leaderboardController() {

        final ArrayList<String> spielerErgebnisse = new ArrayList<String>();
        spielerErgebnisse.add("Simon");
        spielerErgebnisse.add("Andreas");
        spielerErgebnisse.add("Martin");

        ModelAndView mav = new ModelAndView("bomberman/leaderboard", "results", spielerErgebnisse);
        mav.addObject("siteName", this.siteName);
        mav.addObject("spieler", spielerErgebnisse);
        return mav;
    }

    @RequestMapping(method = RequestMethod.GET, path = "submitMatch")
    public ModelAndView submitMatchController() {

        ModelAndView mav = new ModelAndView("bomberman/submitMatch");
        mav.addObject("siteName", this.siteName);
        return mav;
    }

}
