package labs_examples.arrays.examples;

class ArrayList{



        public static void main(String[] args) {

//oneDArray
            int[] oneDArray = new int[10];

            for (int i = 0; i < oneDArray.length; i++) {
                oneDArray[i] = i * 14;
            }


            //System.out.println(oneDArray.length);


    //multiDArray
    int[][] multiDArray = new int[10][10];

    for (int a = 0; a < multiDArray.length; a++) {
        for (int j = 0; j < multiDArray[a].length; j++) {
            multiDArray[a][j] = a * j;
        }
    }


    //System.out.println(multiDArray[9].length);
}

}


