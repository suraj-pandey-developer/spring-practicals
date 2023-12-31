package searching.and.filtering.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "USER_MASTER")
@Data
public class User extends BaseTimeDao{
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator", parameters = {
            @org.hibernate.annotations.Parameter(name = "UUID_gen_strategy_class", value = "org.hibernate.id.UUID.CustomVersionOneStrategy") })
    @Column(name = "id", columnDefinition = "BINARY(16)")
    private UUID id;
    @Column(name = "USER_NAME")
    private String name ;
    @Column(name = "USER_GENDER")
    private String gender ;
    @Column(name = "USER_COUNTRY")
    private String country ;
    @Column(name = "USER_AGE")
    private Integer age ;

    @OneToMany(mappedBy = "user")
    private Nominee nominee;
}
