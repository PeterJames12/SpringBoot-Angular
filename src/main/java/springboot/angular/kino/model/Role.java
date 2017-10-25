package springboot.angular.kino.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Igor Hnes on 10/25/17.
 */
@Setter
@Getter
@Entity
@Table(name = "role")
public class Role extends AbstractEntity {

    @Column(name = "name")
    private String name;
}
