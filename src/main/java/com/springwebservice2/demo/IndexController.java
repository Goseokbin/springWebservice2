package com.springwebservice2.demo;

import com.springwebservice2.demo.Service.posts.PostsService;
import com.springwebservice2.demo.config.LoginUser;
import com.springwebservice2.demo.config.dto.SessionUser;
import com.springwebservice2.demo.web.dto.PostListResponseDto;
import com.springwebservice2.demo.web.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;
import java.util.List;

@RequiredArgsConstructor
@Controller
public class IndexController {
    private final PostsService postsService;
    private final HttpSession httpSession;

    @GetMapping("/")
    public String index(Model model, @LoginUser SessionUser user){
        List<PostListResponseDto> posts = postsService.findAllDesc();
        model.addAttribute("posts", posts);

        if(user !=null){
            model.addAttribute("userName", user.getName());

        }
        return "index";
    }

    @GetMapping("/posts/save")
    public String postsSave(){

        return "posts-save";
    }

    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model){
        PostsResponseDto post = postsService.findById(id);
        model.addAttribute("post", post);
        return "posts-update";
    }


}
