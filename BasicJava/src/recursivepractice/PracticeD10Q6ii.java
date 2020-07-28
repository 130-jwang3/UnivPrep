package recursivepractice;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class PracticeD10Q6ii {
	public static String[][] maze;
	public static int xStart;
	public static int yStart;
	public static int xEnd;
	public static int yEnd;
	public static int xLength;
	public static int yLength;
	public static int count = 0;
	public static ArrayList<Node> result = new ArrayList<Node>();
	public static Stack<String> finalStack=new Stack<String>();

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		xLength = scanner.nextInt();
		yLength = scanner.nextInt();
		maze = new String[xLength][yLength];
		String line = "";
		for (int i = 0; i < yLength; i++) {
			line = scanner.next();
			stringToMaze(line, i);
		}
		Node s1 = new Node(xStart, yStart, "testing");
		result.add(s1);
		getPath(xStart, yStart, count);
		int tempPointX=0,tempPointY=0;
		finalStack.push("(" + xEnd + "," + yEnd + ")");
		for (int i = 0; i <result.size(); i++) {
			tempPointX = result.get(i).getX();
			tempPointY = result.get(i).getY();
			if (tempPointX==xEnd&&tempPointY==yEnd) {
				String a = result.get(i).getParent();
				tempPointX = Integer.parseInt(a.substring(0, 1));
				tempPointY = Integer.parseInt(a.substring(2, 3));
				
				setResult(tempPointX,tempPointY,i);
				finalStack.push("(" + xStart + "," + yStart + ")");
				break;
			}
		}
		while(!finalStack.isEmpty()){
			String a=finalStack.pop();
			System.out.println(a);
		}
	}
	public static void setResult( int tempPointX,int tempPointY,int i){
		if(result.get(i).getParent().equals("testing")){
			return;
		}else if (result.get(i).getX()==tempPointX&&result.get(i).getY()==tempPointY){
			finalStack.push("(" + tempPointX + "," + tempPointY + ")");
			String a = result.get(i).getParent();
			tempPointX = Integer.parseInt(a.substring(0, 1));
			tempPointY = Integer.parseInt(a.substring(2, 3));
			i--;
			setResult(tempPointX,tempPointY,i);
		}else{
			i--;
			setResult(tempPointX,tempPointY,i);
		}
	}
	public static void getPath(int startX, int startY, int count) {
		int currentX = startX;
		int currentY = startY;
		String parent=(startX+" "+startY);
		count++;
		int i=0;
		do{
			
			if (currentY - 1 >= 0&& (".".equals(maze[currentX][currentY - 1]) || "G".equals(maze[currentX][currentY - 1]))) {
				Node s2 = new Node(currentX, currentY - 1, parent);
				result.add(s2);
			}
			if (currentX - 1 >= 0&& (".".equals(maze[currentX - 1][currentY]) || "G".equals(maze[currentX - 1][currentY]))) {

				Node s2 = new Node(currentX - 1, currentY, parent);
				result.add(s2);
			}
			if (currentY + 1 < yLength&& (".".equals(maze[currentX][currentY + 1]) || "G".equals(maze[currentX][currentY + 1]))) {

				Node s2 = new Node(currentX, currentY + 1, parent);
				result.add(s2);
			}
			if (currentX + 1 < xLength&& (".".equals(maze[currentX + 1][currentY]) || "G".equals(maze[currentX + 1][currentY]))) {
				Node s2 = new Node(currentX + 1, currentY, parent);
				result.add(s2);
			}
			maze[currentX][currentY] = "*";
			i++;
			if("G".equals(maze[currentX][currentY])){
				break;
			}
			if (result.size() >= count) {
				currentX = result.get(count).getX();
				currentY = result.get(count).getY();
				parent=currentX+" "+currentY;
				count++;
				
			} else {
				break;
			}
			
		}while (!"G".equals(maze[currentX][currentY]));
	}

	public static void stringToMaze(String line, int i) {
		for (int j = 0; j < xLength; j++) {
			maze[j][i] = line.substring(j, j + 1);
			findStart(line.substring(j, j + 1), j, i);
		}
	}

	public static void findStart(String one, int j, int i) {
		if (one.equals("S")) {
			xStart = j;
			yStart = i;
		}
		if (one.equals("G")) {
			xEnd = j;
			yEnd = i;
		}
	}
}

class Node {
	private int x, y;
	private String parent;

	public Node(int x, int y, String parent) {
		this.x = x;
		this.y = y;
		this.setParent(parent);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
		return "Node [x=" + x + ", y=" + y + ", parent=" + parent + "]";
	}

}
