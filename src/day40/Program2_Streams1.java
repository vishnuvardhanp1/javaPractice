/**
 * 
 */
package day40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Student {
	int rollNo;
	String name;
	String dept;
	int marks;
	public Student(int rollNo, String name, String dept, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.dept = dept;
		this.marks = marks;
	}
	/**
	 * @return the rollNo
	 */
	public int getRollNo() {
		return rollNo;
	}
	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}
	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}
	/**
	 * @return the marks
	 */
	public int getMarks() {
		return marks;
	}
	/**
	 * @param marks the marks to set
	 */
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dept, marks, name, rollNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(dept, other.dept) && marks == other.marks && Objects.equals(name, other.name)
				&& rollNo == other.rollNo;
	}
	
	
}
/**
 * 
 */
public class Program2_Streams1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student obj=new Student(1,"Zainab","ECE",60);
    Student obj1=new Student(2,"Yatin","ECE",80);
    Student obj2=new Student(3,"Astha","CSE",90);
    Student obj3=new Student(4,"Bhawna","CSE",70);
    Student obj5=new Student(3,"Astha","CSE",90);
    List<Student> studentList=new ArrayList<Student>();
    studentList.add(obj);
    studentList.add(obj1);
    studentList.add(obj2);
    studentList.add(obj3);
    studentList.add(obj5);
    //Filter name starts with Y or A
    List<Student> filterList=
    		studentList
    		.stream()
    		.filter(n->(n.getName().startsWith("Y") || n.getName().startsWith("A")))
    		//.toList(); immutable cannot add futher objects into collection //gives unsupportedoperation exception
    		.collect(Collectors.toList()); // mutable able to add new objects
    filterList.add(new Student(5,"Palak","MECH",50));
    for(Student data:filterList)
    	System.out.println(data.name+ " " +data.rollNo);
	
	
