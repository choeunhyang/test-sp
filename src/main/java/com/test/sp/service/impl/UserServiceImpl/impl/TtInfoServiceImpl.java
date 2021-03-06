package com.test.sp.service.impl.UserServiceImpl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.sp.dao.TtInfoDAO;
import com.test.sp.service.impl.UserServiceImpl.TtInfoService;
import com.test.sp.vo.TtInfo;

@Service
public class TtInfoServiceImpl implements TtInfoService { 

	@Autowired
	private TtInfoDAO tidao;
	
	@Override
	public List<TtInfo> getTtInfoList() {
		return tidao.getTtInfoList();
	}

	@Override
	public TtInfo getTtInfo(Integer tno) {
		return tidao.getTtInfo(tno);
	}

	@Override
	public int insertTtInfo(TtInfo ti) {
		return tidao.insertTtInfo(ti);
	}

	@Override
	public int updateTtInfo(TtInfo ti) {
		return tidao.updateTtInfo(ti);
	}

	@Override
	public int deleteTtInfo(Integer tno) {
		return tidao.deleteTtInfo(tno);
	}

}
