package repository;

import model.GTD;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GTDRepository extends JpaRepository <GTD, Long> {

    List<GTD> findGTDByItDoneFalseOrderByDeadLineDateDeadLineDateAsc();
}
