package com.sly.demo.importpic.service;

import java.util.Map;

import com.sly.demo.importpic.model.ByteArray;

/**
 * 
 * @author sly
 * @time 2019年3月7日
 */
public interface ImportPicService {

	Map<String, Object> importPic(ByteArray byteArray);
	
}

