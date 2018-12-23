package test;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.ArrayList;
import java.util.List;

@State(Scope.Benchmark)
public class MyJMHTest01 {

    List<String> list = new ArrayList<>(1000000);

    @Setup
    public void setup() {
        for (int i = 0; i < 1000000; i++) {
            list.add(String.valueOf(i));
        }
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void test() {
//        list.forEach(l -> {
//            if (l.equals("999999")) {
//            }
//        });
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("999999")) {

            }
        }
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(MyJMHTest01.class.getSimpleName())
                .threads(4)
                .forks(1)
                .build();

        new Runner(opt).run();
    }
}
