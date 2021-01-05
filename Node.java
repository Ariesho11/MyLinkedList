public class Node{
  private String data;
  private Node next,prev;

  public Node(String value){
    data = value;
  }
 //write get/set methods for all three instance variables.
 public static String getData(){
   return data;
 }
 public static Node getNext(){
   return next;
 }
 public static Node getPrev(){
   return prev;
 }

 public static void setData(String value){
   data = value;
 }
 public static void setNext(Node value){
   next = value;
 }
 public static void setPrev(Node value){
   prev = value;
 }
}
