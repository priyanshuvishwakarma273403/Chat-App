package com.chat_app.ChatApplication.controllers;

import com.chat_app.ChatApplication.entities.Message;
import com.chat_app.ChatApplication.entities.Room;
import com.chat_app.ChatApplication.payload.MessageRequest;
import com.chat_app.ChatApplication.repositories.RoomRepository;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@CrossOrigin("http://localhost:5173")
public class ChatController {

    private RoomRepository roomRepository;

    public ChatController(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    private Message sendMessage(
            @DestinationVariable String roomId,
            @RequestBody MessageRequest request
            ){
        Room room = roomRepository.findByRoomId(request.getRoomId());

    }



}
