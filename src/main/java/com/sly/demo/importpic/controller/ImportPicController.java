package com.sly.demo.importpic.controller;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.sly.demo.importpic.model.ByteArray;
import com.sly.demo.importpic.service.ImportPicService;

/**
 * 
 * @author sly
 * @time 2019年3月7日
 */
@Controller
@RequestMapping("/importPic")
public class ImportPicController {
	
	@Autowired
	private ImportPicService importPicService;

	/**
	 * 
	 * @param request
	 * @param response
	 * @return
	 * @author sly
	 * @time 2019年3月7日
	 */
	@RequestMapping("/toImportPic")
	public String toImportPic(HttpServletRequest request, HttpServletResponse response) {
		return "importPic.html";
	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @param byteArray
	 * @return
	 * @author sly
	 * @throws Exception 
	 * @time 2019年3月7日
	 */
	@ResponseBody
	@RequestMapping("/importPic")
	public Map<String, Object> importPic(HttpServletRequest request, HttpServletResponse response,
			ByteArray byteArray) throws Exception {
		MultipartHttpServletRequest multipartHttpServletRequest =  (MultipartHttpServletRequest) request; 
		MultipartFile multipartFile = multipartHttpServletRequest.getFile("file");
		
		InputStream inputStream = multipartFile.getInputStream();
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		byte[] buffer = new byte[1024 * 8];
		int len = 0;
		while ((len = inputStream.read(buffer)) > 0) {
			byteArrayOutputStream.write(buffer, 0, len);
		}
		byte[] bytes = byteArrayOutputStream.toByteArray();
		
		byteArray.setBytes(bytes);
		
		Map<String, Object> result = importPicService.importPic(byteArray);
		
		return result;
	}
}
