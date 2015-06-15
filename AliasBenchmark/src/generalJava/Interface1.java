package generalJava;

import benchmark.internal.Benchmark;
import benchmark.objects.A;
import benchmark.objects.G;
import benchmark.objects.H;

/*
 * @testcase Interface1
 * @version 1.0
 * @author Secure Software Engineering Group (SSE), Fraunhofer Institute SIT
 * 
 * @description Alias from method in interface
 * 
 */
public class Interface1 {

	public static void main(String[] args) {

		A a = new A();
		Benchmark.alloc(1);
		A b = new A();

		G g = new G();
		H h = new H();
		g.foo(a);
		A c = h.foo(b);
		Benchmark
				.test("c",
						"{allocId:1, mayAlias:[c,b], notMayAlias:[a,g,h], mustAlias:[c,b], notMustAlias:[a,g,h]}");
	}
}
