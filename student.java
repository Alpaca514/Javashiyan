package Test;
class student extends people {
        course z;
        student(int number, String name, String sex,course z){
            super( number,  name,  sex);
            setZ(z);

        }
        public course getZ() {
            return z;
        }

        public void setZ(course z) {
            this.z = z;
        }
        public String toString() {
            return "编号："+number+",姓名："+name+",所选课程："+z;
        }
    }

