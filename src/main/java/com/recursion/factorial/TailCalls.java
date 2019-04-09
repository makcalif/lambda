package com.recursion.factorial;

public class TailCalls {
    public static <T> TailCall<T> call (final TailCall<T> nextCall) {
        return nextCall;
    }

    public static <T> TailCall<T> done(final T value) {
        TailCall t =  new TailCall<T>() {
            @Override
            public TailCall<T> apply() {
                throw new Error("not implemented");
            }

            @Override
            public boolean isComplete() {
                return true;
            }

            @Override
            public T result() {
                return value;
            }
        };
        return t;
    }
}
