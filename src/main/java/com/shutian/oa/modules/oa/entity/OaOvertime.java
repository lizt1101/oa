/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.shutian.oa.modules.oa.entity;

import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.NotNull;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.shutian.oa.common.persistence.DataEntity;

/**
 * 加班申请Entity
 * @author lizt
 * @version 2018-07-17
 */
public class OaOvertime extends DataEntity<OaOvertime> {
	
	private static final long serialVersionUID = 1L;
	private String title;		// 标题
	private Integer degree;		// 紧急程度1-正常2-重要3-紧急
	private Integer type;		// 加班类型1-工作日2-休息日3-节假日4-其他
	private String reason;		// 加班事由
	private Date startTime;		// 开始时间
	private Date endTime;		// 结束时间
	private String timeLong;		// 加班时长
	
	public OaOvertime() {
		super();
	}

	public OaOvertime(String id){
		super(id);
	}

	@Length(min=1, max=64, message="标题长度必须介于 1 和 64 之间")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@NotNull(message="紧急程度1-正常2-重要3-紧急不能为空")
	public Integer getDegree() {
		return degree;
	}

	public void setDegree(Integer degree) {
		this.degree = degree;
	}
	
	@NotNull(message="加班类型1-工作日2-休息日3-节假日4-其他不能为空")
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
	
	@Length(min=1, max=1024, message="加班事由长度必须介于 1 和 1024 之间")
	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="开始时间不能为空")
	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="结束时间不能为空")
	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
	@Length(min=1, max=12, message="加班时长长度必须介于 1 和 12 之间")
	public String getTimeLong() {
		return timeLong;
	}

	public void setTimeLong(String timeLong) {
		this.timeLong = timeLong;
	}
	
}