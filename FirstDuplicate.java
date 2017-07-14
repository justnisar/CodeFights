class FirstDuplicate{
int firstDuplicate(int[] a) {
    HashSet<Integer> set = new HashSet<Integer>();
    for(int i = 0 ; i < a.length ; i++){
        if(set.contains(a[i])){
            return a[i];
        }
        else{
           set.add(a[i]); 
        }
    }
    return -1;
}
}
