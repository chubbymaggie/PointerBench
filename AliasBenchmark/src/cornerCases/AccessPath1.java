package cornerCases;

import benchmark.internal.Benchmark;
import benchmark.objects.A;

/*
 * @testcase AccessPath1
 * @version 1.0
 * @author Johannes Sp�th, Nguyen Quang Do Lisa (Secure Software Engineering Group, Fraunhofer Institute SIT)
 * 
 * @description Support of access paths
 * 
 */
public class AccessPath1 {

	public static void main(String[] args) {

		Benchmark.alloc(1);
		A a = new A();
		A b = new A();

		a.f = b.f;
		Benchmark
				.test("b.f",
						"{allocId:1, mayAlias:[a.f,b.f], notMayAlias:[a,b], mustAlias:[a.f,b.f], notMustAlias:[a,b]}");
	}
}
