package board.testboard.controller;

import board.testboard.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {

    @Autowired
    private PostService postService;

    @PostMapping("/submit")
    public String submitForm(@RequestParam String title, @RequestParam String content) {
        postService.createPost(title, content);
        return "redirect:/";
    }

    @GetMapping("/")
    public  String index(){
        return "index";
    }
}
