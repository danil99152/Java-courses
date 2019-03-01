/*
3.9 Во входном текстовом файле дан список студентов и их оценок по предметам: в каждой строке вначале фамилия студента, затем название предмета, затем целое число -
оценка от 2 до 5. Фамилии могут повторяться, предметы могут повторяться. Вывести в
первый выходной файл список студентов и их средних оценок, во второй файл - список предметов и средних оценок по ним.
*/

package mypackage;

import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final int n = 100;
		Student students[] = new Student[n];
		File f = new File("C:\\Users\\Danil\\IdeaProjects\\3.9.2\\src\\mypackage\\Input.txt");
		int count = 0;

		try {
			FileReader fr = new FileReader(f);
			Scanner scan = new Scanner(fr);

			while (scan.hasNext()) {
				String name = scan.next();
				String subject = scan.next();
				if(scan.hasNextInt()) {
					int rating = scan.nextInt();
					students[count++] = new Student(name, subject, rating);
				}
			}
			scan.close();
		} catch (FileNotFoundException e) {
			System.err.println(e);
		}

		for(int i = 0; i < count; i++) {
			if(!students[i].hasBeen) {
				int sum = students[i].getRating();
				int average = 1;
				for(int j = i+1; j < count; j++) {
					if(students[i].getName().equals(students[j].getName())) {
						sum += students[j].getRating();
						students[j].hasBeen = true;
						average++;
					}
				}
				setInOut("C:\\Users\\Danil\\IdeaProjects\\3.9.2\\src\\mypackage\\Output1.txt", students[i].getName(), (double)sum/average);
			}
		}

		for(int i = 0; i < count; i++) {
			students[i].hasBeen = false;
		}

		for(int i = 0; i < count; i++) {
			if(!students[i].hasBeen) {
				int sum = students[i].getRating();
				int average = 1;
				for(int j = i+1; j < count; j++) {
					if(students[i].getSubject().equals(students[j].getSubject())) {
						sum += students[j].getRating();
						students[j].hasBeen = true;
						average++;
					}
				}
				setInOut("C:\\Users\\Danil\\IdeaProjects\\3.9.2\\src\\mypackage\\Output2.txt", students[i].getSubject(), (double)sum/average);
			}
		}
	}

	public static void setInOut(String fileName, String name, double rating) {
		try {
			PrintWriter pw = new PrintWriter(
				new BufferedWriter(
						new FileWriter(
								new File(fileName), true
						)
				)
			);
			pw.println(name + " " + rating);
			pw.close();
			System.out.println("Запись добавлена!");
		} catch (IOException e) {
			System.err.println("Ошибка: " + e);
			System.exit(1);
		}
	}
}