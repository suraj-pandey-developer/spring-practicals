package searching.and.filtering.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_MASTER")
@Data
public class User {
    @Id
    @Column(name = "USER_ID")
    private Integer id ;
    @Column(name = "USER_NAME")
    private String name ;
    @Column(name = "USER_GENDER")
    private String gender ;
    @Column(name = "USER_COUNTRY")
    private String country ;
    @Column(name = "USER_AGE")
    private Integer age ;
}
