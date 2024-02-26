package com.entity.vo;

import com.entity.JubaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 举报信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-16 20:36:41
 */
public class JubaoxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 区号
	 */
	
	private String quhao;
		
	/**
	 * 座位号
	 */
	
	private String zuoweihao;
		
	/**
	 * 举报内容
	 */
	
	private String jubaoneirong;
		
	/**
	 * 举报时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jubaoshijian;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：区号
	 */
	 
	public void setQuhao(String quhao) {
		this.quhao = quhao;
	}
	
	/**
	 * 获取：区号
	 */
	public String getQuhao() {
		return quhao;
	}
				
	
	/**
	 * 设置：座位号
	 */
	 
	public void setZuoweihao(String zuoweihao) {
		this.zuoweihao = zuoweihao;
	}
	
	/**
	 * 获取：座位号
	 */
	public String getZuoweihao() {
		return zuoweihao;
	}
				
	
	/**
	 * 设置：举报内容
	 */
	 
	public void setJubaoneirong(String jubaoneirong) {
		this.jubaoneirong = jubaoneirong;
	}
	
	/**
	 * 获取：举报内容
	 */
	public String getJubaoneirong() {
		return jubaoneirong;
	}
				
	
	/**
	 * 设置：举报时间
	 */
	 
	public void setJubaoshijian(Date jubaoshijian) {
		this.jubaoshijian = jubaoshijian;
	}
	
	/**
	 * 获取：举报时间
	 */
	public Date getJubaoshijian() {
		return jubaoshijian;
	}
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
