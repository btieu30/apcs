/*
Duolingo -- Brianna Tieu, Courtney Huang, and Xinqing Lin
APCS pd6
HW90 --
2022-04-12
time spent: hr
*/

public interface Deque<QUASAR> {
  //means of adding an element to collection:
  //Enqueue an element onto the back of this queue.
  public void addLast(QUASAR x);

  //means of adding an element to collection:
  //Enqueue an element onto the front of this queue.
  public void addFirst(QUASAR x);

  //means of removing an element from collection:
  //Dequeues and returns the last element of the queue.
  public QUASAR removeLast();

  //means of removing an element from collection:
  //Dequeues and returns the first element of the queue.
  public QUASAR removeFirst();

  public QUASAR peekFirst();

  public QUASAR peekLast();

  public int size();
}
