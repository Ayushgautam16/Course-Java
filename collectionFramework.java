import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
// import java.util.Comparator;
// import java.util.PriorityQueue;
// import java.util.LinkedList;
// import java.util.Queue;
// import java.util.ArrayDeque;
// import java.util.HashSet;
// import java.util.TreeSet;
// import java.util.Map;
// import java.util.HashMap;
// import java.util.TreeMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;

public class collectionFramework {

    
String name;
int rollno;
    public static void main(String[] args) {

// List <String> list = new ArrayList();

// list.add("Apple");

// list.add("Banana");

// list.add("Cherry");

// System.out.println("Original List: " + list);

// List <Integer> list2 = new ArrayList();
// list2.add(22);
// list2.add(34);
// list2.add(2);

// System.out.println("Original List: " + list2);

// list2.add(34);

// System.out.println("List after adding duplicate element: " + list2);
// list2.add(23);

// System.out.println("List after adding another element: " + list2);

// System.out.println("Index of '23' in the list: " + list2.indexOf(23));

// System.out.println("Index of '34' in the list: " + list2.indexOf(34));

// System.out.println("List after removing '22' from the list: " + list2.remove(2));


// List <Integer> list3 = new ArrayList();
// list3.add(93);
// list2.add(333);

// list2.addAll(list3);

// System.out.println("List after merging list3 with list2: " + list2); 


// // outputs

// // Original List: [Apple, Banana, Cherry]
// // Original List: [22, 34, 2]
// // List after adding duplicate element: [22, 34, 2, 34]    
// // List after adding another element: [22, 34, 2, 34, 23]  
// // Index of '23' in the list: 4
// // Index of '34' in the list: 1
// // List after removing '22' from the list: 2
// // List after merging list3 with list2: [22, 34, 34, 23, 333, 93]



// List <Integer> list4 = new ArrayList();

// list4.add(22);

// list4.add(34);

// list4.retainAll(list2);

// System.out.println("List after retaining common elements with list2: " + list4);

// List after retaining common elements with list2: [] 
// List after retaining common elements with list2: [22, 34]

// basically retain method gives the common value
 // from the current list and removes the rest.

//  get function

// System.out.println("Get value at index 2: " + list2.get(2));
// Get value at index 2: 2




// set function 
// to update the value at the index 

// list2.set(2, 45);
// System.out.println(list2);
// [22, 34, 45]

// List<Integer> list2 = new ArrayList<>();
// list2.add(3);
// list2.add(2);
// list2.add(23);
// list2.add(2333);
// list2.add(233);
// list2.add(222);
// list2.add(234);
// list2.add(224);

// System.out.println(list2);

// for(int i = 0; i < list2.size(); i++){
//     System.out.println("the element is " + list2.get(i));


// }
// list2.size() it tells about the how many elements are there in the list currently

// for (Integer element: list2){
//     System.out.println("the element is " + element);
// }

// [3, 2, 23, 2333, 233, 222, 234, 224]
// the element is 3
// the element is 2
// the element is 23
// the element is 2333
// the element is 233
// the element is 222
// the element is 234
// the element is 224

// Iterator<Integer> it = list2.iterator();

// while(it.hasNext()){
//     System.out.println("the element is " + it.next());







// Stack

// Stack<String> animal = new Stack<>();

// animal.push("Lion");

// animal.push("Tiger");

// animal.push("Elephant");

// System.out.println("Initial stack: " + animal);

// System.out.println("Top element: " + animal.peek());

// animal.pop();

// System.out.println("After popping an element: " + animal);

// animal.push("Giraffe");

// System.out.println("After pushing an element: " + animal);

// animal.pop();

// System.out.println("After popping an element: " + animal);
// Initial stack: [Lion, Tiger, Elephant]
// Top element: Elephant
// After popping an element: [Lion, Tiger]
// After pushing an element: [Lion, Tiger, Giraffe]        
// After popping an element: [Lion, Tiger]





// // Queue  

// Queue<Integer> queue = new LinkedList<>();

// queue.offer(1);
// queue.offer(2);
// queue.offer(4);
// queue.offer(15);
// queue.offer(155);
// queue.offer(17);
// queue.offer(10);
// queue.offer(1555);

// System.out.println("Initial queue: " + queue);

// queue.poll();

// System.out.println("After poll: " + queue);

// System.out.println("Peek: " + queue.peek()); 







// priorityQueue()

// PriorityQueue<Integer> pq = new PriorityQueue<>();



// pq.offer(23);

// pq.offer(14);

// pq.offer(33);

// pq.offer(54);

// pq.offer(155);

// pq.offer(12);
// System.out.println("Initial priority queue: " + pq);
// // Initial priority queue: [12, 23, 14, 54, 155, 33]
// System.out.println("Poll: " + pq.poll());
// // poll removes element from queue
// // in fifo order 

// // Poll: 12

// System.out.println("After poll: " + pq);

// // After poll: [23, 33, 14, 54, 155]

// System.out.println("Peek: " + pq.peek());

// Peek returns the element at the top of queue

// Peek: 23



// //max to minimum priority queue order

// PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

// pq.offer(23);

// pq.offer(14);


// pq.offer(33);

// pq.offer(54);

// pq.offer(155);

// pq.offer(12);

// System.out.println("Initial priority queue: " + pq);

// // Initial priority queue: [12, 23, 14, 54, 155, 33]



// ArrayDeque 

// ArrayDeque<Integer> adq = new ArrayDeque<>();
// adq.offer(1);
// adq.offer(2);
// adq.offer(3);
// adq.offer(4);
// adq.offer(5);

// System.out.println("Initial ArrayDeque: " + adq);

// // // Initial ArrayDeque: [1, 2, 3, 4, 5]

// System.out.println("Poll: " + adq.poll());

// // // poll removes element from queue

// // // in fifo order

// // // Poll: 1

// System.out.println("After poll: " + adq);

// // // After poll: [2, 3, 4, 5]

// System.out.println("Peek: " + adq.peek());

// // Peek returns the element at the top of queue


// // Peek: 2


// adq.offerFirst(23);

// System.out.println("After adding first: " + adq);

// // // After adding first: [23, 2, 3, 4, 5]

// adq.offerLast(155);

// System.out.println("After adding last: " + adq);

// // // After adding last: [23, 2, 3, 4, 5, 155]

// System.out.println("Peek first: " + adq.peekFirst());

// // Peek returns the first element of queue


// // Peek first: 23

// System.out.println("Peek last: " + adq.peekLast());

// // Peek returns the last element of queue

// // Peek last: 155


// // Initial ArrayDeque: [1, 2, 3, 4, 5]
// // Poll: 1
// // After poll: [2, 3, 4, 5]
// // Peek: 2
// // After adding first: [23, 2, 3, 4, 5]
// // After adding last: [23, 2, 3, 4, 5, 155]
// // Peek first: 23
// // Peek last: 155




// // Set 
// // no duplicate element allowed

// HashSet<Integer> set = new HashSet<>();

// set.add(1);

// set.add(2);

// set.add(3);

// set.add(2);

// System.out.println("Initial set: " + set);

// // // Initial set: [1, 2, 3]

// set.remove(2);

// System.out.println("After removing 2: " + set);

// // // After removing 2: [1, 3]

// set.add(4);

// System.out.println("After adding 4: " + set);

// // // After adding 4: [1, 3, 4]

// System.out.println("Contains 2: " + set.contains(2));

// // // Contains 2: false

// System.out.println("Contains 3: " + set.contains(3));   

// // // Contains 3: true

// System.out.println("Size of set: " + set.size());

// // // Size of set: 3    



// // TreeSet

// TreeSet<Integer> ts = new TreeSet<>();
// // sorted format always gives 

// ts.add(12);

// ts.add(222);

// ts.add(33);

// ts.add(121);

// System.out.println("Initial TreeSet: " + ts);
// // Initial TreeSet: [12, 33, 121, 222] sorted array 


// maps
// hashmaps



// Map<String, Integer> num= new HashMap<>();

// num.put("one",1);

// num.put("two",2);

// num.put("three",3);

// System.out.println("Initial Map: " + num);
// // Initial Map: {one=1, two=2, three=3}

// num.remove("two");

// System.out.println("After removing two: " + num);

// // After removing two: {one=1, three=3}

// num.put("two",22);

// System.out.println("After updating two: " + num);

// // After updating two: {one=1, three=3, two=22}

// System.out.println("Get value for 'two': " + num.get("two"));

// // if(!num.containsKey("Two")){
// //     num.put("Two", 23);
// //     System.out.println("After adding 'Two': " + num);
// // }

// if(num.containsKey("two")){

//     System.out.println("After adding 'Two': " + num);

// is empty()

//     System.out.println("Is Map empty? " + num.isEmpty());


// // TreeMap()

// TreeMap<Integer, String> tm = new TreeMap<>();

// tm.put(1, "one");

// tm.put(3, "three");

// tm.put(2, "two");

// System.out.println("Initial TreeMap: " + tm);

// // Initial TreeMap: {1=one, 2=two, 3=three}

// tm.remove(2);

// System.out.println("After removing 2: " + tm);

// // After removing 2: {1=one, 3=three}

// tm.put(2, "two");

// System.out.println("After updating 2: " + tm);

// // After updating 2: {1=one, 2=two, 3=three}

// System.out.println("Get value for 2: " + tm.get(2));

// // if(!tm.containsKey(2)){

// //     tm.put(2, "two");

// //     System.out.println("After adding 2: " + tm);




// Arraysclass()

Integer[] arr = {1,2,3,4,5};
int index = Arrays.binarySearch(arr,4);
// System.out.println("the index of 4th element is", index);

System.out.println("this is the index"+index);


Integer[] num = {11,22,33,334,45};

Arrays.sort(num);

System.out.println("Sorted array: " + Arrays.toString(num));


// // Sorted array: [11, 22, 33, 45, 334]

// // BinarySearch: 3

// // BinarySearch: -1 (not found)

// // BinarySearch: 3 (found)

// // BinarySearch: -2 (not found)

// Arrays.fill(num, 12);
// for(int i: num)
// {System.out.println(i+"");}


// System.out.println("Filled array: " + Arrays.toString(num));
// Sorted array: [11, 22, 33, 45, 334]
// 12
// 12
// 12
// 12
// 12
// Filled array: [12, 12, 12, 12, 12]


// Collection Class()

List<Integer> List = new ArrayList<>();

List.add(22);
List.add(22);
List.add(11);

List.add(33);

List.add(44);

System.out.println("Initial List: " + List);

// Initial List: [22, 11, 33, 44]

System.out.println("min elmt : "+Collections.min(List));

// Initial List: [22, 11, 33, 44]
// min elmt : 11

System.out.println("min elmt : "+Collections.max(List));

System.out.println("Feq1 : "+Collections.frequency(List,4));
System.out.println("Feq2: "+Collections.frequency(List,22));

Collections.sort(List);
System.out.println(List);

Collections.sort(List, Comparator.reverseOrder());
System.out.println(List);

// [11, 22, 22, 33, 44]
// [44, 33, 22, 22, 11]
 



}
}
