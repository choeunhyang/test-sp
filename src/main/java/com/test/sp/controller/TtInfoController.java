package com.test.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.sp.service.impl.UserServiceImpl.TtInfoService;
import com.test.sp.vo.TtInfo;

@Controller
public class TtInfoController { 
	
	/*@Autowired
	private TtInfoService tis; //controllerTEST servlet-context.xml 변경
	
	@GetMapping(value="/ttinfos") // Get만 된다.
	public @ResponseBody List<TtInfo> getTtInfoList(){
		return tis.getTtInfoList();
	}
	
	@GetMapping(value="/ttinfos/{tnum}")
	public @ResponseBody TtInfo getTtInfo(@PathVariable Integer tnum) {
		return tis.getTtInfo(tnum);
	}
	
	@PostMapping(value="/ttinfos")
	public @ResponseBody int insertTtInfo(@RequestBody TtInfo ti) {
		return tis.insertTtInfo(ti);
	}
	
	@PutMapping(value="/ttinfos/{tnum}")
	public @ResponseBody int updateTtInfo(@RequestBody TtInfo ti) {
		return tis.updateTtInfo(ti);
	}
	
	@DeleteMapping(value="/ttinfos/{tnum}")
	public @ResponseBody int deleteTtInfo(@PathVariable Integer tnum) {
		return tis.deleteTtInfo(tnum);
	}*/
}
