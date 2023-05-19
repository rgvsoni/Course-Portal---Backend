package com.exam.service.impl;

// import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.model.exam.Category;
import com.exam.model.exam.Notice;
import com.exam.repo.NoticeRepository;
import com.exam.service.NoticeService;

@Service
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private NoticeRepository noticeRepository;
	@Override
	public Notice createNotice(Notice notice) {
		// TODO Auto-generated method stub
		return this.noticeRepository.save(notice); 
		
	}

	@Override
	public Notice updateNotice(Notice notice) {
		// TODO Auto-generated method stub
		return this.noticeRepository.save(notice);
	}

	@Override
	public Set<Notice> getAllNotices() {
		// TODO Auto-generated method stub
			
		return new LinkedHashSet<>(this.noticeRepository.findAll());
		
	}

	@Override
	public Notice getNoticeById(Long noticeId) {
		// TODO Auto-generated method stub
		return this.noticeRepository.findById(noticeId).get();
	}

	@Override
	public Set<Notice> getNoticesByCategory(Category category) {
		// TODO Auto-generated method stub
		
		
		return this.noticeRepository.findByCategory(category);
	}
	
	

	@Override
	public void deleteById(Long noticeId) {
		// TODO Auto-generated method stub
		
		this.noticeRepository.deleteById(noticeId);

	}

//	@Override
//	public Set<Notice> getNoticesByCategoryAndDateRange(Category category, LocalDate startDate, LocalDate endDate) {
//		// TODO Auto-generated method stub
//		return this.noticeRepository.findByCategoryAndDateRange(category, startDate, endDate);
//		
//	}

}
