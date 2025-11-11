package ua.opnu;

public class GenericThreeTuple<T, V, S> {
    public final GenericTwoTuple<T, V> tuple;
    public final S third;

    public GenericThreeTuple(T first, V second, S third) {
        this.tuple = new GenericTwoTuple<>(first, second);
        this.third = third;
    }

    @Override
    public String toString() {
        return "(" + tuple.first + ", " + tuple.second + ", " + third + ")";
    }
}
