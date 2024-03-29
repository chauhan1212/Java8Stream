# Java8Stream

- allMatch(Predicate<? super T> predicate)

> Returns whether all elements of this stream match the provided predicate.


- anyMatch(Predicate<? super T> predicate)

> Returns whether any elements of this stream match the provided predicate.


- noneMatch(Predicate<? super T> predicate)

> Returns whether no elements of this stream match the provided predicate.


- forEach(Consumer<? super T> action)

> Performs an action for each element of this stream.


- forEachOrdered(Consumer<? super T> action)

> Performs an action for each element of this stream, in the encounter order of the stream if the stream has a defined encounter order.


- min(Comparator<? super T> comparator)

> Returns the minimum element of this stream according to the provided Comparator.


- findAny()

> Returns an Optional describing some element of the stream, or an empty Optional if the stream is empty.


- 	findFirst()

> Returns an Optional describing the first element of this stream, or an empty Optional if the stream is empty.


- toArray()

> Returns an array containing the elements of this stream.


- distinct()

> Returns a stream consisting of the distinct elements (according to Object.equals(Object)) of this stream.
				

- filter(Predicate<? super T> predicate)

> Returns a stream consisting of the elements of this stream that match the given predicate.

- limit(long maxSize)

> Returns a stream consisting of the elements of this stream, truncated to be no longer than maxSize in length.

- map(Function<? super T,? extends R> mapper)

> Returns a stream consisting of the results of applying the given function to the elements of this stream.

- skip(long n)

> Returns a stream consisting of the remaining elements of this stream after discarding the first n elements of the stream.

