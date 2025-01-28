package org.example.section1.builder;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        TourPlanBuilder builder = new DefaultTourBuilder();
        TourPlan plan = builder.title("칸쿤 여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2025, 8, 9))
                .whereToStay("리조트")
                .addPlan(0, "체크인하고 짐 풀기")
                .addPlan(0, "점심")
                .getPlan();

        TourPlan longBeachTrip = builder.title("롱비치")
                .startDate(LocalDate.of(2025, 7 ,15))
                .getPlan();

        // director 사용
        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = director.cancunTrip();
        TourPlan tourPlan1 = director.longBeachTrip();
    }
}
