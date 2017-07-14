//
// Definition for binary tree:
// class Tree<T> {
//   Tree(T x) {
//     value = x;
//   }
//   T value;
//   Tree<T> left;
//   Tree<T> right;
// }

boolean isMirror(Tree<Integer> t1,Tree<Integer> t2){
        if(t1 == null && t2 == null)
                return true;
        if(t1 != null && t2 != null && t1.value.intValue() == t2.value.intValue())
                return isMirror(t1.left,t2.right) && isMirror(t1.right,t2.left);
        return false;
}
boolean isTreeSymmetric(Tree<Integer> t) {
        return isMirror(t,t);
}

