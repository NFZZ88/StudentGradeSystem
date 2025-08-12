import java.util.Scanner;

public class StudentGradeSystem{
  public static void main(String[]args{
    Scanner scanner=new Scanner(System.in);

    //input for student info
    System.out.println("Enter student name: ");
    String name=scanner.nextLine();

    //input for the number of subject
    System.out.println("Enter number of subjects: ");
    int subjects=scanner.nextInt();

    int totalMarks=0;

    for(int i=1;i<=subjects;i++){
      System.out.println("Enter marks for subject "+i+":");
      int marks=scanner.nextInt();
      totalMarks +=marks  //totalMarks=totalmarks+marks
      }

    double average=(double)totalMarks/subjects;
    String grade;

    //Grade calculation
    if(average >=80){
      grade="A";
    }else if(average>=60){
      grade="B";
    }else if(average>=50){
      grade="C";
    }else if(average>=40){
      grade="D";
    }else{
      grade="F";
    }

    //output
    System.out.println("---Student Report---");
    System.out.println("Student Name: "+name);
    System.out.println("Total Marks: "+totalMarks);
    System.out.println(Äverage:"+average);
    System.out.println(Grade:"+grade);

    scanner.close();

}
}
