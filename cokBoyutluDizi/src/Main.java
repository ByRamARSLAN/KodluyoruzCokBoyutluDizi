public class Main {
    public static void main(String[] args) {

        String[][] bHarfi = new String[7][4];

        for(int i = 0; i < bHarfi.length; i++){
            for(int j = 0; j < bHarfi[i].length;  j++){
                if(i==0 || i==3 || i==6 ){
                    bHarfi[i][j] = "* ";
                    if(i==3 && j==3){     // b harfinin ortasında girinti oluşturduk.
                        bHarfi[i][j] = " ";
                        break;
                    }
                } else if (j==0 || j==3) {
                    bHarfi[i][j] = "* ";
                }
                else {
                    bHarfi[i][j] = "  ";
                }
            }
        }

        for(String[] row : bHarfi){
            for(String col : row){
                System.out.print(col);
            }
            System.out.println();
        }

    }
}