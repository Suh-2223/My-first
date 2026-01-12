// class Demo{
//   public static void main(String[] args) {
        // System.out.println("Hello,World!");
        // System.out.print("Hello,World!");
        // System.out.print("Hello,World!");
        // System.out.print("Hello,\n World!");}}
    
//for scanner class(nextLine()- it is used to take input from user in the form of string 
//nextInt()- it is used to take input from user in the form of integer
//nextDouble()- it is used to take input from user in the form of double)
//nextFloat()- it is used to take input from user in the form of float
//     int a=10,b=20,sum;
//     sum=a+b;
//         System.out.println("The sum of two numbers is: "+sum);
//     }
// }
// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
// int a,b,sum;
//         System.out.println("Enter first number: ");
//         a = sc.nextInt();

//         System.out.print("Enter second number: ");
//         b = sc.nextInt();

//         sum = a + b;
//         System.out.println("The sum of is: " + sum);

//     }
// }

//  Scanner sc=new Scanner(System.in);
// System.out.print("enter a :");
//   int a=sc.nextInt();
// System.out.print("enter b:");
//   int b=sc.nextInt();
//   if(a==b){
//     System.out.println("equal");
//   }
//   else if(a>b){
//     System.out.println("a is greater");
//   }
//     else{
//         System.out.println("a is lesser");
// }
// switch case
// int button=sc.nextInt();
// switch(button){
//     case 1:
//     System.out.println("hello");
//     break;
//     case 2:
//     System.out.println("namaste");
//     break;
//     case 3:
//     System.out.println("bonjour");
//     break;
//     default:
//   System.out.println("invalid button");
// }

//LOOPS
// for(int i=0;i<5;i++){  //initialization,condition,updation all at one place
//     System.out.println(i);
// }
// }}
// int i=0; //initialization is done outside the loop
// while(i<10){//condition
//     System.out.println(i);
//     i++;}//updation is done inside the loop
// do { 
//     System.out.println(i);
//     i++;//updation
// } 
// while (i<5);//condition
// }}
// int sum=0;
// int n=4;
// for(int i=0;i<=n;i++){
//     sum=sum+i;}
//     System.out.println(sum);

// Scanner sc=new Scanner(System.in);
// System.out.print("enter a number:");
// int n=sc.nextInt();
// for(int i=1;i<=10;i++){
//     System.out.println(n + "*" + i + "=" +n*i);
 
//function
// public static void printname(String name){
//     System.out.println(name);
//     return;
// }
// public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    String name=sc.nextLine();
//  printname(name);

// public static int printsum(int a,int b){
//   int sum=a+b;
//   System.out.println(sum);
//   return sum;
// }
// public static void main(String[] args) {
//     Scanner sc =new Scanner(System.in);
//     System.out.print("enter a:");
//     int a=sc.nextInt();
//     System.out.print("enter b:");
//     int b=sc.nextInt();
//     printsum(a,b);
    
  // public static int printmul(int a,int b){
  //   return a*b;
   // int mul=a*b;
   // System.out.println(mul);
   // return mul;
  // }  
  // public static void main(String[] args) {
  //     Scanner sc =new Scanner(System.in);
  //     System.out.print("enter a:");
  //     int a=sc.nextInt();
  //     System.out.print("enter b:");
  //     int b=sc.nextInt();
  //     printmul(a,b);
  // }n){
  //   if (n<0){
  //     System.out.println("invalid no");
  //     return;
  //   }
        
  // int factorial=1;
  // for(int i=1;i<=n;i++){
  //   factorial=factorial*i;
  // }
  // System.out.println(factorial);
  
  // }

//     public static void main(String[] args) {
//       Scanner sc =new Scanner(System.in);
//       int n=sc.nextInt();
//       printfactorial(n);
//   }
// }
//FUNCTION-are called directly by their name
//METHODS-are called by using objects of class
//TIME COMPLEXITY:if nested loop(i.e one loop inside another) is there then time complexity will be multiplied & if two different loops are there then the worst case complexity will be added

