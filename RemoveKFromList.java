// Definition for singly-linked list:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
    ListNode<Integer> current = l;
    ListNode<Integer> result = null;
    ListNode<Integer> prev = null;
    while(current != null){
        if(current.value != k && prev == null){
            result = prev = current;
        }
        else if(current.value != k && prev != null){
            prev.next = current;
            prev = current;
        }
        else if(current.value == k && prev != null){
            prev.next = current.next;
        }
        else{
            //prev.next = null;
        }
        current = current.next;
    }

    return result;
}

