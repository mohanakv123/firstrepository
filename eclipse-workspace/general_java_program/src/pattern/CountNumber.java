package pattern;

public class CountNumber {
public static void main(String args[]) {
long num=1237878499;
long count=0;
	while(num>0) {
		num=num/10;
		count++;
	}
	System.out.println(count);
}
}
