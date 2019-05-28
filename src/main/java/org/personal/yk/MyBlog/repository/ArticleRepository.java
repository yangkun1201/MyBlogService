package org.personal.yk.MyBlog.repository;

import org.personal.yk.MyBlog.pojo.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface ArticleRepository extends CrudRepository<Article,Integer>{
}