//ARRAYS
//public static void main(String[] args) {
    /*int marks[]=new int[3];//declaration & memory allocation
    marks[0]=95;
    marks[1]=88;
    marks[2]=76;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);*/
    //     int marks[]={95,88,76};//declaration, memory allocation & initialization
    //     for(int i=0;i<3;i++){
    //         System.out.println(marks[i]);
    //     }
    // }
    //LINEAR SEARCH
  //   public static void main(String[] args) {
  //   Scanner sc=new Scanner(System.in);
  //   System.out.println("enter size of array:");
  //   int size=sc.nextInt();
  //   System.out.println("enter the elements of array:");
  //   int numbers[]=new int[size];
  //   for(int i=0;i<size;i++){    //input
  //   numbers[i]=sc.nextInt();}
  //   System.out.println("enter the number to be searched:");
  //   int x=sc.nextInt();
  //   for(int i=0;i<numbers.length;i++){   //output
  //   if(numbers[i]==x){
  //   System.out.println("x found at index:"+i);
  // }
  // }
//   Scanner sc=new Scanner(System.in);
//   System.out.println("enter rows and colm:");
//   int rows=sc.nextInt();
//   int colm=sc.nextInt();
//   int num[][]=new int[rows][colm];
//   for (int i = 0; i <rows; i++) {
//       for(int j=0;j<colm;j++){    //input
//         num[i][j]=sc.nextInt();
//       }
//   }
//   for (int i = 0; i <rows; i++) {
//       for(int j=0;j<colm;j++){     //output
//        System.out.println(num[i][j]+"");
// }
//       System.out.println();
// }
// Scanner sc=new Scanner(System.in);
//   System.out.println("enter rows and colm:");
//   int rows=sc.nextInt();
//   int colm=sc.nextInt();
//   int num[][]=new int[rows][colm];
//   for (int i = 0; i <rows; i++) {
//       for(int j=0;j<colm;j++){    //input
//         num[i][j]=sc.nextInt();
//       }
//   }
//   int x=sc.nextInt();
//   for (int i = 0; i <rows; i++) {
//       for(int j=0;j<colm;j++){     //output
//         if(num[i][j]==x){
//           System.out.println("x found at index: ("+ i + "," +j +")");
//         }
//       }
// }
    
//STRINGS
// for whole line we take nextLine() & for single word we take next()
    // String firstname="John";
    // String lastname="Doe";
    // String fullname=firstname + "@" + lastname;//concatenation
    // System.out.println(fullname);
    // System.out.println(fullname.length()); //length of string

    // for(int i=0;i<fullname.length();i++){
    //   System.out.println(fullname.charAt(i));}//charAt()
// String sent="Hello World";
// String name=sent.substring(0,6);
// System.out.println(name);
//STRINGBUILDER
    // StringBuilder sb=new StringBuilder("Hello");
    // System.out.println(sb);
  
    //  System.out.println(sb.charAt(0));//charAt at index 0
    // sb.setCharAt(0,'P');//setchar at index 0
    // System.out.println(sb);
    // sb.append(" World");//append
    // System.out.println(sb);
    // sb.insert(5,",");//insert
    // System.out.println(sb);
    // sb.delete(5,7);//delete
    // System.out.println(sb);
    // sb.replace(0,5,"Hi");//replace
    // System.out.println(sb);
    // System.out.println(sb.reverse());//reverse
    //OPERATORS
    // &-BITWISE AND(in binary format) ,&&-LOGICAL AND(true/false)

//ARRAY LIST(for searching arraylist is better)
// import java.util.ArrayList;
// import java.util.Collections;

// class ArrayLists{
//   public static void main(String[] args) {
//   ArrayList<Integer> list=new ArrayList <Integer>();//declaration
//   // ArrayList<String> list2=new ArrayList<String>();
//   // ArrayList<Boolean> list3=new ArrayList<Boolean>();
  
//   //add elements
//   list.add(0);
//   list.add(8);
//   list.add(3);

//   System.out.println(list);

//   //get elements
//   int element=list.get(2);
//   System.out.println(element);

//   //add element at specific index
//   list.add(1,5);
//   System.out.println(list);

//   //set element 
//   list.set(0,9);
//   System.out.println(list);

//   //delete element
//   list.remove(2);
//   System.out.println(list);

//   //size of arraylist
//   list.size();
//   System.out.println(list.size());

//   //loops
//   for(int i=0;i<list.size();i++){
//     System.out.println(list.get(i));
//   }

// //sorting
// Collections.sort(list);
// System.out.println(list);
//   }}

//COLLECTION FRAMEWORK
//(list interface,queue interface,set interface,map interface)

