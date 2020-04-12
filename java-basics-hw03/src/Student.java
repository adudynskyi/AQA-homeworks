public class Student {
  private int rating;
  private String name;
  public static int counter = 0;
  public static int ratingSum = 0;


  public Student(String name) {
    this.name = name;
    counter++;
  }

  public Student(String name, int rating) {
    this.rating = rating;
    this.name = name;
  }

  public Student(){

  }

  public int getRating() {
    return this.rating;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
    counter++;
  }

  public void setRating(int rating) {
    ratingSum = ratingSum - this.rating;
    this.rating = rating;
    ratingSum = ratingSum + rating;

  }

  public boolean betterStudent(Student student) {
    return this.rating > student.rating;
  }

  public static void removeStudent(Student student) {
    student.name = null;
    student.rating = 0;
    counter = 0;
    ratingSum = 0;
  }

  public static double getAvgRating() {
    double avg = 0.0;
    if (counter > 0) {
      avg = (double) Student.ratingSum / Student.counter;
    }
    return avg;
  }

  public void changeRating(int rating) {
    ratingSum = ratingSum - this.rating;
    this.rating = rating;
    ratingSum = ratingSum + rating;
  }



  @Override
  public String toString() {
    return this.name + ", " + rating;
  }


  public static void main(String[] args) {
    Student st1 = new Student();
    st1.setName("Oleksandr");
    st1.setRating(8);

    Student st2 = new Student();
    st2.setName("Yuriy");
    st2.setRating(9);

    Student st3 = new Student();
    st3.setName("Andriy");
    st3.setRating(10);

    System.out.println(Student.getAvgRating());
    st1.changeRating(11);
    System.out.println(Student.getAvgRating());
  }
}
