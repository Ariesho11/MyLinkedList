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
   else{
     end.setPrev(end);
     end.setData(value);
   }
   return true;
 }

 public void add(int index, String value){
   if(size == 0){
     start.setData(value);
     end.setData(value);
   }
   Node current = start;
   for(int i = 0; i <= index ;i++){
     if ((i ==index)&&(current != null)){
       current.setNext(current);
       current.setData(value);
     }
     current = current.getNext();
   }
 }

 public String get(int index){
   Node current = start;
   int count = 0;
   for(int i = 0; i <= index ;i++){
     if ((i == index)&&(current != null)){
       return "" + current;
     }
     current = current.getNext();
    }
   return "" + current;
 }

 public String set(int index, String value){
   return "";
 }

 public String toString(){
   return "";
 }
 //Any helper method that returns a Node object MUST BE PRIVATE!
 //Don't  loop for extend; extend should be constant time; if a extends b, rip out the guts of b and give it to a
}
