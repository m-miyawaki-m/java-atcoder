import java.util.Scanner;
import java.util.ArrayList;

class Main {
	static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		ArrayList<int[]> ary = new ArrayList<>();
		init(ary,N);
		for(int i = 0;i < Q;i++){
  		int mode = sc.nextInt();
  		switch(mode){
  		  case 1:
  		    String dir = sc.next();
  		    move(ary,dir);
  		    break;
  		  case 2:
  		    int pos = sc.nextInt();
  		    ans(ary,pos);
  		    break;
  		}
		}
  }
  static void move(ArrayList<int[]> ary,String dir){
    int[] head = ary.get(count-1);
    switch(dir){
      case "U":
        ary.add(new int[]{head[0],head[1]+1});
        break;
      case "D":
        ary.add(new int[]{head[0],head[1]-1});
        break;
      case "R":
        ary.add(new int[]{head[0]+1,head[1]});
        break;
      case "L":
        ary.add(new int[]{head[0]-1,head[1]});
        break;
    }
    count++;
  }
  static void init(ArrayList<int[]> ary,int N){
    for(int i = N;i > 0;i--){
      ary.add(new int[]{i,0});
    }
    count = N;
  }
  static void ans(ArrayList<int[]> ary,int pos){
    int[] temp = ary.get(count-pos);
    System.out.println(temp[0]+" "+temp[1]);
  }
}