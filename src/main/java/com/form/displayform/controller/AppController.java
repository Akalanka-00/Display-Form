package com.form.displayform.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController
{

    @GetMapping("/register")
    public String RegisterStudent(
            @RequestParam(name = "name") String name,
            @RequestParam(name = "index") String index,
            @RequestParam(name = "batch") int batch,
            @RequestParam(name = "semester") int semester,
            @RequestParam(name = "reg_name") String reg_name
    ){
        System.out.println(name);
        return "Dear Sir/Madam,<br><br>I am " + name + " of index number " + index + ". I am from batch " + batch + ". This is regarding the " + semester + " module registration. <br>Please find my registration PDF in the attachment.<br>Thank you.<br>Best Regards,<br>" + reg_name;

//        return "Dear Sir/Madam,\n\n I am "+ name + " of index number "+ index + ". I am from batch "+batch + ". This is regarding the "+ semester + " module registration. \nPlease find my registration pdf in the attachment.\nTHank you.\nBest Regards,\n"+ reg_name;
        }
}
