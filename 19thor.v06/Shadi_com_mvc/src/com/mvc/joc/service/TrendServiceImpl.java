package com.mvc.joc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mvc.joc.dao.TrendDAO;
import com.mvc.joc.dto.TrendDTO;

@Component
public class TrendServiceImpl implements TrendService{

	@Autowired
	private TrendDAO trendDAO;

	public TrendServiceImpl() {
	System.out.println("Created \t"+this.getClass().getTypeName());
	}
	
	
	@Override
	public boolean validateAndSave(TrendDTO dto) {
		System.out.println("invoked validate and save in service" + dto);
		this.trendDAO.save(dto);
		return false;
	}
}
