package sg.edu.nus.iss;

@FunctionalInterface
public interface MyRunnerableInterface<T>{

    
    T process (T a, T b);
}
