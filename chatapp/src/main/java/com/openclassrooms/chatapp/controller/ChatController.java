package com.openclassrooms.chatapp.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

import com.openclassrooms.chatapp.model.WsChatMessage;

@Controller
public class ChatController {

    @MessageMapping("chat.sendMessage")
    @SendTo("/topic/public")
    public WsChatMessage sendMessage(@Payload WsChatMessage message) {
        System.out.println("Message received from" + message.getSender() + ": " + message.getContent());

        return message;
    }

    @MessageMapping("chat.addUser")
    @SendTo("/topic/chat")
    public WsChatMessage addUser(@Payload WsChatMessage message, SimpMessageHeaderAccessor headerAccessor) {
        // Store the username in the WebSocket session attributes
        headerAccessor.getSessionAttributes().put("username", message.getSender());

        // Log when a user joins the chat
        System.out.println("User joined: " + message.getSender());

        // Broadcast the user join event to all subscribers on the "/topic/chat" topic
        return message;
    }

}
