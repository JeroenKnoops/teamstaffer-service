package com.teamstaffer.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import lombok.*;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Table(name = "allocation")
@EqualsAndHashCode(exclude = {"id", "created"})
public class Allocation implements Serializable {
    @Id
    @GeneratedValue
    private final Long id = null;

    @NotEmpty
    @NonNull
    private String activityName;

    @NotEmpty
    @NonNull
    private String projectNumber;

    @NotEmpty
    @NonNull
    private String domain;

    @NotEmpty
    @NonNull
    private String phase;

    @Column(insertable = false)
    @JsonSerialize(using = ToStringSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime created;

}

