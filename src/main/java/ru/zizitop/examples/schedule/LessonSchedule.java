package ru.zizitop.examples.schedule;

import java.time.DayOfWeek;

public class LessonSchedule {

    public Long id;

    public DayOfWeek dayOfWeek;

    public Integer hour;

    public Integer minute;

    public boolean canceled;

    @Override
    public String toString() {
        return "LessonSchedule{" +
                "id=" + id +
                ", dayOfWeek=" + dayOfWeek +
                ", hour=" + hour +
                ", minute=" + minute +
                ", canceled=" + canceled +
                '}';
    }
}
