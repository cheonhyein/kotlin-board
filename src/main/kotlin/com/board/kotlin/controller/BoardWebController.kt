package com.board.kotlin.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class BoardWebController {

    @GetMapping("/")
    fun board(model: Model): String {
        // java => model.addAttribute("title", "board")
        model["title"] = "board"
        return "board"
    }
}