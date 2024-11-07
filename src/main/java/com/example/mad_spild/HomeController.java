package com.example.mad_spild;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {

        @GetMapping("/organisation")
        public String organisation(){
            return "Organisation";
        }

        @GetMapping("/virksomhed")
        public String virksomhed(){
            return "Virksomhed";
        }


        @GetMapping("/about")
        public String about(){
            return "Om os";
        }


        @GetMapping("/index")
        public String index(){
            return "index";
        }



    }

