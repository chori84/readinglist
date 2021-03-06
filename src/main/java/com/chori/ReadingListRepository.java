package com.chori;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by HeeChul on 2016. 9. 15..
 */
public interface ReadingListRepository extends JpaRepository<Book, Long> {
    List<Book> findByReader(String reader);
}
