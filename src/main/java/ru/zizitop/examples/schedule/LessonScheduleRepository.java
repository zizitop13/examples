package ru.zizitop.examples.schedule;

public class LessonScheduleRepository {

    private int i = 0;

    private LessonSchedule[] lessonScheduleArray = new LessonSchedule[10];

    public LessonSchedule findById(Long id){
        for(int j = 0; j < lessonScheduleArray.length; j++){
            if(lessonScheduleArray[j]!=null && lessonScheduleArray[j].id.equals(id)){
                return lessonScheduleArray[j];
            }
        }
        return null;
    }

    public void save(LessonSchedule lessonSchedule){
        if(lessonScheduleArray.length-1 == i){
            LessonSchedule[] bufferedLessonSchedule = new LessonSchedule[lessonScheduleArray.length*2];
            System.arraycopy(lessonScheduleArray, 0, bufferedLessonSchedule, 0, lessonScheduleArray.length);
            lessonScheduleArray = bufferedLessonSchedule;
        }
        this.lessonScheduleArray[i] = lessonSchedule;
        i++;
    }



}
