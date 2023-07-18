package ru.practicum.main.event.models;

import lombok.*;
import ru.practicum.main.category.models.Category;
import ru.practicum.main.event.enums.State;
import ru.practicum.main.user.models.User;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String annotation;
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;
    @Column(nullable = false)
    private boolean paid;
    @Column(nullable = false)
    private LocalDateTime eventDate;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User initiator;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private int participantLimit;
    @Column(nullable = false)
    private LocalDateTime createdOn;
    @ManyToOne
    @JoinColumn(name = "location_id", referencedColumnName = "id")
    private Location location;
    @Column(nullable = false)
    private boolean requestModeration;
    @Column
    private LocalDateTime publishedOn;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private State state;
}
