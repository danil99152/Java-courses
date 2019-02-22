/*
 * Во входном текстовом файле дан список студентов и их оценок 
 * по предметам: в каждой строке вначале фамилия студента, 
 * затем название предмета, затем целое число -
оценка от 2 до 5. Фамилии могут повторяться, предметы могут повторяться. Вывести в
первый выходной файл список студентов и их средних оценок,
 во второй файл - список предметов и средних оценок по ним.
 * 
 * 
 */

package Main;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Player>players =new ArrayList<>();
		ArrayList<Player>subject =new ArrayList<>();
		
		
		File file1 = new File("C:\\Pony", "Input.txt");
		System.out.println("Open file ");
		
		
		try {
			
			Scanner scanner = new Scanner(file1);
			while(scanner.hasNextLine()) {
			String line1= scanner.next();
			String line2= scanner.next();
			Integer line3= scanner.nextInt();
			boolean flag=true;
			boolean flag1=true;
			Player player= new Player("");
			
			// ищем студента и добавляем оценку
			for(Player k:players) {
				//System.out.println(k.name);
				if(k.name.equals(line1)){
					player=k;
					flag=false;
					break;
				}
			}
			if(flag) {
				player=new Player(line1);
				players.add(player);
			}
			
			player.addPoint(line3);
			
			
			/// ищем предмет, и добавляем оценку
			for(Player k:players) {
				System.out.println(k.name);
				if(k.name.equals(line2)){
					player=k;
					flag=false;
					break;
				}
			}
			if(flag) {
				player=new Player(line2);
				players.add(player);
			}
			
			player.addPoint(line3);
					
			}	
			
			
			
			
		}catch(FileNotFoundException exc) {
			System.err.println("Err");
		}
		
		System.out.println("Open file1 ");
		double num=0;
		try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C://Pony//Output1.txt"))) {
			//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C://Pony//Output1.txt"));
		
		for(Player k:players) {
		num=k.averagePoint();
		bufferedWriter.write(k.name+"\n");
		//bufferedWriter.write(""+num);
		//bufferedWriter.write(k.name + " "+num+'\n');
		
		}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println("Open file2 ");
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C://Pony//Output2.txt"))){
			
			
		for(Player k:subject) {
		num=k.averagePoint();	
		bufferedWriter.write(k.name + " "+num);	
		}
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
	}
		




