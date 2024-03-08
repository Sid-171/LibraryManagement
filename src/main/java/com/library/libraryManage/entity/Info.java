package com.library.libraryManage.entity;


import jakarta.persistence.*;
import lombok.*;


import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table
public class Info {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int BookId;

    private String BookName;

    private String Sections;

    private String AuthorName;

    @Lob
    private String relatedInfo;
    public Info(int BookId, String BookName, String Sections, String AuthorName){
        this.BookId = BookId;
        this.BookName = BookName;
        this.Sections = Sections;
        this.AuthorName = AuthorName;
    }

    public List<Integer> getRelatedInfoList() {
        return new ArrayList<>();
    }

    public void setRelatedInfoList(List<Integer> relatedInfoList) {
        this.relatedInfo = "Serialized String";
    }

}
