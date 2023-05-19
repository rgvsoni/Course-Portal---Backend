package com.exam.controller;


// import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.model.exam.Category;
import com.exam.model.exam.Notice;
import com.exam.service.CategoryService;
import com.exam.service.NoticeService;




@RestController
@CrossOrigin("*")
@RequestMapping("/notice")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	
	
	@Autowired
	private CategoryService categoryService;
	
	@PostMapping("/")
	public ResponseEntity<?> addNotice(@RequestBody Notice notice) {
		
		Notice newNotice = this.noticeService.createNotice(notice);
		
		return ResponseEntity.ok(newNotice);
	}
	
	@PutMapping("/") 
	public ResponseEntity<?> updateNotice(@RequestBody Notice notice) {
		
		Notice updatedNotice = this.noticeService.createNotice(notice);
		
		return ResponseEntity.ok(updatedNotice);
	}
	
	@GetMapping("/{noticeId}")
	public ResponseEntity<Notice> getNoticeById(@PathVariable("noticeId") Long noticeId) {
		
		return new ResponseEntity<Notice>(this.noticeService.getNoticeById(noticeId), HttpStatus.OK);
	}
	
	@GetMapping("/")
	public ResponseEntity<?> getAllNotices() {
		
		return ResponseEntity.ok(this.noticeService.getAllNotices());
	}
	
	@GetMapping("/category/{categoryId}") 
	public ResponseEntity<?> getNoticesByCategory(@PathVariable("categoryId") Long categoryId) {
		
		Category category = this.categoryService.getCategory(categoryId);
		return ResponseEntity.ok(this.noticeService.getNoticesByCategory(category));
	}
	
//	@GetMapping("/category/{categoryId}") 
//	public ResponseEntity<?> getNoticesByCategoryAndDateRange(@RequestBody LocalDate startDate, @RequestBody LocalDate endDate, @PathVariable("categoryId") Long categoryId) {
//		
//		Category category = this.categoryService.getCategory(categoryId);
//		return ResponseEntity.ok(this.noticeService.getNoticesByCategoryAndDateRange(category, startDate, endDate));
//	}
	
	@DeleteMapping("/{noticeId}")
	public void deleteNotice(@PathVariable("noticeId") Long noticeId) {
		this.noticeService.deleteById(noticeId);
	}
	
	

}
