package com.investsmart.system;

import java.time.Instant;

public record SystemStatusResponse(
        String application,
        String status,
        Instant serverTime
) {
}