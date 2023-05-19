package com.exam.repo;

// import java.time.LocalDate;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;

import com.exam.model.exam.Category;
import com.exam.model.exam.Notice;

public interface NoticeRepository extends JpaRepository<Notice, Long> {

	public Set<Notice> findByCategory(Category category);
	
//	@Query("SELECT notice from Notice notice WHERE notice.category = :category, notice.addedDate <= :endDate and notice.addedDate >= :startDate")
//	public Set<Notice> findByCategoryAndDateRange(@Param("category") Category category, @Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);
	
}
