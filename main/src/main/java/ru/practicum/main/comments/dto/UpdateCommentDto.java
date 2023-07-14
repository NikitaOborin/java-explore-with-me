package ru.practicum.main.comments.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateCommentDto {
    private Long id;

    private String nameAuthor;

    private String text;

    private LocalDateTime createdDate;

    private LocalDateTime updateDate;
}
