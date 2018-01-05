package com.cmb.okr.api.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@RequestMapping("/file")
@Controller
public class FileController {

	@RequestMapping("/upload")
	public void upload(@RequestParam("file") MultipartFile file) {
		try {
			InputStream is = file.getInputStream();
			FileUtils.copyInputStreamToFile(is, new File("D://TFILE"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
