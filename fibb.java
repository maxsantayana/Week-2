import acm.program.*;
public class fibb extends ConsoleProgram{ 
	private static final int MAX_TERM_VALUE = 10000;
public void run () {
		println("the fib");
		int fib1=0; int fib2=1;
			for(fib1=0; fib1<= MAX_TERM_VALUE;){
				println(fib1);
				int fib3=fib1+fib2;
				//not mathematically correct but makes sense//
				fib1=fib2;
				fib2=fib3;
				
}println("done");
}}