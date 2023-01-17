/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author sowad
 */
public class studentList {
    public static void main(String[] args) {
        
        //Student s1 = new Student('s1', 'Sid');
        Student[] studentList = new Student[3];
        studentList[0] = new Student['s1', 'sid'];
        studentList[1] = new Student['s2', 'ronny'];
        studentList[2] = new Student['s3', 'coleman'];
        
        for(int i=0;i<studentList.length;i++) {
            System.out.println(studentList[i].getStudentName());
        }
    }//end of main
}//emd of class
