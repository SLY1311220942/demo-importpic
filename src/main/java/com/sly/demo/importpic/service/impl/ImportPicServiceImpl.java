package com.sly.demo.importpic.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sly.demo.importpic.mapper.ByteArrayMapper;
import com.sly.demo.importpic.model.ByteArray;
import com.sly.demo.importpic.service.ImportPicService;

/**
 * 
 * @author sly
 * @time 2019年3月7日
 */
@Service
@Transactional(rollbackFor=Exception.class)
public class ImportPicServiceImpl implements ImportPicService {
	@Autowired
	private ByteArrayMapper byteArrayMapper;

	@Override
	public Map<String, Object> importPic(ByteArray byteArray) {
		Map<String, Object> result = new HashMap<>(16);
		byteArrayMapper.importPic(byteArray);
		result.put("status", 200);
		result.put("message", "成功!");
		return result;
	}

}

