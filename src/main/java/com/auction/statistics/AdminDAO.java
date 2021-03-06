package com.auction.statistics;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDAO {
	
	@Autowired 
	private SqlSessionTemplate template;

	public List<String> getBigCategory() {
		return template.selectList("admin.getBigCategory");
	}

	public BidDTO getBidData(String seq) {
		return template.selectOne("admin.getBidData",seq);
	}
	
	
	
}
