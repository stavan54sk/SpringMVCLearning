package com.testpackage.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.testpackage.model.User;

@Controller
public class UploadController {
	@RequestMapping(value = "/upload", method = RequestMethod.GET)
	public String showUploadForm() {
		return "uploadform";
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public ModelAndView uploadFiles(@RequestParam MultipartFile[] file) {
		String status = "";

		try {
			for (MultipartFile multipartFile : file) {
				String file_Name = multipartFile.getOriginalFilename();
				FileOutputStream fos = new FileOutputStream("E:/uploads/" + file_Name);
				byte[] bt = multipartFile.getBytes();
				fos.write(bt);
				status = "SUCCESS";
			}

		} catch (Exception e) {
			status = "FAILURE";
			e.printStackTrace();
		}
		return new ModelAndView("status", "status", status);
	}
}