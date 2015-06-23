package basic;

import benchmark.internal.Benchmark;
import benchmark.objects.A;
import benchmark.objects.B;

/*
 * @testcase Method2
 * @version 1.0
 * @author Johannes Sp�th, Nguyen Quang Do Lisa (Secure Software Engineering Group, Fraunhofer Institute SIT)
 * 
 * @description Alias in a method
 * 
 */
public class Method2 {

	public Method2() {
	}

	public void alloc(A x, A y) {
		x.f = y.f;
	}

	public static void main(String[] args) {

		A a = new A();
		A b = new A();

		Benchmark.alloc(1);
		b.f = new B();
		Method2 m2 = new Method2();
		m2.alloc(a, b);

		B x = a.f;
		B y = b.f;
		Benchmark
				.test("x",
						"{allocId:1, mayAlias:[x,y], notMayAlias:[a,b,m2], mustAlias:[x,y], notMustAlias:[a,b,m2]}");
	}
}
