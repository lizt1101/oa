/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.shutian.oa.modules.oa.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shutian.oa.common.persistence.Page;
import com.shutian.oa.common.service.CrudService;
import com.shutian.oa.modules.oa.entity.OaOvertime;
import com.shutian.oa.modules.oa.dao.OaOvertimeDao;

/**
 * 加班申请Service
 * @author lizt
 * @version 2018-07-17
 */
@Service
@Transactional(readOnly = true)
public class OaOvertimeService extends CrudService<OaOvertimeDao, OaOvertime> {

	public OaOvertime get(String id) {
		return super.get(id);
	}
	
	public List<OaOvertime> findList(OaOvertime oaOvertime) {
		return super.findList(oaOvertime);
	}
	
	public Page<OaOvertime> findPage(Page<OaOvertime> page, OaOvertime oaOvertime) {
		return super.findPage(page, oaOvertime);
	}
	
	@Transactional(readOnly = false)
	public void save(OaOvertime oaOvertime) {
		super.save(oaOvertime);
	}
	
	@Transactional(readOnly = false)
	public void delete(OaOvertime oaOvertime) {
		super.delete(oaOvertime);
	}
	
}