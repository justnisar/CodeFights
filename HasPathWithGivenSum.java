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
boolean hasPathWithGivenSum(Tree<Integer> t, int s) {
    if(t == null && s == 0)
        return true;
    if(t == null && s != 0)
        return false;
    s -= t.value;
    if(t.left == null && t.right == null && s == 0)
        return true;
    if(t.left == null && t.right == null && s != 0)
        return false;
    if(t.left == null)
        return hasPathWithGivenSum(t.right,s);
    if(t.right == null)
        return hasPathWithGivenSum(t.left,s);
    return hasPathWithGivenSum(t.left,s) || hasPathWithGivenSum(t.right,s);
}

