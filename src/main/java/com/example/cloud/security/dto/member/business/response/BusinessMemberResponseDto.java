package com.example.cloud.security.dto.member.business.response;

import java.time.LocalDate;

public record BusinessMemberResponseDto(
        Long id,
        String businessName,
        Long businessNumber,
        String businessAddress,
        LocalDate businessStartDate,
        String businessPhoneNumber,
        String businessEmail
){
}
