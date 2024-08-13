package com.example.groq.groq;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.Map;

@RestController
public class ChatController {

    private final ChatClient chatClient;

    @Autowired
    public ChatController(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    @GetMapping("/ai/generate")
    public Map<String, String> generate(@RequestBody String message) {
        String response = chatClient.prompt().user(message).call().content();
        return Map.of("generation", response);
    }

    @GetMapping("/ai/generateStream")
    public Flux<String> generateStream(@RequestBody String message) {
        return chatClient.prompt().user(message).stream().content();
    }
}
