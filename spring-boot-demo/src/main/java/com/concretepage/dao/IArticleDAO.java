package com.concretepage.dao;
import java.util.List;
import com.concretepage.entity.Article;;

public interface IArticleDAO {
List<Article> getAllArticles(); 
void createArticle(Article article);
void updateArticle(Article article); 
boolean articleExists(String title , String category, String author);
Article getArticleById(int articleId);
void deleteArticle(int articleId);
}
