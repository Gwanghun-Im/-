package com.web.curation.model.dao;

import java.util.List;
import java.util.Map;

import com.web.curation.model.Achieve;
import com.web.curation.model.AchieveTitleDetail;
import com.web.curation.model.AchieveTitleList;
import com.web.curation.model.Achievecurrent;
import com.web.curation.model.RecipeContent;
import com.web.curation.model.RecipeInfo;

import com.web.curation.model.SaveRecipeContent;

public interface AchieveDao {

	List<Achieve> getachievemasterlist() throws Exception;

	List<Achieve> getachieveslavelist() throws Exception;

	List<Integer> getMasterCount() throws Exception;

	List<Achievecurrent> getAchievecurrent(String id) throws Exception;

	List<Achieve> getMasterCategoryCount(String master) throws Exception;

	List<RecipeContent> getCategoryRecipe(Map<String, String> map);

	List<AchieveTitleList> getTitleList(String id);

	List<AchieveTitleDetail> getTitleDetail(Map<String, String> map);

	List<AchieveTitleList> getTitleOne(Map<String, String> map);
	
}