/*	System.out.println("\n For Each practice ");
	studentList
	.stream()
	.forEach(s->System.out.println(s.rollNo+ " " + s.name));
	
	
	System.out.println("\n Sort on marks ");
	
	studentList
	.stream()
	.sorted(Comparator.comparingInt(Student::getMarks))
	.forEach(s->System.out.println(s.name + " " + s.marks ));
	
	System.out.println("\n Sort on Name Desc");
	
	studentList
	.stream()
	.sorted(Comparator.comparing(Student::getName).reversed())
	.forEach(s->System.out.println(s.name + " " + s.marks )); */
	
	System.out.println("\n Sort on marks  using comparing");
	studentList
	.stream()
	.sorted(Comparator.comparing(Student::getMarks).reversed())
	.forEach(s->System.out.println(s.name + " " + s.marks ));
	
	System.out.println("\n Sort on name  using compare To asc");
	studentList
	.stream()
	.sorted((a,b)->a.getName().compareTo(b.getName()))
	.forEach(s->System.out.println(s.name  ));
	
	System.out.println("\n Sort on marks  ");
	studentList
	.stream()
	.sorted((a,b)->a.marks-b.marks)
	.forEach(s->System.out.println(s.name + " " + s.marks ));
	
	System.out.println("Map InTo Dept");
	List<String> dept=studentList.stream().map(Student::getDept)
			
			.collect(Collectors.toList());
	dept.forEach(s->System.out.println(s));
	
	//List<Integer> marks=studentList.stream().map(Student::getMarks());
	
	System.out.println("Marks Total");
	
	
	
	int sum=studentList.stream().map(Student::getMarks).mapToInt(Integer::intValue).sum();
	System.out.println(sum);
	
	System.out.println(" Maximum marks 1");
	Optional max=studentList.stream().map(Student::getMarks).reduce(Integer::max);
	System.out.println(max.get());
 	
	System.out.println(" Maximum marks 2");
	OptionalInt max2=studentList.stream().map(Student::getMarks)
			.mapToInt(Integer::intValue).max();
	System.out.println(max2.getAsInt());
	
	System.out.println("Maximum marks name");
	Optional<Student> max3=studentList.stream().max((a,b)->Integer.compare(a.marks, b.marks));
	max3.ifPresent(s->System.out.println(s.getName()));
	
	System.out.println("Count Students scoring more than 70 ");
	Long count=studentList.stream().filter(s->s.marks>=70).count();
	System.out.println(count);
	
	System.out.println("Print name of person scoring more than 70 first ");
	Optional<Student> opt=studentList.stream().filter(s->s.marks>=70).findFirst();
	System.out.println(opt.get().name);
	
	System.out.println("Topper of the batch ");
	Optional<Student> opt1=studentList.stream().sorted(Comparator.comparing(Student::getMarks).reversed()).findFirst();
	System.out.println(opt1.get().name);
	
	System.out.println("Top 3 on marks limit");
	studentList.stream().sorted((a,b)-> b.marks-a.marks)
	.limit(3).forEach(s->System.out.println(s.name));
	
	System.out.println("Distinct");
	studentList.stream().distinct().forEach(s->System.out.println(s.name));
	
	
	System.out.println("Skip");
	studentList.stream().sorted(Comparator.comparingInt(Student::getMarks).reversed()).skip(2)
	.forEach(s->System.out.println(s.name));
	
	System.out.println("Highest scorer in each dept");
	
	Map<String, Optional<Student>> groupList=
			studentList.stream().collect(Collectors.groupingBy(Student::getDept,
					Collectors.maxBy((a,b)->a.getMarks()-b.getMarks())));
	for(Map.Entry<String,Optional<Student>> e:groupList.entrySet()) 
	{
		System.out.println(e.getKey() + ":" + e.getValue().get().marks + ":" + e.getValue().get().name);
	}
	
	System.out.println("fibonacci");
	
	Stream.iterate(new int[] {0,1}, arr->new int[] {arr[1],arr[1]+arr[0]})
	.limit(10).forEach(s->System.out.println(s[0]+" "));
	
	System.out.println("Boxed int stream to stream<Integer>");
	
	List<Integer> list2=IntStream.range(1, 11).boxed().collect(Collectors.toList());
	list2.forEach(s->System.out.println(s+" "));
	
	
	System.out.println("Random");
	//Stream<Double> randomList=
	Stream.generate(Math::random).limit(3).map(num->num*10).map(f->Math.round(f))
	.forEach(s->System.out.println(s+ " "));
			
	System.out.println("Flat Map");
	List<String> listStr=Arrays.asList("hello","all","how","are","you");
	List<String> output=listStr.stream().flatMap(s->Arrays.stream(s.split("")))
			.collect(Collectors.toList());
	System.out.println(output.size());
	output.forEach(s->System.out.print(s+" "));
	
	System.out.println("\n Sort on basis of length");
	
			//Example of map and reduce
	List<Integer> nums = Arrays.asList(1,2,3,4);
	List<String> listStr1=Arrays.asList("hellooo","a","them","no","yes");
	listStr1.stream().sorted(Comparator.comparing(String::length))
	.forEach(s->System.out.println(s));
	
	int result =
	    nums.stream()
	        .map(n -> n*n)
	        .reduce(0, (a,b)->a+b);

	System.out.println(result);
	
	// process
	
/*	1,2,3,4
	↓ map
	1,4,9,16 - multiplies each number with same number
	↓ reduce - combines result as total
	30 */
	
	// output 30
	
	System.out.println("Adding +5 marks to each student using map");

	studentList.stream()
        .map(s -> {
            s.setMarks(s.getMarks() + 5);
            return s;
        })
        .forEach(s -> System.out.println(
                s.getName() + " : " + s.getMarks()));
	
	Optional<Integer> total =
	        studentList.stream()
	                .map(s -> s.getMarks())
	                .reduce((a, b) -> a + b);

	total.ifPresent(System.out::println);
	
	System.out.println("Adding +5 marks to each student using peek");

	studentList.stream()
    .peek(s -> s.setMarks(s.getMarks() + 5))
    .forEach(s -> System.out.println(
            s.getName() + " : " + s.getMarks()));


	System.out.println("Total Marks");

	Optional<Integer> total1 =
	        studentList.stream()
	                .map(s -> s.getMarks())
	                .reduce((a, b) -> a + b);

	total1.ifPresent(System.out::println);
	
	/*
	functional interfaces
	Stream api
	predicate input boolean isUppercase() contains() equals()
	function input output split,substring,map(),sorted()
	consumer input no output foreach()
	supplier no input output reverse()
	*/
	}

}
