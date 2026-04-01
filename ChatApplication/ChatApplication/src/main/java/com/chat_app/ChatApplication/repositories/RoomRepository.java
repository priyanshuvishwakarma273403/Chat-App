package com.chat_app.ChatApplication.repositories;

import com.chat_app.ChatApplication.entities.Room;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoomRepository extends MongoRepository<Room, String> {
    Room findByRoomId(String roomId);
}
