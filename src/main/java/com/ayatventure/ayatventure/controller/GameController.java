package com.ayatventure.ayatventure.controller;

import com.ayatventure.ayatventure.DTO.GameDTO;
import com.ayatventure.ayatventure.service.GameService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
@RequestMapping("games")
public class GameController {

    private GameService gameService;

    @PostMapping
    @Transactional
    public ResponseEntity<GameDTO> createGame(@RequestBody GameDTO gameDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(gameService.createGame(gameDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<GameDTO> getGame(@PathVariable("id") Long gameId) {
        return ResponseEntity.ok().body(gameService.getGame(gameId));
    }

    @PutMapping
    public ResponseEntity<GameDTO> updateGame(@RequestBody GameDTO gameUpdated){
        return ResponseEntity.status(HttpStatus.OK).body(gameService.updateGame(gameUpdated));
    }

}
