package org.personal.yk.MyBlog.controller;

import org.personal.yk.MyBlog.pojo.Article;
import org.personal.yk.MyBlog.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class ArticleController {

    @Autowired
    ArticleRepository articleRepository;

    @GetMapping("getAllArticles")
    public List<Article> getAllArticles(){
        List<Article> result = new ArrayList<>();
        articleRepository.findAll().forEach(e->{
            result.add(e);
        });
        return result;
    }

    @PostMapping("addArticle")
    public Map<String,Object> addArticle(@RequestBody Article article){
        articleRepository.save(article);
        Map<String,Object> result = new HashMap<>();
        result.put("status","ok");
        return result;
    }

    @GetMapping("getArticleById")
    public Article getArticleById(@RequestParam("id") int id){
        return articleRepository.findById(id).get();
    }

    @PostMapping("updateArticleById")
    public Map<String,Object> updateArticleById(@RequestBody Article article){
        articleRepository.updateArticle(
                article.getTitle(), article.getType(),article.getContent(),
                article.getContentMd(),article.getId());
        Map<String,Object> result = new HashMap<>();
        result.put("status","ok");
        return result;
    }

    @GetMapping("deleteArticleById")
    public Map<String,Object> deleteArticleById(@RequestParam("id") int id){
        articleRepository.deleteById(id);
        Map<String,Object> result = new HashMap<>();
        result.put("status","ok");
        return result;
    }


}
