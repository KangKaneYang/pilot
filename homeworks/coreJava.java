/* Topic: String
* Problems:  
* 1) Given string “Algorithms”, return  “go” and “Algo” using substring
* 2) Given two strings, compare if these two two strings are equal by comparing each character
* 3) Given string “https://www.amazon.com/demo?test=abc”, return [“https”,”www”,”amazon”,”com”,”demo”,”test”,”abc”]
* 4) Given a list of string array, combine them into one string sentence, return the string sentence
*/

String s = "Algorithms".substring(2, 4);

String s1 = "abcd";
String s2 = "abc";
boolean b = s1.equals(s2);

List<String> res = new ArrayList<>();
StringTokenizer st = new StringTokenizer(“https://www.amazon.com/demo?test=abc”, ":/.?=");
while (st.hasMoreElements()) {
  res.add(st.nextToken);
}

String[] ss = new String[]{"ab", "bcx", "cc"};
StringBuilder sb = new StringBuilder();
for (int i = 0; i < ss.length; i++) {
  sb.append(ss[i]);
  sb.append(" ");
}
String s = sb.toString();                                         
                                         
/*Topic: final
*Problems: define a final class and final method and final variable, modify the value of the variable in final method
*/
                                         
final class FinalClass {
  public final finalMethod() {}
  final int FINAL_VAR = 0;
}
                                         
/*Topic: Static
*Problems: 
*Given a database table “Book” with columns (id, isbn, name, author, publish date), define a java class that matches this table and then use a static block to initialize this table with some records
*Define a Java class “BookSeller” and then define a static inner class “Book”, and use a static method “sellBooks” to initialize several books, and in the main method display all the books by calling the “sellBooks” method
*/
                                         
class Book {
  int id;
  String isbn;
  String name;
  String author;
  LocalDate publishDate;
  public Book(int id, String isbn, String name, String author, LocalDate publishDate) {
    this.id = id;
    this.isbn = isbn
    this.name = name;
    this.author = author;
    this.publichDate = publishDate;
    }
}
class Books {
  Set<Book> books = new HashSet<>();
  static {
    books.add(new Book(1, "978-0131872486", "Thinking in Java", "Bruce Eckel", LocalDate.of(2006, 2, 10));
  }
  public Set<Book> getBooks() {
    return books;
  }
}              
                                         
class BookSeller {
  static class Book {
    int id;
    String isbn;
    String name;
    String author;
    LocalDate publishDate;
    public Book(int id, String isbn, String name, String author, LocalDate publishDate) {
      this.id = id;
      this.isbn = isbn
      this.name = name;
      this.author = author;
      this.publichDate = publishDate;
      }
    }
  public static Book sellBooks(int id, String isbn, String name, String author, LocalDate publishDate) {
    return new Book(id, isbn, name, author, publicnDate);
  }
  pubic static void main(String[] args) {
    Book java = sellBooks(1, "978-0131872486", "Thinking in Java", "Bruce Eckel", LocalDate.of(2006, 2, 10));
}
  
/*Topic: OOP
Problems:
Define an interface “DatabaseConnection” and then define class “OracleConnection”, “MySqlConnection”, “SqlServerConnection”. They should all implements the “getConnection” method from the interface. The method should initialize data source and return a database connection.
Define an abstract class “CreditCard” which contains fields (holderName, cardNumber, accountBalance, cardType), and not-implemented method “isCardAcceptable” with argument cardType, and implemented method “payBill(double bill)”. Define two classes “VisaCard” and “MasterCard” both should inherit this “CreditCard” class and you should define constructor for both classes and implement the “isCardAcceptable” method.
Implement static and dynamic polymorphism.
*/  
    
interface DatabaseConnection {
  public Connection getConnection();
}  
class OracleConnection implements DatabaseConnection {
  public Connection getConnection() {
    return DriverManager.getConnetion();
  }
}
class MySqlConnection implements DatabaseConnection {
  public Connection getConnection() {
    return DriverManager.getConnetion();
  }
}                                         
class SqlServerConnection implements DatabaseConnection {
  public Connection getConnection() {
    return DriverManager.getConnetion();
  }
}                                         
                                         
abstract class CreditCard {
  String holderName;
  String cardNumber;
  Long accountBalance;
  String cardType;
  protected boolean isCardAcceptable(String cardType);
  protected void payBill(double bill) {
    accountBalance -= bill;
  }
}
class VisaCard extends {
  VisaCard(String holderName, String cardNumber, Long accountable, String cardType) {
    this.holderName = holderName;
    this.cardNumber = cardNumber;
    this.accountBalance = accountBalance;
    this.cardType = cardType;
  }
  public boolean isCardAcceptable(String cardType) {
    return cardType == "Visa" ? : true : false;
  }
}
class MasterCard extends {
  VisaCard(String holderName, String cardNumber, Long accountable, String cardType) {
    this.holderName = holderName;
    this.cardNumber = cardNumber;
    this.accountBalance = accountBalance;
    this.cardType = cardType;
  }
  public boolean isCardAcceptable(String cardType) {
    return cardType == "Master" ? : true : false;
  }
}  
//static polymorphism: overload
//dynamic polymorphism: override
  
  
/*
*Topic: Serializable
*Problems: Define a “Employee” POJO class and make it serializable
*/
  
class Employee implements Serializable {}
  
/*Topic: Design Pattern
*Problems
*Create a singleton class called “AppleDesignerFactory”
*Create a factory pattern called “CurrencyExchange” which takes in the country name and return the currency object for that country.
*Implement the (in-class) PARKING LOT OOP design system -> your implementation should include main method and is runnable.
*/
  
public class AppleDesignerFactory implements Serializable, Cloneable {
  private static AppleDesignerFactory instance;
  private AppleDesignerFactory() {}
  public static synchronized AppleDesignerFactory getInstance() {
    if (instance == null) {
      instance = new AppleDesignerFactory();
    }
    return instance;
  }
  protected Object clone() throws CloneNotAcceptException {
    throw new CloneNotAcceptException();
  }
  protected readResolve() {
    return instance;
  }
}
  
class CurrencyExchange {
  public static String change(String country) {
    if (country.equals("USA") {
      return "Dallor";
    } else if (country.equals("China")) {
      return "Yuan";
    } else {
      return "I don't know";
    }
  }
}
  
/*Topic: Collection
Problems:
(Set)Find true friends: Given two arraylists containing friend names, find the true friends that appear in both list.
(Map)Given a string, output duplicate characters and their counts
Use a map to simulate database table, key should be the primary key (assume only one column), value is the record, your simulation should include CRUD operation methods
*/

public List<String> solve(List<String> l1, List<String> l2) {
  List<String> res = new ArrayList<>();
  Set<String> set = new HashSet<>();
  for (String s : l1) {
    set.add(s);
  }
  for (String s : l2) {
    if (set.contains(s)) {
      res.add(s);
    }
  }
  return res;
}
        
public List<Character> solve(String s) {
  List<Character> res = new ArrayList<>();
  int[] chars = new int[256];
  for (int i = 0; i < s.length(); i++) {
    chars[(int)s.charAt(i)]++;
  }
  for (int i = 0; i < 256; i++) {
    if (chars[i] > 1) {
      res.add((char)i);
    }
  return res;
  }
  
  Map<Long, String> map = new HashMap<>();
  int i = 0;
  public void create(String re) {
    map.put(i, re);
    i++;
  }
  public String read(int i) {
    return map.get(i);
  }
  public void update(int i, String re) {
    if (!map.containsKey(i)) {
      return;
    } else {
      map.put(i, re);
    }
  }
  public void delete(int i) {
    if (!map.containsKey(i)) {
      return;
    } else {
      map.remove(i);
    }
  }
  
  /*Topic: Exception Handling
Problems:
Define two exceptions “CardTypeException” and “AddressException”. Create a separate class “ExceptionHandler” which contains one method “handleException”. The method takes input of cardType and address. If cardType is “AMEX”, throw CardTypeException. If address is outside US, return AddressException, for other errors, just return generic exception. Your exception should be caught and you should display message to tell which exception is returned.
*/
  
class CardTypeException extends Exception {}
class AddressException extends Exception {}  
class ExceptionHandler {
  public void handleException(String cardType, String address) {
    try {
      if (cardType.equals("AMEX") {
        throw new CardTypeException("Do not accept AMEX");
      }
      if (!address.equals("US") {
        throw new AddressException("Out of the US");
      }
     } catch (CardTypeException || AddressException ex) {
       System.out.println("Handled the exception");
     }
    }
   }       
      
/* Topic: ExecutorService
Problems:
Define a inner class A has method “getMethod()” which return string “A.getMethod” and another inner class B has method “getMethod()” which return string “B.getMethod”. write another method “runSameTime()” which should let A and B getMethod to run at the same time, but the “runSameTime()” method should return a string “B.getMethod A.getMethod”
*/
          
class C {  
  class A {
    public String getMethod() {
      return "A.getMethod";
    }
  }
  class B {
    public String getMethod() {
      return "B.getMethod";
    }
  }
  public String runSameTime() {
    ExecutorService service = null;
    String s1, s2;
    try {
      service = Executors.newSingleThreadExecutor();
      service.execute(() -> {
        s1 = new B().getMethod();
      }
    );
      service.execute(() -> {
        s2 = new A().getMethod();
      }
);
 } finally {
      service.shutdown();
    }
    return s1 + s2;
  }
}
        
 /*Topic: Java 8
Problems:
Define an interface “CreditCard” which contains fields (holderName, cardNumber, accountBalance, cardType), and not-implemented method “isCardAcceptable” with argument cardType. Define two classes “VisaCard” and “MasterCard” both should inherit this “CreditCard” interface and you should define constructor for both classes and implement the “isCardAcceptable” method. Now Add a default method “payBill(double bill)” and static method “refund(double amount)” to the interface. Verify that VisaCard and MasterCard class can read these two methods (use Main method to verify).
Use functional interface to implement Java 8 stream.map() function. Define a “MyStream” class containing a functional interface and a static method “MyMap”.
In main method, test your code by calling: MyStream.MyMap(list, o -> o *3) to multiple each element in the “list” by 3.
"walabcwalexywalxzsfwalmx”  -- replace "wal" with "sams"
"Eclipse eclipse Eclipse eclipse amc clip ECLIPSE" – count the occurrence of each unique word (ignore case), return result as a map. For example (eclipse->5, amc->1, clip->1)
*/
       
interface CreditCard {
  String holderName;
  String cardNumber;
  Long accountBalance;
  String cardType;
  boolean isCardAcceptable(String cardType);
  default void payBill(double bill) {}
  static void refund(double amount){}
  
}
class VisaCard implements {
  VisaCard(String holderName, String cardNumber, Long accountable, String cardType) {
    this.holderName = holderName;
    this.cardNumber = cardNumber;
    this.accountBalance = accountBalance;
    this.cardType = cardType;
  }
  public boolean isCardAcceptable(String cardType) {
    return cardType == "Visa" ? : true : false;
  }
}
class MasterCard implements {
  VisaCard(String holderName, String cardNumber, Long accountable, String cardType) {
    this.holderName = holderName;
    this.cardNumber = cardNumber;
    this.accountBalance = accountBalance;
    this.cardType = cardType;
  }
  public boolean isCardAcceptable(String cardType) {
    return cardType == "Master" ? : true : false;
  }
}    
          
         
public class MyStream {
  public static List<Integer> myMap(List<Integer> list, UnaryOperator<Integer> uo) {
    List<Integer> res = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
      res.add(uo.apply(list.get(i));
     }
   return res;
   }
              
  String s = "walabcwalexywalxzsfwalmx”;
  String newString = s.replace("wal", "sams");           
  
public static Map<String, Integer> solve(String s) {
    Map<String, Integer> res = new HashMap<>();
    int left = 0;
    int right = 1;
    while (left < s.length() && right <= s.length()) {
      if (s.substring(left, right).equals(" ")) {
        left = right;
        right = left + 1;
        continue;
      }
      if (right == s.length() || s.charAt(right) == ' ') {
        if (!res.containsKey(s.substring(left, right).toLowerCase())) {
          res.put(s.substring(left, right).toLowerCase(), 1);
        } else {
          res.put(s.substring(left, right).toLowerCase(), res.get(s.substring(left, right).toLowerCase()) + 1);
        }
        left = right + 1;
        right = left + 1;
            continue;
      }
      right++;
     }
     return res;
    }
        
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
                                         
                                         
