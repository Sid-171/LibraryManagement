package com.library.libraryManage.service;
import com.library.libraryManage.entity.Info;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LibInfo {

    List<Info> getAllBooks();

    Info createBooks(Info Book1);

    Info updateBook(Info Book2);

    Info deleteBook(Info Book3);
}
