package generalJava;

import benchmark.internal.Benchmark;
import benchmark.objects.A;
import benchmark.objects.B;

/*
 * @testcase Null1
 * @version 1.0
 * @author Secure Software Engineering Group (SSE), Fraunhofer Institute SIT
 * 
 * @description Direct alias to null
 * 
 */
public class Null1 {

	public static void main(String[] args) {

		// No allocation site
		A h = new A();		
		B a = h.getH();
		B b = a;
		Benchmark.test("b", "{NULLALLOC, mayAlias:[], notMayAlias:[b,a], mustAlias:[b,a], notMustAlias:[i]}");
		Benchmark.use(b);
	}
}
