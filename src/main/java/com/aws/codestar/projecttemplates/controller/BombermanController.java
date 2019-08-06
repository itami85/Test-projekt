package com.aws.codestar.projecttemplates.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.aws.codestar.projecttemplates.model.SpielerErgebnisse;

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
        ModelAndView mav = new ModelAndView("bomberman/leaderboard");
        mav.addObject("siteName", this.siteName);
        return mav;
    }

    @RequestMapping(method = RequestMethod.GET, path = "submitMatch")
    public ModelAndView submitMatchController() {
        final ArrayList<SpielerErgebnisse> spielerErgebnisse = new ArrayList<SpielerErgebnisse>();
        spielerErgebnisse.add(new SpielerErgebnisse("Lukas", 3, 3, 0, 9));
        spielerErgebnisse.add(new SpielerErgebnisse("Kai", 4, 2, 2, 6));
        spielerErgebnisse.add(new SpielerErgebnisse("Martin", 3, 1, 2, 3));
        spielerErgebnisse.add(new SpielerErgebnisse("Simon", 3, 0, 3, 0));
        spielerErgebnisse.add(new SpielerErgebnisse("Andreas", 4, 4, 0, 12));
        spielerErgebnisse.add(new SpielerErgebnisse("Stefan", 5, 2, 3, 6));

        ModelAndView mav = new ModelAndView("bomberman/submitMatch", "results", spielerErgebnisse);
        mav.addObject("siteName", this.siteName);
        return mav;
    }

}
