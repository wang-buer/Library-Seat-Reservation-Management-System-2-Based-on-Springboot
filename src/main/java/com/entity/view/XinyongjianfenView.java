package com.entity.view;

import com.entity.XinyongjianfenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 信用减分
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-16 20:36:41
 */
@TableName("xinyongjianfen")
public class XinyongjianfenView  extends XinyongjianfenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XinyongjianfenView(){
	}
 
 	public XinyongjianfenView(XinyongjianfenEntity xinyongjianfenEntity){
 	try {
			BeanUtils.copyProperties(this, xinyongjianfenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
