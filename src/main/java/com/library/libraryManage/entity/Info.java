package com.library.libraryManage.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Info {
    private int BookId;
    private String BookName;
    private String Sections;
    private String AuthorName;

    List<Info> info = new ArrayList<>();
    public Info(int BookId, String BookName, String Sections, String AuthorName){
        this.BookId = BookId;
        this.BookName = BookName;
        this.Sections = Sections;
        this.AuthorName = AuthorName;
    }

}
