package com.festicovoit.mapper;

import com.festicovoit.entity.dbo.UserParticipantDbo;
import com.festicovoit.entity.dto.UserParticipantDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface UserParticipantMapper {

    public UserParticipantDbo toDbo(UserParticipantDto userParticipantDto);
}
