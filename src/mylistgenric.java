import java.util.List;

public class mylistgenric<T> {
  private List<T> values;
  void add( T value){
      values.add(value);
  }
  void remove(T value){
      values.remove(value);
  }
  T get(int index){
     return  values.get(index);
  }
    public static void main(String[] args) {
mylistgenric<String> obj2 = new mylistgenric<String>();
obj2.add("value 1");
mylistgenric<Integer> obj= new mylistgenric<Integer>();
obj.add(1);
    }
}
