
public class Series {
	
	public void series1() {
		int i=2;
		while(i<=20) {
			System.out.print(i+" ");
			i+=2;
		}
	}
	
	public void series2() {
		int i=9;
		while(i<=90) {
			System.out.print(i+" ");
			i+=9;
		}
	}
	
	public void series3() {
		int i=1,j=-2;
		while(i<=9 && j>=-10) {
			System.out.print(i+" "+j+" ");
			i+=2;
			j-=2;
		}		
	}
	
	public void series4() {
		int i=5;
		while(i<=50) {
			System.out.print(i+" ");
			i+=5;
		}
	}
	
	public void series5() {
		int i=1;
		while(i<=1000) {
			System.out.print(i+" ");
			i*=10;
		}
	}
	
	public void series6() {
		int i=1,j=-1;
		while(i<=45) {
			System.out.print(i+" ");
			j++;
			i+=2+j;
		}
	}
	
	public void series7() {
		int i=8;
		while(i<=80) {
			System.out.print(i+" ");
			i+=8;
		}
	}
	
	public void series8() {
		int i=0,j=1;
		while(i<=21) {
			System.out.print(i+" ");
			int c = i+j;
			i=j;
			j=c;
		}
	}
	
	public void series9() {
		int i=1;
		while(i<=10) {
			System.out.print(i*i+" ");
			i++;
		}
	}
	
	public void series10() {
		int i=3;
		while(i<=30) {
			System.out.print(i+" ");
			i+=3;
		}
	}
	
	public void series11() {
		int i=7;
		while(i<=70) {
			System.out.print(i+" ");
			i+=7;
		}
	}
	
	public void series12() {
		int i=4;
		while(i<=40) {
			System.out.print(i+" ");
			i+=4;
		}
	}
	
	public void series13() {
		int i=10;
		while(i<=100) {
			System.out.print(i+" ");
			i+=10;
		}
	}
	
	public void series14() {
		int i=1,j=4;
		while(i<=5) {
			System.out.print(i+" ");
			i++;
		}
		while(j>=1) {
			System.out.print(j+" ");
			j--;
		}
	}
	
	public void series15() {
		int i=6;
		while(i<=60) {
			System.out.print(i+" ");
			i+=6;
		}
	}
	
	public void series16() {
		int x = 2;
		do {
			System.out.print(x+" ");
			x+=2;
		}while(x<=20);
	}
	
	public void series17() {
		int y = 9;
		do {
			System.out.print(y+" ");
			y+=9;
		}while(y<=90);
	}
	
	public void series18() {
		int z = 1;
		int temp = 0;
		do {
			if(z%2 == 0) {
				temp = z;
				temp = z *-1;
				System.out.print(temp+" ");
			}else{
				System.out.print(z+" ");
			}
			z++;
		}while(z<=10);
	}
	
	public void series19() {
		int a = 5;
		do {
			System.out.print(a+" ");
			a+=5;
		}while(a<=50);
	}
	
	public void series20() {
		int b = 1;
		do {
			System.out.print(b+" ");
			b = b*10;
		}while(b<=1000);
	}
	
	public void series21() {
		int c = 1;
		int tem = 1;
		do {
			System.out.print(c+" ");
			tem++;
			c += tem;
		}while(c <=45);
	}
	
	public void series22() {
		int d = 8;
		do {
			System.out.print(d+" ");
			d+=8;
		}while(d<=80);
	}
	
	public void series23() {
		int count = 0;
		int firstTerm = 0;
		int secTerm = 1;
		int nextTerm = 0;
		 	
		do {
			System.out.print(firstTerm+" ");
			nextTerm = firstTerm + secTerm;
			firstTerm = secTerm;
			secTerm = nextTerm;
			count++;
		
		}while(count<9);
	}
	
	public void series24() {
		int g = 1;
		do {
			System.out.print(g*g+" ");
			g++;
		}while(g<=10);
	}
	
	public void series25() {
		int h = 3;
		do {
			System.out.print(h+" ");
			h+=3;
		}while(h<=30);
	}
	
	public void series26() {
		int aa = 7;
		do {
			System.out.print(aa+" ");
			aa+=7;
		}while(aa<=70);
	}
	
	public void series27() {
		int bb = 4;
		do {
			System.out.print(bb+" ");
			bb+=4;
		}while(bb<=40);
	}
	
	public void series28() {
		int cc = 1;
		do {
			System.out.print(cc*10+" ");
			cc++;
		}while(cc<=10);
	}
	
	public void series29() {
		int dd = 1;
		int te = 4;
		do {
			if(dd <= 5) {
				System.out.print(dd+" ");
			}
			if(dd>5) {
				System.out.print(te+" ");
				te--;
			}
			dd++;
		}while(dd<10);
	}
	
	public void series30() {
		int ee = 6;
		do {
			System.out.print(ee+" ");
			ee+=6;
		}while(ee<=60);
	}
	
	public void series31() {
		for(int i=2;i<=20;i+=2) {
			System.out.print(i+" ");
			
		}
	}
	
	public void series32() {
		for(int i=9;i<=90;i+=9) {
			System.out.print(i+" ");
			
		}
	}
		
	public void series33() {
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
			else {
				System.out.print("-"+i+" ");
				
			}
		}
	}
	
	public void series34() {
		for(int i=1;i<=50;i++) {
			if(i%5==0) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void series35() {
		for(int i=1;i<=1000;i*=10) {
			System.out.print(i + " ");		
		}
	}
	
	public void series36() {
		int f = 0;
		for(int i=1;i<=10;i++) {
			System.out.print(f + " ");
			f=i+f;

		}
	}
	
	
	public void series37() {
		for(int i=8;i<=80;i+=8) {
			System.out.print(i + " ");
				
		}
	}
	
	public void series38() {
		int g =0;
		int x =1;
		for(int i=1;i<=10;i++) {
			System.out.print(g + " ");
			int z = g+x;
			g=x;
			x=z;
		}
	}
	
	public void series39() {
		for(int i=1;i<=10;i++) {
			System.out.print(i*i + " ");
		}
	}
	
	public void series40() {
		for(int i=1;i<=10;i++) {
			System.out.print(i*3 + " ");
		}
	}
	
	public void series41() {
		for(int i=1;i<=10;i++) {
			System.out.print(i*7 + " ");
		}
	}
	
	public void series42() {
		for(int i=1;i<=10;i++) {
			System.out.print(i*4 + " ");
		}
	}
	
	public void series43() {
		for(int i=1;i<=10;i++) {
			System.out.print(i*10 + " ");
		}
	}
	
	public void series44() {
		for(int i=1;i<=5;i++) {
			System.out.print(i + " ");
		}
		for(int i=4;i>=1;i--) {
			System.out.print(i + " ");
		}
	}
	
	public void series45() {
		for(int i=1;i<=10;i++) {
			System.out.print(i*6 + " ");
		}
	}


	
	
	
	
	

}
