package com.b.d.controllers;


import com.b.d.ServiceEmailSend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerProduct  {

    @Autowired
    private ServiceEmailSend serviceEmailSend;

    public void sendMain(){

    }
    @PostMapping
    public String PostProducts(@RequestParam String toEmail, @RequestParam String subject, @RequestParam String body){
        serviceEmailSend.sendEmail(toEmail,subject,body);

        return "redirect:/";
    }



    @GetMapping
    public String products(Model model){
        return "products";
    }
}
