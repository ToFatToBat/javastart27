package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class GTDList {

    @Id
    @GeneratedValue
    private Long id;
    private String toDo;
    private String description;
    private boolean isItDone;
    private Date deadLineDate;

    public GTDList() {
    }

    public GTDList(Long id, String toDo, String description, boolean isItDone, Date deadLineDate) {
        this.id = id;
        this.toDo = toDo;
        this.description = description;
        this.isItDone = isItDone;
        this.deadLineDate = deadLineDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getToDo() {
        return toDo;
    }

    public void setToDo(String toDo) {
        this.toDo = toDo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isItDone() {
        return isItDone;
    }

    public void setItDone(boolean itDone) {
        isItDone = itDone;
    }

    public Date getDeadLineDate() {
        return deadLineDate;
    }

    public void setDeadLineDate(Date deadLineDate) {
        this.deadLineDate = deadLineDate;
    }
}
