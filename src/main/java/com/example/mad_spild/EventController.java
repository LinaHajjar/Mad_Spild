package com.example.mad_spild;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventController {

    @GetMapping("/Sommer2022")
    public String sommer2022() {
        return "Sommer2022"; // Returns the Sommer2022.html page
    }

    @GetMapping("/Sommer2023")
    public String sommer2023() {
        return "Sommer2023"; // Returns the Sommer2023.html page
    }

    @GetMapping("/Foraar2024")
    public String foraar2024() {
        return "Foraar2024"; // Returns the Foraar2024.html page
    }

    @GetMapping("/Sommer2024")
    public String sommer2024() {
        return "Sommer2024"; // Returns the Sommer2024.html page
    }

}
