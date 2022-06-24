package com.Rahul.Medicine2;

import com.Rahul.Medicine2.model.Inquiry;
import com.Rahul.Medicine2.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @Autowired
    private HomeService homeService;
    @GetMapping("/")
    public String index(Model model)
    {
        model.addAttribute("inquiry", new Inquiry());
        return "index";
    }
    @GetMapping("/buy")
    public String buy(Model model)
    {
        model.addAttribute("buys",homeService.soldMeds());
        return "buy";
    }

    @PostMapping("/buy")
    public String searchedMed(Model model, @ModelAttribute Inquiry inquiry)
    {
        String medName = inquiry.getSearchString();
        model.addAttribute("buys",homeService.searchedMeds(medName));
        return "buy";
    }

    @GetMapping("/about")
    public String about()
    {
        return "about";
    }
    @GetMapping("/medicine")
    public String medicine()
    {
        return "medicine";
    }
    @GetMapping("/contact")
    public String contact()
    {
        return "contact";
    }
    @GetMapping("/news")
    public String news()
    {
        return "news";
    }
}
