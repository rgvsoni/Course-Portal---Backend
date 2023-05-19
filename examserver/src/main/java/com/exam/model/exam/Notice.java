package com.exam.model.exam;

import java.time.LocalDate;	
// import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "notices")
@Getter
@Setter
public class Notice {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long noticeId;
	private String title;
	
	@Column(length = 1000)
	private String content;
	
	private LocalDate addedDate = LocalDate.now();
	
	// private Date addedDate = new Date();
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Category category;
	

}
