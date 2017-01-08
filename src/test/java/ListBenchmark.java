import org.junit.Test;
import me.geso.nanobench.Benchmark;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListBenchmark {

  @Test
  public void bench() throws Exception {
    new Benchmark(new ListBenchmarkInner()).warmup(10).runByTime(3).timethese().cmpthese();
  }

  public static class ListBenchmarkInner {
    @Benchmark.Bench
    public void arrayList() {
      List<Integer> l = new ArrayList<>();
      for (int i = 0; i < 1_000_000; ++i) {
        l.add(i);
      }
    }

    @Benchmark.Bench
    public void linkedList() {
      List<Integer> l = new LinkedList<>();
      for (int i = 0; i < 1_000_000; ++i) {
        l.add(i);
      }
    }
  }
}