package io.mtech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.mtech.model.Notice;

@Repository
public interface NoticeRepository extends CrudRepository<Notice, Long> {
	@Query(value = "from Notice n where CURDATE() BETWEEN noticeBegDt AND noticeEndDt")
	List<Notice> findAllActiveNotices();
}
