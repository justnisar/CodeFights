class FirstNonRepeatingCharacter{
char firstNotRepeatingCharacter(String s) {
    Pair[] array = new Pair[26];
    for(int i = 0 ; i < 26 ; i++){
        array[i] = new Pair();
    }
    for(int i = 0 ; i < s.length() ; i++){
        char ch = s.charAt(i);
        int index = ch - 'a';
        if(array[index].count == 0){
            array[index].firstOccurance = i;
        }
        array[index].count++;
    }
    int min = Integer.MAX_VALUE;
    char result = '_';
    for(int i = 0 ; i < 26 ; i++){
        if(array[i].count == 1 && array[i].firstOccurance < min){
            min = array[i].firstOccurance;
            result = (char)(i + 'a');
        }
    }
    return result;
}
}
class Pair{
    int firstOccurance;
    int count;
    public Pair(){
        firstOccurance = -1;
        count = 0;
    }
}
