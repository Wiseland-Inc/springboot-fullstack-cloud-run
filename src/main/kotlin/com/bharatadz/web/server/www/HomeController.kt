package com.bharatadz.web.server.www


import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping


@Controller
class HomeController {

  @GetMapping("/")
  fun index(model: Model): String {
    model["title"] = "Blog"
    return "home"
  }
}
