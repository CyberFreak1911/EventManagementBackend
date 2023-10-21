package com.yusacapraz.event.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "event_details")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class EventDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "event_details_id")
    private UUID eventDetailsId;

    @Column(name = "event_description")
    private String eventDescription;

    @Column(name = "event_time")
    private LocalDateTime eventTime;

    @Column(name = "participant_quote")
    private Integer participantQuote;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "categoryId")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "address_id", referencedColumnName = "addressId")
    private Address address;
}
