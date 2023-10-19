package com.tester;
import java.util.Scanner;
import com.util.Point2D; 
public class TesterPoint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Point2D[] point=new Point2D[5];
		
		
		int ch,index=0;
		do {
			System.out.println("Select 1.add point 2.display Point 3.Find Distance 4.compare 5.exit");
			System.out.print("Enter choice :");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter X and Y co-ordinates : ");
				Point2D p=new Point2D(sc.nextFloat(),sc.nextFloat());
				point[index]=p;
				index++;
				break;
			case 2:
				for(int i=0;i<5;i++) {
					if(point[i]!=null)
						point[i].getDetails();
					else
						break;
				}
				break;
			case 4:
				System.out.println("Enter co-ordinates X and Y : ");
				Point2D p1=new Point2D(sc.nextFloat(),sc.nextFloat());
				System.out.println("Enter co-ordinates X and Y : ");
				Point2D p2=new Point2D(sc.nextFloat(),sc.nextFloat());
				if(true == p1.isEquals(p2)) {
					System.out.println("Points are Equal");
				} else {
					System.out.println("Points are Not Equal");
				}
				break;
				
			case 3:
				System.out.println("Enter co-ordinates X and Y : ");
				Point2D pa=new Point2D(sc.nextFloat(),sc.nextFloat());
				System.out.println("Enter co-ordinates X and Y : ");
				Point2D pb=new Point2D(sc.nextFloat(),sc.nextFloat());
				System.out.println(pa.calculateDistance(pb));
				break;
			case 5:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
		} while(ch!=5);
		sc.close();
	}
}