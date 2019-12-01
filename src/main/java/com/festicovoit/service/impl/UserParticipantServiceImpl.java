package com.festicovoit.service.impl;

import com.festicovoit.entity.dbo.UserParticipantDbo;
import com.festicovoit.entity.dto.UserParticipantDto;
import com.festicovoit.mapper.UserParticipantMapper;
import com.festicovoit.repository.UserParticipantRepository;
import com.festicovoit.repository.UserRepository;
import com.festicovoit.service.UserParticipantService;
import javassist.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserParticipantServiceImpl implements UserParticipantService {

    private final UserRepository userRepository;
    private final UserParticipantMapper userParticipantMapper;
    private final UserParticipantRepository userParticipantRepository;


    public UserParticipantServiceImpl(UserRepository userRepository, UserParticipantMapper userParticipantMapper, UserParticipantRepository userParticipantRepository) {
        this.userRepository = userRepository;
        this.userParticipantMapper = userParticipantMapper;
        this.userParticipantRepository = userParticipantRepository;

    }
    @Override
    public UserParticipantDto addUserParticipant(UserParticipantDto userToAdd) {
        userRepository.save(userParticipantMapper.toDbo(userToAdd));
        return userToAdd;
    }

    @Override
    public UserParticipantDto updateUserParticipant(UserParticipantDto userWithData, Long id) throws NotFoundException {
       if (userParticipantRepository.findById(id).isPresent()) {
           UserParticipantDbo userReadyForUpdate = userParticipantMapper.toDbo(userWithData);
           userParticipantRepository.save(userReadyForUpdate);
           return userWithData;
        }
       throw new NotFoundException ("Cannot find user in db");

    }


    @Override
    public UserParticipantDto getUserById(Long id) {
        return null;
    }

    @Override
    public List<UserParticipantDto> getAllUsers() {
        return null;
    }

    @Override
    public UserParticipantDto deleteUserById(Long id) {
        return null;
    }
}
