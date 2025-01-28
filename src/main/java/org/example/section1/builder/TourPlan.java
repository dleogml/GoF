package org.example.section1.builder;

import java.time.LocalDate;
import java.util.List;

public class TourPlan {
    private final String title;
    private final int nights;
    private final int days;
    private final LocalDate startDate;
    private final String whereToStay;
    private final List<DetailPlan> plans;

    public TourPlan(String title, int nights, int days, LocalDate startDate, String whereToStay, List<DetailPlan> plans) {

        this.title = title;
        this.nights = nights;
        this.days = days;
        this.startDate = startDate;
        this.whereToStay = whereToStay;
        this.plans = plans;
    }
}
