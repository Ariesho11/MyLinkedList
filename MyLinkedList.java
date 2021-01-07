public class MyLinkedList{
 private int size;
 private Node start,end;
 public MyLinkedList(){
   size = 0;
 }

 public int size(){
   Node current = start;
   int count = 0;
   while (current != null){
     count++;
     current = current.getNext();
   }
   return count;
 }

 public boolean add(String value){
   if(size == 0){
     start.setData(value);
     end.setData(value);
   }
   else end.setData(value);
   return true;
 }

 public void add(int index, String value){

 }

 public String get(int index){
   return "";
 }

 public String set(int index, String value){
   return "";
 }

 public String toString(){
   return "";
 }
 //Any helper method that returns a Node object MUST BE PRIVATE!
}
