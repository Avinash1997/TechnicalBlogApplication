package technicalblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import technicalblog.model.Post;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getAllPosts(Model model) {
        ArrayList<Post> posts = new ArrayList<>();

        Post post1 = new Post();
        post1.setTitle("Ironman");
        post1.setBody("Techie");
        post1.setDate(new Date());

        Post post2 = new Post();
        post2.setTitle("Captain America");
        post2.setBody("Man out of time");
        post2.setDate(new Date());

        Post post3 = new Post();
        post3.setTitle("Thor");
        post3.setBody("God of thunder");
        post3.setDate(new Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        model.addAttribute("posts", posts);

        return "index";
    }
}
