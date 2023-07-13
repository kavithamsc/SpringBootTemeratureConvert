package org.launchcode.temperatureconverter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

public class ConverterController {
    //when user goes to /convert
    //then the user should see a form
    // with one input for the temp in F
    @GetMapping("/convert")
    @ResponseBody
    public String displayConvertForm(){
        return "<form method =\"post\">" +
                "<label for=\"tempF\">Temperature</label>" +
                "<input name=\"tempF\"placeholder=\"Fahrenheit\">"+
                "<button>Convert to Celsius</button>"+
                "</form>"+
                "</body>"+
               " </html>";
    }
    @PostMapping("/convert")
    @ResponseBody
    public String handleConvertForm(@RequestParam Integer tempF){
        return "The temp " + tempF + "F in C is " + String.valueOf((tempF -32) * 5 /9);
    }
}
