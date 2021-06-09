package br.com.globallabs.springweb.controller;


import br.com.globallabs.springweb.dto.MessageSend;
import br.com.globallabs.springweb.dto.ResultBotTelegramList;
import br.com.globallabs.springweb.service.Telegram;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/telegram")
public class TelegramController {

    private Telegram telegram;
    private ObjectMapper objectMapper;

    public TelegramController(Telegram soldadoService, ObjectMapper objectMapper) {
        this.telegram = soldadoService;
        this.objectMapper = objectMapper;
    }

    @PostMapping
    public ResponseEntity criarSoldado(@RequestBody MessageSend messageRequest) {
        System.out.println("Entrou no post");
        telegram.enviarMensagem(messageRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<ResultBotTelegramList> buscarSoldados() {
        ResultBotTelegramList getUpdatesResultBotTelegram = telegram.buscarAtualizacao();
        return ResponseEntity.ok(getUpdatesResultBotTelegram);
    }
}
