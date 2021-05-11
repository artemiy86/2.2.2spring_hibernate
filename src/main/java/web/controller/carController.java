package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class carController {
    @RequestMapping("/cars")
    public String getCars(@RequestParam(value="count", defaultValue = "5") int count, ModelMap model){
        if(count > 5){
            count = 5;
        }
        CarServiceImpl service = new CarServiceImpl();
        model.addAttribute("cars",service.getCarList(count));
        return "cars";
    }
}
