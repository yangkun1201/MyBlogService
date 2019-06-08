package org.personal.yk.MyBlog.repository;

import org.personal.yk.MyBlog.pojo.Article;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public interface ArticleRepository extends CrudRepository<Article,Integer>{

    @Transactional
    @Modifying
    @Query("update Article set title=:title,type=:type,content=:content,contentMd=:contentMd where id=:id")
    public void updateArticle(@Param("title")String title,
                              @Param("type")String type,
                              @Param("content")String content,
                              @Param("contentMd")String contentMd,
                              @Param("id")int id);

}
