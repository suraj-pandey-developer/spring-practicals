package searching.and.filtering.model;

import jdk.jfr.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Data
@MappedSuperclass
public class BaseTimeDao {
    @Column(name = "created_at")
    protected long createdAt ;
    @Column(name = "updated_at")
    protected long updatedAt ;
    @PrePersist
    void onCreate() {
        createdAt = Instant.now().toEpochMilli();
        updatedAt = Instant.now().toEpochMilli();
    }
    @PreUpdate
    void onUpdate() {
        updatedAt = Instant.now().toEpochMilli();
    }
}
