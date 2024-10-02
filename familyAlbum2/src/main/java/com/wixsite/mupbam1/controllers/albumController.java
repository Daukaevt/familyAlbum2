package com.wixsite.mupbam1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wixsite.mupbam1.dao.AlbumDao;
import com.wixsite.mupbam1.models.Section;

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
		return "album/mainMenu1";
	}
	
	@GetMapping("/index")
	public String indexPage(Model model) {
		model.addAttribute("indexPage", albumDao.indexPage());
		return "album/index";
	}
	@GetMapping("/all-together")
	public String allTogetherPage(Model model) {
		model.addAttribute("indexPage", albumDao.allTogetherPage());
		return "album/all_together";
	}	
	@GetMapping("/our-celebrations")
	public String ourCelebrationsPage(Model model) {
		model.addAttribute("indexPage", albumDao.ourCelebrationsPage());
		return "album/our_celebrations";
	}	
	@GetMapping("/our-trips")
	public String ourTripsPage(Model model) {
		model.addAttribute("indexPage", albumDao.ourTripsPage());
		return "album/our_trips";
	}
	@GetMapping("/outdoor-recreation")
	public String outdoorRecreationPage(Model model) {
		model.addAttribute("indexPage", albumDao.outdoorRecreationPage());
		return "album/outdoor_recreation";
	}
	@GetMapping("/old-photos")
	public String oldPhotosPage(Model model) {
		model.addAttribute("indexPage", albumDao.oldPhotosPage());
		return "album/old_photos";
	}
	@GetMapping("/create_new_gallery")
	public String newGallery(Model model) {
		model.addAttribute("section", new Section());
		return "album/create_new_gallery";
	}
	@PostMapping()
	public String createAlbum(@ModelAttribute("section") Section section) {
		albumDao.save(section);
		return "redirect:/album";
	}

}
