package com.test.sp.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.sp.dao.TtInfoDAO;
import com.test.sp.vo.TtInfo;

@Repository
public class TtInfoDAOImpl implements TtInfoDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<TtInfo> getTtInfoList() {
		return ss.selectList("com.test.sp.TTINFO.selectTTINFO");
	}

	@Override
	public TtInfo getTtInfo(Integer tno) {
		return ss.selectOne("com.test.sp.TTINFO.selectOneTTINFO",tno);
	}

	@Override
	public int insertTtInfo(TtInfo ti) {
		return ss.insert("com.test.sp.TTINFO.insertTTINFO",ti);
	}

	@Override
	public int updateTtInfo(TtInfo ti) {
		return ss.update("com.test.sp.TTINFO.updateTTINFO",ti);
	}

	@Override
	public int deleteTtInfo(Integer tno) {
		return ss.delete("com.test.sp.TTINFO.deleteTTINFO",tno);
	}

}
