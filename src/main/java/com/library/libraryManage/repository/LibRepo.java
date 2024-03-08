package com.library.libraryManage.repository;

import com.library.libraryManage.entity.Info;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface LibRepo extends JpaRepository<Info, Integer> {
}
