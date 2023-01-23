package HW_21122022;




public class Student {
        private String name;

        private char sex;
        private int age;
        private Integer course;
        private double avgGrade;

        @Override
        public String toString() {
                return "Student {"
                        + "Name= " + name +" course " + course + '}';
        }

        public Student(String name, char sex, int age, Integer course, double avgGrade) {
                this.name = name;
                this.sex = sex;
                this.age = age;
                this.course = course;
                this.avgGrade = avgGrade;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public char getSex() {
                return sex;
        }

        public void setSex(char sex) {
                this.sex = sex;
        }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public Integer getCourse() {
                return course;
        }

        public void setCourse(Integer course) {
                this.course = course;
        }

        public double getAvgGrade() {
                return avgGrade;
        }

        public void setAvgGrade(double avgGrade) {
                this.avgGrade = avgGrade;
        }
}

