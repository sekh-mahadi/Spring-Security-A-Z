package io.mtech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.mtech.model.Notice;
import io.mtech.repository.NoticeRepository;

@RestController
public class NoticesController {
	@Autowired
	private NoticeRepository noticeRepository;

	@GetMapping("/notices")
	public List<Notice> getNoticessDetails() {
		List<Notice> notices = noticeRepository.findAllActiveNotices();
		if (notices != null) {
			return notices;
		} else {
			return null;
		}
	}
}
