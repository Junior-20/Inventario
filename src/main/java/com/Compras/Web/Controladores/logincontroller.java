package com.Compras.Web.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class logincontroller {

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String processLoginForm(@RequestParam String username, @RequestParam String password, Model model) {
        // aquí iría la lógica para validar el usuario y contraseña
        if (username.equals("admin") && password.equals("1234")) {
            return "redirect:/Inicio.html";
        } else {
            model.addAttribute("error", "Credenciales incorrectas");
            return "login";
        }
    }

    @GetMapping("/Inicio.html")
    public String showHomePage() {
        return "Inicio.html";
    }

}


