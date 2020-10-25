package Test;

public class course {
    String number;
    teacher course_teacher;
    String place;
    String time;
    String class_name;

    course(String number, String place, String time, String class_name,teacher course_teacher) {
        setNumber(number);
        setCourse_teacher(course_teacher);
        setPlace(place);
        setTime(time);
        setClass_name(class_name);
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public teacher getCourse_teacher() {
        return course_teacher;
    }
    public void setCourse_teacher(teacher course_teacher) {
        this.course_teacher = course_teacher;
    }
    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getClass_name() {
        return class_name;
    }
    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }
    public String toString(){
        return "课程编码："+number+",老师："+course_teacher+",地点："+place+",时间:"+time+",课程名称："+class_name;
    }
}

