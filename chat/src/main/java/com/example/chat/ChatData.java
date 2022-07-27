package com.example.chat;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "chat")
public class ChatData {

    @Id
    private String id;
    private String msg;
    private String sender;
    private String receiver;
    private Integer roomNum;

    private LocalDateTime localDateTime;
}
