package com.example.oop_spring.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("pageTitle", "Help Desk");
        model.addAttribute("welcomeMessage", "Добро пожаловать в Help Desk");
        model.addAttribute("features", List.of(
                "Регистрация обращений",
                "Приоритизация задач",
                "Контакты поддержки",
                "База знаний"
        ));
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("pageTitle", "О нас");
        model.addAttribute("teamName", "Учебная команда Help Desk");
        model.addAttribute("description",
                "Мы создаём учебную систему для обработки обращений пользователей.");
        return "about";
    }

    @GetMapping("/contacts")
    public String contacts(Model model) {
        model.addAttribute("pageTitle", "Контакты поддержки");
        model.addAttribute("supportEmail", "support@helpdesk.local");
        model.addAttribute("workTime", "Пн-Пт, 09:00-18:00");
        model.addAttribute("phone", "+7 (000) 000-00-00");
        model.addAttribute("numbers", List.of(
                "Email: support@helpdesk.local",
                "Телефон: +7 (000) 000-00-00",
                "Telegram: @support"
        ));
        return "contacts";
    }

    @GetMapping("/faq")
    public String faq(Model model) {
        model.addAttribute("pageTitle", "Частые вопросы");
        model.addAttribute("questions", List.of(
                "Как правильно составить обращение",
                "Что такое Help Desk и как им пользоваться",
                "Сколько времени ждать овтет поддержки"
        ));
        return "faq";
    }
}
