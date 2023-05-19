package com.exam.service;

// import java.time.LocalDate;
import java.util.Set;

import com.exam.model.exam.Category;
import com.exam.model.exam.Notice;

public interface NoticeService {
	
	public Notice createNotice(Notice notice);
	
	public Notice updateNotice(Notice notice);
	
	public Set<Notice> getAllNotices();
	
	public Notice getNoticeById(Long noticeId);
	
	public Set<Notice> getNoticesByCategory(Category category);
//	public Set<Notice> getNoticesByCategoryAndDateRange(Category category, LocalDate startDate, LocalDate endDate);
	
	public void deleteById(Long noticeId);
	

}
