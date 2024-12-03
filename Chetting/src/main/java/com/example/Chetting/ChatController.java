package com.example.Chetting;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/sendMessage") // Matches "/app/sendMessage" from the client
    @SendTo("/topic/messages")     // Broadcasts to "/topic/messages"
    public ChatMessage send(ChatMessage message) {
        // Add optional processing logic here (e.g., timestamping)
        message.setTimestamp(java.time.LocalDateTime.now().toString());
        return message;
    }
}
