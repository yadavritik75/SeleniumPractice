package kamalbhai.kamalbhai;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamPractice {
	public static void main(String[] args) {
		// Print all numbers from 1 to 100

		// Stream.iterate(1, n->n+1).limit(100).forEach(System.out::println);

		//   Print all even numbers from 1 to 100.

		//Stream.iterate(2, n->n+2).limit(50).forEach(System.out::println);

		// Print all prime numbers between 1 and 50.

		// Stream.iterate(1, n->n+2).limit(50).forEach(System.out::println);

		/// Print the sum of numbers from 1 to 100.

//		int sum = Stream.iterate(1, n -> n + 1).limit(100).reduce(0, Integer::sum);
//		System.out.println(sum);

		// .reduce(identity, accumulator)
		// identity: The starting value. Here, it's 0.

		// accumulator: A function to combine two elements. Here, it's Integer::sum —
		// which adds two integers

		/// Print the square of all numbers from 1 to 10.
		// Stream.iterate(1, n->n+1).limit(10).map(n->n*n).forEach(System.out::println);

//		List<Integer> list = Arrays.asList(2, 1, 1, 3, 4, 5, 7, 4);
//
//		List<Integer> sortedList = list.stream()
//		                               .distinct()
//		                               .sorted()
//		                               .collect(Collectors.toList());
//		System.out.println(sortedList);
//		
//		System.out.println(sortedList.get(2));

//		
		// Count how many numbers between 1 and 100 are divisible by 3.

//		long counts = Stream.iterate(1, n->n+1).limit(100).filter(n->n%3==0).count();
//		System.out.println(counts);
		

		//List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		

		// Print all even numbers from the list.

//		list.stream().filter(n->n%2==0).forEach(System.out::println);

		// Print the squares of all numbers from the list.

//		list.stream().map(n->n*n).forEach(System.out::println);

		// Print the maximum number from the list.

//		int max = list.stream().sorted(Comparator.reverseOrder()).findFirst().orElseThrow();
//		System.out.println(max);

//		List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,77,45,12,1,76,89,65,99,44,33);
//		
//		int max2=list2.stream().sorted(Comparator.reverseOrder()).findFirst().orElseThrow();
//		System.out.println(max2);
		
		//Print the average of all numbers in the list.
		
//		double avglist = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
//		System.out.println(avglist);
//		
//		Integer tsum = list.stream().reduce(0, Integer::sum);
//		
//		double avg = (double)tsum/list.size();
//		System.out.println(avg);
//		
		
		// what is the size of the List 
		
		//System.out.println("Size of the list = " + list.size());
		
		
		//Extract and print all numbers greater than 5.

//      list.stream().filter(n->n>5).forEach(System.out::println);
//      
//      list.stream().filter(n->n<5).forEach(System.out::println);
//      
      
		
//		
//		
//		List<String> names = Arrays.asList("John", "Alice", "Bob", "Steve", "Annie");
//
//		
////		Print names that start with the letter 'A'.
//		
//		names.stream().filter(s->s.startsWith("A")).forEach(System.out::println);
//		
//
////		Convert all names to uppercase and print.
//		
//		List<String> nameList = names.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
//		
//		System.out.println(nameList);
//		
//		
////
////		Sort all names alphabetically and print.
//		
//		names.stream().sorted().forEach(System.out::println);
//		
//		System.out.println("*********************");
//		
////		Count how many names have length greater than 4.
//		
//		
//		long counted = names.stream().filter(s->s.length()>4).count();
//		
//		System.out.println(counted);
//		
//
////		Join all names into a single string separated by comma.
//		String strings = names.stream().collect(Collectors.toList()).toString();
//		System.out.println(strings);
//		
//		String strings1 = names.stream().collect(Collectors.joining(" , ")).toString();
//		System.out.println(strings1);
//		
//		
		//****************************************New Questions********************//
		
//		Print all odd numbers from 1 to 100 using streams.
		
//		Stream.iterate(1,n->n+2).limit(100).forEach(System.out::println);
//		

//		Find the sum of squares of numbers from 1 to 10.
		
//		int sumOFSquare = IntStream.rangeClosed(1, 10).map(n->n*n).sum();
//		System.out.println(sumOFSquare);
		
		
//		Find the count of numbers divisible by both 3 and 5 between 1 and 100.
//		
//		long countse = Stream.iterate(1,n->n+1).limit(100).filter(n->n%3==0 && n%5==0).count();
//		System.out.println(countse);
		
//
//		Create a list of the first 10 cube numbers.
//
//		Print all prime numbers between 1 and 50 using streams.
		
		
		//print the square of (1 to 10 ) 
//		
//		Stream.iterate(1, n->n+1).map(n->n*n).limit(10).forEach(System.out::println);
//		
//		//print the table of 2 
//		
//		Stream.iterate(1, n->n+1).map(n->n*2).limit(10).forEach(System.out::println);
		
		
		// reverse the string 
		
		String original="HelloRitik";
		
		List<String> chars = Arrays.asList(original.split(""));
		
		System.out.println(chars.reversed());
		
		
		
		
		
		
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
