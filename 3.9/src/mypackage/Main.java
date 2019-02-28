/*
3.9 Во входном текстовом файле дан список студентов и их оценок по предметам: в каждой строке вначале фамилия студента, затем название предмета, затем целое число -
оценка от 2 до 5. Фамилии могут повторяться, предметы могут повторяться. Вывести в
первый выходной файл список студентов и их средних оценок, во второй файл - список предметов и средних оценок по ним.
*/

package mypackage;

import java.io.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        ArrayList<Subject> subjects  = new ArrayList<>();

        File file1 = new File("C:", "Input.txt");
        System.out.println("Open file ");

        try {
            Scanner scanner = new Scanner(file1);
            while(scanner.hasNextLine()) {
                String line1 = scanner.next();
                String line2 = scanner.next();
                Integer line3= scanner.hashCode();
                boolean flag = true;
                Student student = new Student("");
                Subject subject = new Subject("");
            // ищем студента и добавляем оценку
                for(Student k:students) {
            //System.out.println(k.name);
                    if(k.name.equals(line1)){
                        student = k;
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    student = new Student(line1);
                    students.add(student);
                }
                student.addPoint(line3);

            // ищем предмет, и добавляем оценку
                for(Subject k:subjects) {
                    System.out.println(k.name);
                    if(k.name.equals(line2)){
                        subject = k;
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    subject = new Subject(line2);
                    subjects.add(subject);
                }
                subject.addPoint(line3);
            }
        } catch(IOException ex) {
            System.err.println("Err");
        }

        System.out.println("Open file1 ");
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C://Output1.txt"))) {
            //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C://Output1.txt"));

            for(Student k:students) {
                k.averagePoint();
                bufferedWriter.write(k.name+"\n");
                //bufferedWriter.write(""+num);
                //bufferedWriter.write(k.name + " "+num+'\n');

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Open file2 ");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C://Output2.txt"))){


            for(Subject k: subjects) {
                double num=k.averagePoint();
                bufferedWriter.write(k.name + " "+num);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}