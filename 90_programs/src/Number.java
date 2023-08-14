
public class Number {
	
	public void number1() {
		int i = 1;
		while(i<=25) {
			System.out.println(i);
			i++;
		}
	}
	
	public void number2() {
		int i = 25;
		while(i>=1) {
			System.out.println(i);
			i--;
		}
	}
	
	public void number3() {
		int i=1;
		while(i<=100) {
			if(i%2!=0) {
				System.out.println(i);

			}
			i++;
		}
	}
	
	public void number4() {
		int i=1;
		while(i<=100) {
			if(i%2==0) {
				System.out.println(i);

			}
			i++;
		}
	}
	
	public int number5() {
		int i=1,sum=0;
		while(i<=50) {
			if(i%2!=0) {
				sum+=i;
			}
			i++;
		}
		System.out.println(sum);
		return sum;
	}
	
	public int number6() {
		int i=1,sum=0;
		while(i<=50) {
			if(i%2==0) {
				sum+=i;
			}
			i++;
		}
		System.out.println(sum);
		return sum;
	}
	
	public void number7() {
		int i = -45;
		while(i<=45) {
			System.out.println(i);
			i++;
		}
	}
	
	public void number8() {
		int i = 50;
		while(i<=100) {
			System.out.println(i);
			i++;
		}
	}
	
	public void number9() {
		System.out.println(number5()+number6());
	}
	
	public void number10() {
		number3();
		number4();
	}
	
	public void number11() {
		int i = 1;
		while(i<=100) {
			System.out.println(i);
			i++;
		}
	}
	
	public void number12() {
		int i = 100;
		while(i>=1) {
			System.out.println(i);
			i--;
		}
	}
	
	public void number13() {
		int i = 30;
		while(i<=50) {
			System.out.println(i);
			i++;
		}
	}
	
	public void number14() {
		int i=1,count=0;
		while(i<=25) {
			if(i%2!=0) {
				count++;
			}
			i++;
		}
		System.out.println(count);
	}
	
	public void number15() {
		int i=1,count=0;
		while(i<=25) {
			if(i%2==0) {
				count++;
			}
			i++;
		}
		System.out.println(count);
	}
	
	public void number16() {
		int i = 1;
		do {
			System.out.println(i);
			i++;
		}while(i<=25);
	}
	
	public void number17() {
		int j = 25;
		do {
			System.out.println(j);
			j--;
		}while(j>0);
	}
	
	public void number18() {
		int k = 1;
		do {
			if(k%2!=0) {
				System.out.println(k);
			}
			k++;
		}while(k<100);
	}
	
	public void number19() {
		int l = 2;
		do {
			if(l%2==0) {
			System.out.println(l);
			}
			l++;
		}while(l<=100);
	}
	
	public void number20() {
		int m = 1;
		do {
			if(m%2!=0) {
			System.out.println(m);
			}
			m++;
		}while(m<=50);
		
	}
	
	public void number21() {
		int n = 2;
		do {
			if(n%2==0) {
			System.out.println(n);
			}
			n++;
		}while(n<=50);
	}
	
	public void number22() {
		int o = -45;
		do {
			System.out.println(o);
			o++;
		}while(o<= 45);
	}
	
	public void number23() {
		int p = 50;
		do {
			System.out.println(p);
			p++;
		}while(p<= 100);
	}
	
	public void number24() {
		int q = 0;
		int oddSum = 0;
		int evenSum = 0;
		do {
			if(q%2==0) {
				evenSum +=1;
			}else {
				oddSum +=1;
			}
			q++;
		}while(q< 100);
		System.out.println("Odd Sum : "+oddSum+" Even Sum : "+ evenSum);
	}
	
	public void number25() {
		int r = 0;
		do {
			if(r%2==0) {
				System.out.println(r+ " even");
			}else {
				System.out.println(r + " odd");
			}
			r++;
		}while(r<=100);
		
	}
	
	public void number26() {
		int s = 1;
		do {
			System.out.println(s);
			s++;
		}while(s<=100);
		
	}
	
	public void number27() {
		int t = 100;
		do {
			System.out.println(t);
			t--;
		}while(t>0);
	}
	
	public void number28() {
		int u =  30;
		do {
			System.out.println(u);
			u++;
		}while(u<=50);
	}
	
	public void number29() {
		int v = 1;
		int evenSumSec = 0;
		do {
			if(v%2==0) {
				evenSumSec +=1;
			}
			v++;
		}while(v<=25);
		System.out.println("Even Sum : "+ evenSumSec);
	}
	
	public void number30() {
		int w = 1;
		int oddSumSec = 0;
		do {
			if(w%2!=0) {
				oddSumSec +=1;
			}
			w++;
		}while(w<=25);
		System.out.println("Odd Sum : "+oddSumSec);
	}
	
	public void number31() {
		for(int i=1;i<=25;i++) {
			System.out.print(i+" ");
		}
	}
	
	public void number32() {
		for(int i=25;i>=1;i--) {
			System.out.print(i+" ");
			
		}
	}
	
	public void number33() {
		for(int i=1;i<100;i++) {
			if(i%2 !=0) {
				System.out.print(i+" ");
			}
		}
	}
	
	public void number34() {
		for(int i=1;i<100;i++) {
			if(i%2 ==0) {
				System.out.print(i+" ");
			}
		}
	}
	
	public void number35() {
		int a = 0;
		for(int i=1;i<50;i++) {
			if(i%2 !=0) {
				a =a+i;
			}
		}
		System.out.println("sum of 1 to 50 Odd nos " + a);
	}
	
	public void number36() {
		int b = 0;
		for(int i=1;i<50;i++) {
			if(i%2 ==0) {
				b =b+i;
			}
		}
		System.out.println("sum of 1 to 50 Odd nos " + b);
	}
	
	public void number37() {
		for(int i=-45;i<=45;i++) {
			System.out.print(i+" ");
		}
	}
	
	public void number38() {
		for(int i=50;i<=100;i++) {
			System.out.print(i+" ");
		}
	}
	
	public void number39() {
		int c = 0;
		for(int i=1;i<50;i++) {
			if(i%2 !=0) {
				c =c+i;
			}
			else if(i%2==0) {
				c=c+i;
			}
		}
		System.out.println("Sum of odd and even "+ c);

	}
	
	public void number40() {
		for(int i=1;i<100;i++) {
			if(i%2 ==0) {
				System.out.print("Even "+ i+" ");
			}
			else {
				System.out.print("Odd "+ i+" ");
			}
		}
	}
	
	public void number41() {
		for(int i=1;i<=100;i++) {
			System.out.print(i+" ");
		}
	}
	
	public void number42() {
		for(int i=100;i>=1;i--) {
			System.out.print(i+" ");
		}
	}
	
	public void number43() {
		for(int i=30;i<=50;i++) {
			System.out.print(i+" ");
		}
	}
	
	public void number44() {
		int d =0;
		for(int i=1;i<=25;i++) {
			if(i%2==0) {
				d=d+1;
			}
		}
		System.out.println("count of even No 1 to 25 no " + d);
	}
	
	public void number45() {
		int e =0;
		for(int i=1;i<=25;i++) {
			if(i%2!=0) {
				e=e+1;
			}
		}
		System.out.println("count of odd No 1 to 25 no " + e);
	}


	
	
	
	
	
	
	
	

}
