package com.security.fraud.ipFraudChecker.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@Table("ip_info")
public class IpInfoEntity {

    @Id
    private Long id;

    @Column("ip_address")
    private String ipAddress;

    @Column("datetime")
    private String datetime;

    @Column("country")
    private String country;

    @Column("iso_code")
    private String isoCode;

    @Column("languages")
    private String languages;

    @Column("currency")
    private String currency;

    @Column("currency_conversion")
    private String currencyConversion;

    @Column("current_local_time")
    private String currentLocalTime;

    @Column("message_estimated_distance")
    private String messageEstimatedDistance;

    @Column("estimated_distance")
    private Double estimatedDistance;

    @Column("invocations")
    private int invocations;

}
