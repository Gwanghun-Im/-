package com.web.curation.model.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.curation.model.CommentFromDB;
import com.web.curation.model.RecipeContent;
import com.web.curation.model.RecipeInfo;
import com.web.curation.model.RecipeSingleContent;
import com.web.curation.model.SaveComment;
import com.web.curation.model.SaveRecipeContent;
import com.web.curation.model.SaveRecipeitem;
import com.web.curation.model.dao.FeedDao;

@Service
public class FeedServiceImpl implements FeedService {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int writeRecipeInfo(RecipeInfo recipeInfo) throws Exception {
		return sqlSession.getMapper(FeedDao.class).writeRecipeInfo(recipeInfo);
	}

	@Override
	public int writeRecipeContent(SaveRecipeContent recipeContent) throws Exception {
		return sqlSession.getMapper(FeedDao.class).writeRecipeContent(recipeContent);
	}

	@Override
	public Integer getRecipe_idx(Map map) throws Exception {
		return sqlSession.getMapper(FeedDao.class).getRecipe_idx(map);
	}
	
	@Override
	public List<RecipeSingleContent> getRecipeContents(String recipe_idx) throws Exception {
		return sqlSession.getMapper(FeedDao.class).getRecipeContents(recipe_idx);
	}

	@Override
	public List<RecipeContent> getLatestFeed(String id) throws Exception {
		return sqlSession.getMapper(FeedDao.class).getLatestFeed(id);
	}
	
	@Override
	public List<RecipeContent> getAllRecipes(String id) throws Exception {
		return sqlSession.getMapper(FeedDao.class).getAllRecipes(id);
	}

	@Override
<<<<<<< HEAD
	public int writeComment(SaveComment comment) throws Exception {
		return sqlSession.getMapper(FeedDao.class).writeComment(comment);
	}

	@Override
	public int updateComment(SaveComment comment) throws Exception {
		return sqlSession.getMapper(FeedDao.class).updateComment(comment);
	}

	@Override
	public int deleteComment(int idx) throws Exception {
		return sqlSession.getMapper(FeedDao.class).deleteComment(idx);
	}

	@Override
	public List<CommentFromDB> getCommentList(int content_idx) throws Exception {
		return sqlSession.getMapper(FeedDao.class).getCommentList(content_idx);
	}

	@Override
	public int getLikeCount(int comment_idx) throws Exception {
		return sqlSession.getMapper(FeedDao.class).getLikeCount(comment_idx);
	}

	@Override
	public int checkLike(Map map) throws Exception {
		return sqlSession.getMapper(FeedDao.class).checkLike(map);
	}

	@Override
	public int likeComment(Map map) throws Exception {
		return sqlSession.getMapper(FeedDao.class).likeComment(map);
	}

	@Override
	public int cancelLikeComment(Map map) throws Exception {
		return sqlSession.getMapper(FeedDao.class).cancelLikeComment(map);
	}
=======
	public int writeHashtags(HashMap<String, Object> hash) {
		return sqlSession.getMapper(FeedDao.class).writeHashtag(hash);
	}

	@Override
	public List<Integer> getLikedPosts(String user_id) throws Exception {
		return sqlSession.getMapper(FeedDao.class).getLikedPosts(user_id);
	}

	@Override
	public SaveRecipeitem getSingleRecipe(int recipe_idx) throws Exception {
		return sqlSession.getMapper(FeedDao.class).getSingleRecipe(recipe_idx);
	}

	@Override
	public int getLikeNum(int recipe_idx) throws Exception {
		return sqlSession.getMapper(FeedDao.class).getLikeNum(recipe_idx);
	}

>>>>>>> e35cf708d148e4e75fbff0ca3392f6563869eff8

}
