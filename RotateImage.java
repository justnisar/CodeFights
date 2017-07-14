class RotateImage{
int[][] rotateImage(int[][] a) {
    //transpose of a matrix
    for(int i = 0 ; i < a.length ; i++){
        for(int j = i ; j < a[0].length ; j++){
            int t = a[i][j];
            a[i][j] = a[j][i];
            a[j][i] = t;
        }
    }
    
    for(int i = 0 ; i < a.length ; i++){
        
        int start = 0;
        int end = a[0].length - 1;
        while(start < end){
            int t = a[i][start];
            a[i][start] = a[i][end];
            a[i][end] = t;
            start++;
            end--;
        }
        
        
    }
    
    
    return a;
}
}
