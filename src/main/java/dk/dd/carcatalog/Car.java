package dk.dd.carcatalog;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Car
{

        @javax.persistence.Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Getter
        @Id private Long id;
        @NonNull private String brand;
        @NonNull private int year;
        @NonNull private long km;
        @NonNull private long price;

        public void setId(Long id) {
                this.id = id;
        }

        public Long getId() {
                return id;
        }
}
