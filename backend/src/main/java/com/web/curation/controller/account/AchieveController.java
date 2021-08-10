package com.web.curation.controller.account;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.curation.model.Achieve;
import com.web.curation.model.RecipeContent;
import com.web.curation.model.service.AchieveService;
import com.web.curation.model.service.JwtService;
import com.web.curation.model.service.UserService;

@CrossOrigin("*")
@RequestMapping("/achieve")
@RestController
public class AchieveController {

	@Autowired
	AchieveService achieveservice;

	@Autowired
	JwtService jwtservice;

	@GetMapping("list")
	public ResponseEntity<?> getachievelist() {

		HashMap resultmap = new HashMap();

		String result = "";

		try {
			result = "success";

			List<Achieve> masterlist = achieveservice.getachievemasterlist();
			List<Achieve> slavelist = achieveservice.getachieveslavelist();

			resultmap.put("masterlist", masterlist);
			resultmap.put("slavelist", slavelist);
			resultmap.put("result", result);

		} catch (Exception e) {
			e.printStackTrace();
			result = "error";
			resultmap.put("result", result);
		}

		return new ResponseEntity<>(resultmap, HttpStatus.OK);
	}

	@GetMapping("/mastercount")
	public ResponseEntity<Map<String, Object>> getAchieveMasterCount() {
		Map<String, Object> resultMap = new HashMap<>();
		HttpStatus status = HttpStatus.ACCEPTED;
		String result = "SUCCESS";
		try {
			List<Integer> count = achieveservice.getMasterCount();

			resultMap.put("masterCount", count);

			if (count == null) {
				result = "FAIL";
			} else {
				result = "SUCCESS";
			}

			resultMap.put("message", result);
			status = HttpStatus.ACCEPTED;

		} catch (Exception e) {
			e.printStackTrace();
			resultMap.put("message", e.getMessage());
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);
	}

}