package repository;

import model.GTDList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public interface GTDListRepository extends JpaRepository <GTDList, Long> {

    List<GTDList> findGTDListByDeadLineDateAfterOrderByDeadLineDateAsc(LocalDate today);
}
