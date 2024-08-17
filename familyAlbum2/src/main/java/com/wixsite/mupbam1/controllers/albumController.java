package com.wixsite.mupbam1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wixsite.mupbam1.dao.AlbumDao;

@Controller
@RequestMapping("/album")
public class albumController {
	AlbumDao albumDao;
	@Autowired	
	public albumController(AlbumDao albumDao) {
		super();
		this.albumDao = albumDao;
	}

	@GetMapping()
	public String index(Model model) {
		model.addAttribute("index", albumDao.index());
		return "album/mainMenu";
	}

}
