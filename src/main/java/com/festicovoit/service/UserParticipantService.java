package com.festicovoit.service;

import com.festicovoit.entity.dto.UserParticipantDto;
import javassist.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserParticipantService {

    UserParticipantDto addUserParticipant(UserParticipantDto userToAdd);
    UserParticipantDto updateUserParticipant(UserParticipantDto userDto, Long id) throws NotFoundException;
    UserParticipantDto getUserById(Long id);
    List<UserParticipantDto> getAllUsers();
    UserParticipantDto deleteUserById(Long id);
}
