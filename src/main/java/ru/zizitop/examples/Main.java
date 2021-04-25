package ru.zizitop.examples;

import ru.zizitop.examples.schedule.LessonSchedule;
import ru.zizitop.examples.schedule.LessonScheduleRepository;

public class Main {

    public static void main(String[] args) {
        LessonScheduleRepository repository = new LessonScheduleRepository();



        for(int i =0; i < 1000; i ++){
            LessonSchedule lessonSchedule = new LessonSchedule();
            lessonSchedule.id = (long) i;
            repository.save(lessonSchedule);
        }



        LessonSchedule schedule = repository.findById(0L);
        System.out.println(schedule);
    }
}
