package org.example.section3.mediator.after;

import java.time.LocalDateTime;

public class Guest {
    private Integer id;

    // FrontDesk(중재자)만 알고 있으면 됨(의존성이 줄어듬)
    private FrontDesk frontDesk = new FrontDesk();

    public void getTowers(int numberOfTowers) {
        this.frontDesk.getTowers(this, numberOfTowers);
    }

    private void dinner(LocalDateTime dateTime) {
        this.frontDesk.dinner(this, dateTime);
    }

    // Getter and Setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
