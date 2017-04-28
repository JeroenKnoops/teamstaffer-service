package com.teamstaffer.model;

        import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
        import com.fasterxml.jackson.databind.annotation.JsonSerialize;
        import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
        import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;

        import lombok.Data;
        import lombok.EqualsAndHashCode;
        import lombok.NoArgsConstructor;
        import lombok.NonNull;
        import lombok.RequiredArgsConstructor;

        import org.hibernate.validator.constraints.NotEmpty;

        import java.io.Serializable;
        import java.time.LocalDateTime;

        import javax.persistence.Column;
        import javax.persistence.Entity;
        import javax.persistence.GeneratedValue;
        import javax.persistence.Id;
        import javax.persistence.Table;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Table(name = "activity")
public class Activity implements Serializable {
    @Id
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
}

