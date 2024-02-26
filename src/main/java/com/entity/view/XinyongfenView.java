package com.entity.view;

import com.entity.XinyongfenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 信用分
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-16 20:36:41
 */
@TableName("xinyongfen")
public class XinyongfenView  extends XinyongfenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XinyongfenView(){
	}
 
 	public XinyongfenView(XinyongfenEntity xinyongfenEntity){
 	try {
			BeanUtils.copyProperties(this, xinyongfenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
