public class MyLinkedList{
 private int size;
 private Node start,end;
 public MyLinkedList(){
   size = 0;
   start.setData(null);
   end.setData(null);
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
   Node new_node = new Node(value);
   new_node.setNext(null);
   if(start == null){
     start.setData(value);
     end.setData(value);
   }
   else{
     Node current = start;
     while (current != null){
       current = current.getNext();
     }
     current.setNext(new_node);
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
   for(int i = 0; i <= index ;i++){
     if ((i == index)&&(current != null)){
       return "" + current;
     }
     current = current.getNext();
    }
   return "" + current;
 }

 public String set(int index, String value){
   Node current = start;
   int count = 0;
   for(int i = 0; i <= index ;i++){
     if ((i == index)&&(current != null)){
       current.setNext(current);
       current.setData(value);
     }
     current = current.getNext();
    }
   return "" + current;
  }

 public String toString(){
   String ns = "[";
   Node current = start;
   while(current != null){
     ns = ns + current.getData() + ", ";
     if (current == end) ns = ns + "]";
     current = current.getNext();
   }
   return ns;
 }
 //Any helper method that returns a Node object MUST BE PRIVATE!
 //Don't  loop for extend; extend should be constant time; if a extends b, rip out the guts of b and give it to a

 public void remove(String value){

 }

 public void remove(int index, String value){

 }

 public void extend(MyLinkedList other){

 }

}
