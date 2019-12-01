package com.festicovoit.controller;

import com.festicovoit.entity.dto.UserParticipantDto;
import com.festicovoit.service.UserParticipantService;
import javassist.NotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/participant")
public class UserParticipantController {

    private final UserParticipantService userParticipantService;


    public UserParticipantController(UserParticipantService userParticipantService) {
        this.userParticipantService = userParticipantService;
    }

    @PostMapping()
    public UserParticipantDto addUserParticipant (@RequestBody UserParticipantDto userParticipantDto) {
        return userParticipantService.addUserParticipant(userParticipantDto);
    }

    @PutMapping("/{id}")
    public UserParticipantDto updateUserParticipant (@RequestBody UserParticipantDto userParticipantDto,@PathVariable Long id) throws NotFoundException {
        return userParticipantService.updateUserParticipant(userParticipantDto,id );
    }

    @GetMapping()
    public List<UserParticipantDto> getAllUserParticipants () {
        return userParticipantService.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserParticipantDto getUserParticipantById (@PathVariable Long id) {
        return userParticipantService.getUserById(id);
    }

    @DeleteMapping("/{id}")
    public UserParticipantDto deleteUserById (@PathVariable Long id) {
        return userParticipantService.deleteUserById(id);
    }
}
