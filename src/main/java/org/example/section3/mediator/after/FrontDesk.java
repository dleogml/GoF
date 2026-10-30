package org.example.section3.mediator.after;

import org.example.section3.mediator.after.CleaningService;

import java.time.LocalDateTime;

// 중재자역할의 클래스
// 모든 컴포넌트들과의 관계는 중재자가 다 가지고 있고
// 클라이언트(여기서는 Guest)는 중재자를 통해서만 필요한 컴포넌트들의 기능을 사용함
public class FrontDesk {
    private CleaningService cleaningService = new CleaningService();

    private Restaurant restaurant = new Restaurant();

    public void getTowers(Guest guest, int numberOfTowers) {
        cleaningService.getTowers(guest.getId(), numberOfTowers);
    }

    public String getRoomNumberFor(Integer guestId) {
        return "1111";
    }

    public void dinner(Guest guest, LocalDateTime dateTime) {
        restaurant.dinner(guest.getId(), dateTime);
    }
}
