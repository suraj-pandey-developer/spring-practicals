package searching.and.filtering.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table
@Data
public class Nominee {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator", parameters = {
            @org.hibernate.annotations.Parameter(name = "UUID_gen_strategy_class", value = "org.hibernate.id.UUID.CustomVersionOneStrategy") })
    @Column(name = "id", columnDefinition = "BINARY(16)")
    private UUID id;
    private String name;
    private String address;
}
